package fr.pcbue.sandbox.jersey;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JerseyApplication.class)
@WebIntegrationTest(randomPort = true)
public class JerseyApplicationTest {

    @Value("${local.server.port}")
    private int port;

    private RestTemplate template = new TestRestTemplate();

    @Test
    public void contextLoads() throws Exception {
        ResponseEntity<String> responseEntity = template.getForEntity("http://localhost:" + port + "/hello", String.class);

        Assertions.assertThat(responseEntity.getBody()).isEqualTo("{\"field2\":\"World\"}");
        Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}