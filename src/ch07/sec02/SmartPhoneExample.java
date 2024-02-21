package ch07.sec02;


public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "다크그린");

        //Phone 클래스로 부터 상속받은 필드 사용 가능
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        //smartPhone 클래스의 필드 읽기
        System.out.println("d와이파이 상태: " + myPhone.wifi);

        //Phone으로 부터 상속받은 메.소드 사용가능
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("여보가 아닙니다. 박봉팔입니다.");
        myPhone.sendVoice("반갑습니다.");
        myPhone.hangUp();

        //smartPhone의 메.소드 사용
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
