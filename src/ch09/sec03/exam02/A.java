package ch09.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;
        static int field2 = 2; //정적필드 jdk17부터 가능

        B() {
            System.out.println("B-Constructor Initiating");
        }

        void method1() {
            System.out.println("B-me.thod1 Initiating");
        }

        //중첩클래스 정적메소드 jdk17부터 사용가능
        static void method2() {
            System.out.println("B-me.thod2 Initiating");
        }
    }
}
