package logger.models;

import logger.interfaces.Logger;

import logger.abstracts.LoggerDecorator;

import java.time.LocalDateTime;

public class TimestampLogger extends LoggerDecorator {
    public TimestampLogger(Logger logger) {
        super(logger);
    }

    public void log(String message) {
        super.log("[" + LocalDateTime.now() + "] " + message);
    }
}
