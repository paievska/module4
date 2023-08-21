package org.example;

public class MyMBeanImpl implements MyMBean {
    /**
     * initial logger.
     */
    private boolean loggerEnabled = true;

    /**
     * The method that work when logger is enabled.
     */
    @Override
    public void enableLogger() {
        loggerEnabled = true;
    }

    /**
     * The method that work when logger is disabled.
     */
    @Override
    public void disableLogger() {
        loggerEnabled = false;
    }

    /**
     * The method that check is logger enabled or no.
     *
     * @return boolean true when logger is enabled and false otherwise
     */
    @Override
    public boolean isLoggerEnabled() {
        return loggerEnabled;
    }
}

