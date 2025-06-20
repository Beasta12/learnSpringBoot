package programmerzamanow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamanow.spring.core.services.MerchantService;
import programmerzamanow.spring.core.services.MerchantServiceImpl;

public class InheritanceTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    }

    @Test
    void testInheritance() {
        MerchantServiceImpl merchantService = applicationContext.getBean(MerchantServiceImpl.class);
        MerchantService merchantService1 = applicationContext.getBean(MerchantService.class);

        Assertions.assertSame(merchantService, merchantService1);
    }
}
