package programmerzamanow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.client.PaymentGatewayClient;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    }

    @Test
    void testFactoy() {
        PaymentGatewayClient client = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(client);
        Assertions.assertEquals("https://example.com", client.getEndpoint());
        Assertions.assertEquals("private", client.getPrivateKey());
        Assertions.assertEquals("public", client.getPublicKey());
    }
}
