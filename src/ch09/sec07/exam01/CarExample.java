package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();
        car.run3(new Tire() { //한국 타이어 클래스가 됨(익명 개체(이름없는 개체))
            @Override
            public void roll() {
                System.out.println("한국 타이어 굴러가유");
            }
        });
    }
}
