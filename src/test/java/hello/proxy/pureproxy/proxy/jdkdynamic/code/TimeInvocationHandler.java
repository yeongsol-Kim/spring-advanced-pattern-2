package hello.proxy.pureproxy.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class TimeInvocationHandler implements InvocationHandler {

    private final Object target;

    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        log.info("TimeProxy 실행");
        long startTIme = System.currentTimeMillis();

        Object result = method.invoke(target, args);

        long endTIme = System.currentTimeMillis();
        long resultTime = endTIme - startTIme;
        log.info("TimeProxy 종료 resultTime={}", resultTime);
        return result;
    }
}
