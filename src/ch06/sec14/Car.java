package ch06.sec14;

public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            //speed가 0 미만이면 필드의 값을 0으로 변경
            this.speed = 0;
            return; //메.소드를 끝낸다.
        } else {
            //speed가 0 이상이면 필드이 값을 매개변수 speed 값으로 변경
            this.speed = speed;
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;  //자동차가 멈추었는지

        //차가 멈추면 speed를 0으로 만든다.
        if(stop) this.speed = 0;
    }

    public boolean isStop() {
        return stop;
    }

    private boolean stop;


}
