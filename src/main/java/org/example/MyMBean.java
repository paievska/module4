package org.example;

public interface MyMBean {
    /**
     * Method that work when logger is enabled.
     */
    void enableLogger();
    /**
     * Method that work when logger isn't enabled.
     */
    void disableLogger();
    /**
     * Method that check logger is enabled or no.
     * @return boolean true when logger is enabled and false otherwise
     */
    boolean isLoggerEnabled();
}
