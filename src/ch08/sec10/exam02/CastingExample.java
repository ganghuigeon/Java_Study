package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus(); // 자동타입변환
        vehicle.run();

        // 자식 클래스의 메소드를 호출하기 위해 강제타입변환
        Bus bus = (Bus) vehicle;
        bus.run(); //오버라이드 된 부분은 정상적을 출력할 수 있음
        bus.checkFare(); // 자식 클래스에 가지고 있는 값은 호출 할 수 없음
    }
}
