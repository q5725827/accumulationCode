package my.spring;

import my.spring.aspect.ProxyedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shumei
 * Date : 16/5/16
 * Explain :
 */
public class SpringMain {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        ProxyedBean proxyedBean = (ProxyedBean)applicationContext.getBean("proxyedBean");
        proxyedBean.alertDate();
        proxyedBean.throwException();
    }
}
