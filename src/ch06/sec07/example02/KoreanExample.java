package ch06.sec07.example02;

public class KoreanExample {
    public static void main(String[] args) {
        //객체가 생성이 될 때 생성자가 실행이 되고 필드에 값이 할당된다.
        Korean k1 = new Korean("박봉팔","020202-3456789"); //첫째
        System.out.println("박봉팔씨 이름: " + k1.name);
        System.out.println("박봉팔씨 주민번호: " + k1.ssn);
        System.out.println("박봉팔씨 국가: " + k1.nation);
        Korean k2 = new Korean("박춘배","040506-3456789"); //둘째
        System.out.println("박춘배씨 이름: " + k2.name);
        System.out.println("박춘배씨 주민번호: " + k2.ssn);
        System.out.println("박춘배씨 국가: " + k2.nation);
    }
}
