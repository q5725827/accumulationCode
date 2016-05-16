package my.spring;

import my.spring.aspect.package1.ProxyedBean;
import my.spring.aspect.package2.ProxyedBean2;
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
//        proxyedBean.throwException();
        ProxyedBean2 proxyedBean2 = (ProxyedBean2)applicationContext.getBean("proxyedBean2");
        proxyedBean2.alertDate();
    }
}
