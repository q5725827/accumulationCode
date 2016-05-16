package my.spring.aspect.package1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shumei
 * Date : 16/5/16
 * Explain :
 */
public class ProxyedBean {

    public void alertDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("当前时间 " + simpleDateFormat.format(new Date()));
    }

    public void throwException(){
        throw new IllegalArgumentException("参数错误");
    }


}
