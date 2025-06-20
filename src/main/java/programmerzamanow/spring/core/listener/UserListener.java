package programmerzamanow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import programmerzamanow.spring.core.event.LoginSuccessEvent;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessListener(LoginSuccessEvent event) {
        log.info("Succes login gor user {}", event.getUser());
    }
}
