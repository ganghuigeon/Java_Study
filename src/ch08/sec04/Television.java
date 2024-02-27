package ch08.sec04;

public class Television implements RemoteControl {

    private int volume; // 텔레비젼 클래스의 볼륨

    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
