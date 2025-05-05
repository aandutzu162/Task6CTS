package logger.models;

import logger.interfaces.Logger;
import logger.abstracts.LoggerDecorator;

public class ThreadIdLogger extends LoggerDecorator {
    public ThreadIdLogger(Logger logger) {
        super(logger);
    }

    public void log(String message) {
        super.log("[Thread-" + Thread.currentThread().getId() + "] " + message);
    }
}
