package in.coderarmy;

import org.example.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

//        PaymentServices paymentServices = new PaymentServices();
//
//        OrderServices order = new OrderServices(paymentServices);
//        order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderServices orderServices = context.getBean(OrderServices.class);
//        orderServices.placeOrder();

//        User user = context.getBean(User.class);
//       System.out.println( user.getName());
//        System.out.println(user.getAge());
//
//        Demo demo = context.getBean(Demo.class);



//
        PaymentServices paymentServices = context.getBean(PaymentServices.class);
        paymentServices.pay();
    }
}
