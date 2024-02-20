package ch06.sec13.exam03.package01;

public class A {
    //필드, 메소드에 접근 제한자 걸기
    public int field1; //모든 클래스, 패키지에서 접근 가능
    int field2; //같은 클래스, 같은 패키지에서 접근 가능
    private int field3; //같은 클래스에서만 접근 가능

    public A() {
        //같은 클래스 내에 있는 필드에 접근하기
        field1 = 1;
        field2 = 1;
        field3 = 1;
        //같은 클래스 내에 있는 메소드에 접근하기
        method1();
        method2();
        method3();
    }

    ;

    public void method1() {
    }

    void method2() {
    }

    private void method3() {
    }

}


