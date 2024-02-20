package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGasoline(5); //주유
        System.out.println("현재 기름양: " + myCar.gasoline);

        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("기름을 주유하세요");
    }
}
