package ch05.sec04;

public class GarbageExample {
    public static void main(String[] args) {
        String  hobby = "여행";
        hobby = null; //String 객체를 쓰레기 객체로 만듦
        
        String kind1 = "자동차";
        String kind2 = kind1; //주소의 복사 참조타입은 값을 가져오는 게 아니라 주소를 가져온다는 것을 명심
        kind1 = null; //String 객체는 쓰레기 객체가 되지 않음
        System.out.println(kind2);
    }
}
