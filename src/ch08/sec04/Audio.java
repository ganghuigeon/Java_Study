package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");
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
        System.out.println("현재 오디오 볼륨: " + this.volume);
    }

    private int memoryVolume; //원래 볼륨을 저장

    //public 접근제한자는 반드시 있어야 하며, default는 생략함
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다");
            setVolume(this.memoryVolume);//무음 해제 후 원래 볼륨을 되돌림
        }
    }
}
