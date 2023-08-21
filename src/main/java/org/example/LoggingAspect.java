package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    /**
     * Add LOGGER.
     */
    private static final Logger LOGGER = LogManager
            .getLogger(LoggingAspect.class);

    /**
     * Method that print sentence before.
     *
     * @param input The start method
     */
    @Before("execution(* org.example.StringTransformer"
            + ".transformString(String)) && args(input)")
    public void beforeTransformString(final String input) {
        LOGGER.info("Вхідний рядок: {}", input);
    }

    /**
     * Method that print sentence after.
     *
     * @param input The transformed method
     */
    @AfterReturning("execution(* org.example.StringTransformer"
            + ".transformString(String))  && args(input)")
    public void afterTransformString(final String input) {
        String transformed = StringTransformer.transformString(input);
        LOGGER.debug("Результат перетворення: {}", transformed);
    }
}

