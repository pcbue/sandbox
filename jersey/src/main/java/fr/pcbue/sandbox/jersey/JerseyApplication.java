package fr.pcbue.sandbox.jersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class JerseyApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JerseyApplication.class);
    }

    public static void main(String... args) {
        new JerseyApplication()
            .configure(new SpringApplicationBuilder(JerseyApplication.class))
            .run(args);
    }
}
