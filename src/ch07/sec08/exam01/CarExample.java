package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //자동타입변환이 일어난다
        myCar.tire = new Tire(); // Tire tire = new Tire()
        myCar.run();

        myCar.tire = new HankookTire(); // Tire tire = new HankookTire() 와 같다
        myCar.run(); //tire.roll`(); => 오버라이드된 메.소드가 있다면 자식클래스에 있는 메.소드 사용

        myCar.tire = new KumhoTire(); //Tire tire = new KimhoTire();와 같다
        myCar.run();//tire.roll(); -> 오버라이드된 메소드가 있으면 자식클래스에 있는 메소드 사용

    }
}
