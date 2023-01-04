package hello.core.order;

public interface OrderService {

    Order createDrder(Long memberId, String itemName, int itemPrice);
}
