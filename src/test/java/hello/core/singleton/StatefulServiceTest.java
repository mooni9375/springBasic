package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    @DisplayName("Stateful Test")
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService service1 = ac.getBean(StatefulService.class);
        StatefulService service2 = ac.getBean(StatefulService.class);

        service1.order("userA", 10000);
        service2.order("userB", 20000);

        int price = service1.getPrice();
        System.out.println("price = " + price);

        Assertions.assertThat(service1.getPrice()).isEqualTo(20000);

    }

    @Test
    @DisplayName("Stateless Test")
    void statelessServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatelessService service1 = ac.getBean(StatelessService.class);
        StatelessService service2 = ac.getBean(StatelessService.class);

        int userA = service1.order("userA", 10000);
        int userB = service2.order("userB", 20000);

        Assertions.assertThat(userA).isNotEqualTo(userB);


    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }

        @Bean
        public StatelessService statelessService() {
            return new StatelessService();
        }
    }
}
