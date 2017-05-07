package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Jun Ho Park on 2017-05-02.
 */
public class TVUser {
    public static void main(String[] args) {
        /*//TV tv = new SamsungTV();
        BeanFactory factory = new BeanFactory();
        TV tv = (TV) factory.getBean(args[0]);
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();*/
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");
        TV tv = (TV) factory.getBean("tv");
        /*TV tv2 = (TV) factory.getBean("tv");
        TV tv3 = (TV) factory.getBean("tv");
        *//*tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
*/
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
        factory.close();
    }
}
