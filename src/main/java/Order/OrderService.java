package Order;

public interface OrderService {
    Order createOrder(Long memberid, String itemName, int itemPrice);
}
