package dev.sopin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TenantApp {

    private static final Logger logger = LoggerFactory.getLogger(TenantApp.class);

    public static void main(String[] args) {
        logger.info("Starting application...");

        TenantLogicExecutor executor = new TenantLogicExecutor();
        executor.run();
    }
}
