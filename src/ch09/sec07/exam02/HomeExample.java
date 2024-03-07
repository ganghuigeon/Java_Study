package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
    Home home = new Home();
    home.use1();
    home.use2();
    home.use3(new RemoteControl() {
        //tv클래스
        @Override
        public void turnOn() {
            System.out.println("레디오 킵니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("레디오 끕니다.");
        }
    });

    }
}
