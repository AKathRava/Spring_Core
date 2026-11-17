package in.coderarmy;


import in.coderarmy.Payment.CardPayment;
import in.coderarmy.Payment.PaymentServices;
import org.example.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("in.coderarmy")
public class AppConfig {

    @Bean
    public User user()
    {
        return new User("aadi",19);
    }

    @Bean
    public Demo demo()
    {
        return new Demo();
    }

    @Bean
    public PaymentServices cardPaymentServices()
    {
        return new CardPayment();
    }


}
