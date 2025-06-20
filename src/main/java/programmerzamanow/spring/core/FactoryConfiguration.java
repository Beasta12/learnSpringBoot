package programmerzamanow.spring.core;

import org.springframework.context.annotation.Import;
import programmerzamanow.spring.core.factory.PaymentGatewayClientFactoryBean;

@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
