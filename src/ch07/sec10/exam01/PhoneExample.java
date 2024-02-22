package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //abstact 클래스는 객체 생성 불가
        //Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("봉팔");
        smartPhone.turnOn(); //Phone의 메소드
        smartPhone.internetSearch(); //SmartPhone의 메소드
        smartPhone.turnOff(); //Phone의 메소드

    }
}
