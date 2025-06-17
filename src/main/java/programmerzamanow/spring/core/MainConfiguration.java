package programmerzamanow.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamanow.spring.core.configuration.BarConfiguration;
import programmerzamanow.spring.core.configuration.FooConfiguration;

@Configuration
@ComponentScan(basePackages = {
        "programmerzamanow.spring.core.configuration"
})
public class MainConfiguration {
}
