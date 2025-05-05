package logger.abstracts;

import logger.interfaces.Logger;

public abstract class LoggerDecorator implements Logger {
    protected Logger wrappee;

    public LoggerDecorator(Logger logger) {
        this.wrappee = logger;
    }

    public void log(String message) {
        wrappee.log(message);
    }
}
