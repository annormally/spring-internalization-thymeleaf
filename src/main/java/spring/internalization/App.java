package spring.internalization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.internalization.config.Internalization;

/**
 * App container!
 */

@SpringBootApplication
@Import({Internalization.class})
public class App {

    public static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Container start ...");
        SpringApplication.run(App.class);
    }
}
