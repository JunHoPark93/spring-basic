package polymorphism;

/**
 * Created by Jun Ho Park on 2017-04-30.
 */
public class SamsungTV implements TV{

    private Speaker speaker;
    private int price;

    public SamsungTV() {
        System.out.println("삼성 티비 객체 생성자");
    }

    /*// 주입 테스트
    public SamsungTV(Speaker speaker) {
        System.out.println("삼성 티비 객체 생성 2 with 소니스피커");
        this.speaker = speaker;
    }

    public SamsungTV(Speaker speaker, int price) {
        System.out.println("삼성 티비 객체생성 3");
        this.speaker = speaker;
        this.price = price;
    }*/

    public void setSpeaker(Speaker speaker) {
        System.out.println("setSpeaker called!");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("setPrice called!");
        this.price = price;
    }



    public void powerOn() {
        System.out.println("Samsung 전원켠다 + 가격 = "+price );
    }

    public void powerOff() {
        System.out.println("Samsung 전원끈다");
    }

    public void volumeUp() {
        /*speaker = new SonySpeaker();
        speaker.volumeUp();*/
        //System.out.println("Samsung 소리 올린다");
        speaker.volumeUp();
    }

    public void volumeDown() {
        /*speaker = new SonySpeaker();
        speaker.volumeDown();*/
        //System.out.println("Samsung 소리 내린다");
        speaker.volumeDown();
    }
}
