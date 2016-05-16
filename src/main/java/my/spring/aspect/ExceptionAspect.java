package my.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * Created by shumei
 * Date : 16/5/16
 * Explain :
 */
public class ExceptionAspect {

    public void doRecoveryActions(Throwable throwable){
        System.out.println("抛出异常:" + throwable.getMessage());
    }
}
