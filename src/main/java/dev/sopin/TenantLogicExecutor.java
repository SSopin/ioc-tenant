package dev.sopin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TenantLogicExecutor extends BusinessLogicExecutor {

    private static final Logger logger = LoggerFactory.getLogger(TenantLogicExecutor.class);

    @Override
    protected AbstractProcessorFactory getFactory() {
        return new TenantProcessorFactory();
    }

    protected Logger getLogger() {
        return logger;
    }
}
