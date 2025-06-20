package programmerzamanow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamanow.spring.core.event.LoginSuccessEvent;
import programmerzamanow.spring.core.listener.LoginAgainSuccessListener;
import programmerzamanow.spring.core.listener.LoginSuccessListener;
import programmerzamanow.spring.core.listener.UserListener;
import programmerzamanow.spring.core.services.UserService;

public class EventListenerTest {
    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration{

    };

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEVent() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("eko", "eko");
        userService.login("bejo", "bejo");
        userService.login("putin", "putin");
    }
}
