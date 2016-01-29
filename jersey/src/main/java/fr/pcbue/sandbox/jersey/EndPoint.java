package fr.pcbue.sandbox.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class EndPoint {

    private Service service;

    @Autowired
    public EndPoint(Service service) {
        this.service = service;
    }

    @GET
    public String message() {
        return service.message();
    }
}
