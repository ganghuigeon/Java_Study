package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","박봉팔");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final(상수) 필드는 값을 변경 할 수 없다.
        /*k1.nation="United States of America";
        k1.ssn="123-45-6789";*/
    }
}
