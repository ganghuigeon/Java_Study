package ch07.sec05.exam02;

public class Car {
    public int speed;
    public void sppedUp() {
        speed++;
    }
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
