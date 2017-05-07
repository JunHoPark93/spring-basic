package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Jun Ho Park on 2017-05-02.
 */

@Component("tv")
public class LgTV implements TV {
    //@Autowired
    //@Qualifier("sony")
    //@Resource(name="apple")
    private Speaker speaker;

    public void powerOn() {
        System.out.println("LG 전원켠다");
    }

    public void powerOff() {
        System.out.println("LG 전원 끈다");
    }

    public void volumeUp() {
        //System.out.println("LG 소리 올린다");
        speaker.volumeUp();
    }

    public void volumeDown() {
        //System.out.println("LG 소리 내린다");
        speaker.volumeDown();
    }
}
