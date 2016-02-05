package fr.pcbue.sandbox.jersey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Value("${message:World}")
    private String msg;

    public Data message() {
        return new Data(msg, msg);
    }
}
