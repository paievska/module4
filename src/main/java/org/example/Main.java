package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import javax.management.StandardMBean;
import javax.management.ObjectName;
import javax.management.MBeanServer;
import javax.management.NotCompliantMBeanException;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import java.lang.management.ManagementFactory;

import static org.example.StringTransformer.transformString;

public final class Main {
    private Main() {
    }
    /**
     * Add LOGGER.
     */
    private static final Logger LOGGER = LogManager
            .getLogger(Main.class);

    /**
     * Main method.
     *
     * @param args User arguments
     */
    public static void main(final String[] args) throws
            NotCompliantMBeanException, InstanceAlreadyExistsException,
            MBeanRegistrationException, MalformedObjectNameException {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String output = transformString(input);
        MyMBeanImpl bean = new MyMBeanImpl();
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        StandardMBean mbean = new StandardMBean(new MyMBeanImpl(),
                MyMBean.class);
        ObjectName name = new ObjectName("org.example:type=MyMBean");
        mbs.registerMBean(mbean, name);
        if (bean.isLoggerEnabled()) {
            LOGGER.info("Вхідний рядок: {}", input);
            LOGGER.debug("Результат перетворення: {}", output);
        } else {
            System.out.println("Вхідний рядок: " + input);
            System.out.println("Результат перетворення: " + output);
        }
    }
}
