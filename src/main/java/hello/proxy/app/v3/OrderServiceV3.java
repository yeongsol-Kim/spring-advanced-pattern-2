package hello.proxy.app.v3;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderRepository;

    public OrderServiceV3(OrderRepositoryV3 repositoryV3) {
        this.orderRepository = repositoryV3;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
