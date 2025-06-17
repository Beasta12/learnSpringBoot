package programmerzamanow.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamanow.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "programmerzamanow.spring.core.services",
        "programmerzamanow.spring.core.repositories",
        "programmerzamanow.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
