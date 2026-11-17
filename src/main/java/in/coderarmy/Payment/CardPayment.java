package in.coderarmy.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("cp")

public class CardPayment implements PaymentServices{
    @Override
    public void pay()
    {
        System.out.println("Card Payment Method Called");
    }
}
