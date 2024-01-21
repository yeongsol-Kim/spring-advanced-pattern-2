package hello.proxy.app.v3;

import hello.proxy.app.v2.OrderRepositoryV2;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryV3 {
    public void save(String itemId) {
        //저장 로직
        if (itemId.equals("ex")) {
            throw new IllegalArgumentException("예외 발생!");
        }
        sleep(1000);

    }

    private void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
