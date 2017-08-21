package tdd;

/**
 * Created by yteng on 8/21/17.
 */
public interface PaymentGateway {

    public void pay(int orderId, int price);
}
