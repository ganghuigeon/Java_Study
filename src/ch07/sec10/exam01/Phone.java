package ch07.sec10.exam01;

// abstract를 쓴 클라스는 오로지 상속만을 위한 클라스(객체생성 불가)
public abstract class Phone {
    String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
