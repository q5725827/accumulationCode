package my.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.util.StopWatch;

/**
 * Created by shumei
 * Date : 16/5/16
 * Explain :
 * 耗时切面
 */
public class RtAspect {

    public Object raAround(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stop = new StopWatch();
        stop.start();
        Object ret = null;
        try {
            ret  = pjp.proceed();
        }catch (Exception e){
            System.out.println("异常是:" + e.getMessage());
        }
        stop.stop();
        System.out.println("耗时" + stop.getTotalTimeMillis() + " ms !");
        return ret;
    }

}
