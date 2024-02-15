package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동"; //문자열 객체(홍길동이라는 데이터를 가지고 있음)
        String strVar2 = "홍길동";
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar1);
        System.out.println(strVar3);

        if(strVar1 == strVar2) { //객체를 비교하는 것은 주소를 비교하는 것
            System.out.println("strVar1과 strVar2의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2의 참조가 다름");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2의 참조가 같음");
        }
        if(strVar1 == strVar3) {
            System.out.println("strVar1과 strVar3의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar3의 참조가 다름");
        }
        if(strVar1.equals(strVar3)) {
            System.out.println("strVar1과 strVar3의 참조가 같음");
        }
        if(strVar4 == strVar3) {
            System.out.println("strVar4과 strVar3의 참조가 같음");
        } else {
            System.out.println("strVar4과 strVar3의 참조가 다름");
        }
        if(strVar4.equals(strVar3)) {
            System.out.println("strVar4과 strVar3의 참조가 같음");
        }
    }
}
