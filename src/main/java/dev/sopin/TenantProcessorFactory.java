package dev.sopin;

public class TenantProcessorFactory implements AbstractProcessorFactory {

    @Override
    public Processor createProcessor() {
        return new ProcessorImpl();
    }
}
