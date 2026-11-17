package in.coderarmy.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("upi")
public class UpiPayment implements PaymentServices{
    @Override
    public void pay()
    {
        System.out.println("Payment method upi");
    }
}
