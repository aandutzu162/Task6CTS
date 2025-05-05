package logger.models;

import logger.interfaces.Logger;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = new ThreadIdLogger(
                new TimestampLogger(
                        new LogLevelLogger(
                                new BasicLogger(), "warn")));

        logger.log("Disk space low.");

    }
}
