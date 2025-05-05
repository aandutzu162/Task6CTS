package logger.models;

import logger.interfaces.Logger;

public class BasicLogger implements Logger {
    public void log(String message) {
        System.out.println("[ERROR] " + message);
    }
}
