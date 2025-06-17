package programmerzamanow.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamanow.spring.core.data.Bar;
import programmerzamanow.spring.core.data.Foo;
import programmerzamanow.spring.core.data.FooBar;

import javax.swing.text.html.Option;
import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
