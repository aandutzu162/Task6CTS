package logger.models;

import logger.abstracts.LoggerDecorator;
import logger.interfaces.Logger;

public class LogLevelLogger extends LoggerDecorator implements Logger {
    private String level;

    public LogLevelLogger(Logger logger, String level) {
        super(logger);
        this.level = level;
    }

    @Override
    public void log(String message) {
        super.log("[" + level.toUpperCase() + "] " + message);
    }
}
