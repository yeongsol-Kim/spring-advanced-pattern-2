package hello.proxy.common.advice;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class TimeAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("TimeProxy 실행");
        long startTIme = System.currentTimeMillis();

//        Object result = method.invoke(target, args);
        Object result = invocation.proceed();

        long endTIme = System.currentTimeMillis();
        long resultTime = endTIme - startTIme;
        log.info("TimeProxy 종료 resultTime={}", resultTime);
        return result;
    }
}
