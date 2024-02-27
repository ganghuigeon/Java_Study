package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run(); //기존 카 클래스에서는 한국 타이어가 굴러갑니다를 적용했기에, 한국타이어가 굴러갑니다가 출력

        // 타이어 교체(다형성)
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
