public interface PaymentGateway {
    public void processPayment();
}

public class PayPalGateway implements PaymentGateway {
    // implementation of processPayment method using PayPal API
}

public class CreditCardGateway implements PaymentGateway {
    // implementation of processPayment method using credit card API
}

public class Order {
    private PaymentGateway paymentGateway;
    
    public Order(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    
    public void checkout() {
        paymentGateway
    }
}