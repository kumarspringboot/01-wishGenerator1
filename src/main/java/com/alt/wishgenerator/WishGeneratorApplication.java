package com.alt.wishgenerator;

import com.alt.wishgenerator.service.wishGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication is a shortcut for:
 *  - @Configuration: allows defining beans and settings
 *  - @EnableAutoConfiguration: enables automatic configuration based on classpath
 *  - @ComponentScan: automatically scans for components in this package and subpackages
 */

@SpringBootApplication
public class WishGeneratorApplication {

    public static void main(String[] args) {
        // Bootstraps the Spring Application and returns the application context
        ConfigurableApplicationContext run = SpringApplication.run(WishGeneratorApplication.class, args);

        // Manually fetches the bean of type wishGenerator from the Spring context
        wishGenerator wishG = run.getBean(wishGenerator.class);
        wishG.wishGenerator();// Calls a custom method in the bean
    }

}
