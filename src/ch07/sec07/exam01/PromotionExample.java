package ch07.sec07.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //자동타입변환

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;
    //조상과 부모객체가 아닌 객체를 상속 받을 수 없음
//    B b3 = e;
//    C c2 = d;
}
