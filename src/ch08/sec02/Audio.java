package ch08.sec02;

public class Audio implements RemoteControl{
    //인터페이스 리모트컨트롤을 상속받음
    @Override
    public void trunOn() {
        System.out.println("Audio를 켭니다.");
    }
}
