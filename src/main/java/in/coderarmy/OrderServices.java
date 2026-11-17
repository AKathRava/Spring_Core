package in.coderarmy;

import in.coderarmy.Payment.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServices {


//    @Autowired   Not Recommended
//    private PaymentServices paymentServices;

    private PaymentServices paymentServices;

    //Recommended
//    @Autowired
//    public OrderServices(@Qualifier("cardPayment") PaymentServices paymentServices) {
//        this.paymentServices = paymentServices;
//    }  //in Qualifier using the name of bean always in camel case


    public OrderServices(@Qualifier("upi") PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
   } //custom name for Qualifier


//    @Autowired
//    public void setPaymentServices(PaymentServices paymentServices) {
//        this.paymentServices=paymentServices;
//    }

    public void placeOrder() {

        paymentServices.pay();
        System.out.println("Order placed");
    }
}
