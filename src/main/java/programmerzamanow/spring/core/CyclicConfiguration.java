package programmerzamanow.spring.core;

import org.springframework.context.annotation.Bean;
import programmerzamanow.spring.core.cyclic.CyclicA;
import programmerzamanow.spring.core.cyclic.CyclicB;
import programmerzamanow.spring.core.cyclic.CyclicC;

public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
