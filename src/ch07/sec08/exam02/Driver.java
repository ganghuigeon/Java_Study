package ch07.sec08.exam02;

public class Driver {
    //메.소드의 매개변수를 통해 자동타입변환이 일어남
    public void drive(Vehicle vehicle) { //Vehicle vehicle = new Bus();
        //만일 Car로 실행했다면 //Vehicle vehicle = new Car();로 자동 타입 변환이 일어난다.
        vehicle.run();
    }
}
