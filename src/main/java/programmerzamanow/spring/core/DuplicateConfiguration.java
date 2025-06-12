package programmerzamanow.spring.core;

import org.springframework.context.annotation.Bean;
import programmerzamanow.spring.core.data.Foo;

public class DuplicateConfiguration {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
