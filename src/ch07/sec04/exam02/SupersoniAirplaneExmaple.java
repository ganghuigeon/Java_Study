package ch07.sec04.exam02;

public class SupersoniAirplaneExmaple {
    public static void main(String[] args) {
        SupersonicAirplane sanic = new SupersonicAirplane();
        sanic.takeoff();
        sanic.fly();
        sanic.flyMode = SupersonicAirplane.SUPERSONIC;
        sanic.fly();
        sanic.flyMode = SupersonicAirplane.NORMAL;
        sanic.fly();

    }

}

