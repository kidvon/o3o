/*
 * This source file was generated by the Gradle 'init' task
 */
package org.cv;

import com.aizuda.snailjob.client.starter.EnableSnailJob;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.cv"})
@Log4j2
//@EnableSnailJob
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        log.info("Application started");
    }
}
