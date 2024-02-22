package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A {

    public D() {
        super(); //부모 클래스의 생성자를 호출
    }
    public void method1() {
        //상속관계일때 protected 접근제한자가 있는 필드와 메소드를 사용할 수 있음
        this.field = "value";
        super.method();
    }
    public void method2() {
        //★직접 객체를 생성해서 사용하는 것은 불가하다.
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

}
