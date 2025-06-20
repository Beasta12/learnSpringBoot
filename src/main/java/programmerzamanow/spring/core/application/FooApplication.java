//package programmerzamanow.spring.core.application;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import programmerzamanow.spring.core.data.Bar;
//import programmerzamanow.spring.core.data.Foo;
//import programmerzamanow.spring.core.listener.AppStartingLIstener;
//
//import java.util.List;
//
//@SpringBootApplication
//public class FooApplication {
//
//    //    @Bean
////    public Foo foo(Bar bar) {
////        return new Foo();
////    }
//    @Bean
//    public Foo foo() {
//        return new Foo();
//    }
//
////    public static void main(String[] args) {
////        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
////
////        Foo foo = applicationContext.getBean(Foo.class);
////        System.out.println(foo);
////    }
//
//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setListeners(List.of(new AppStartingLIstener()));
//
//        ConfigurableApplicationContext applicationContext = application.run(args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
//}
