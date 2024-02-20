package ch06.sec13.exam03.package02;

import ch06.sec13.exam03.package01.A;

public class C {
    //다른 패키지 내에 있는 피르에 접근하기
    A a = new A();
    //a.field1 =1;
    //a.field2 =1;//같은 패키지에서만접근가능
    //a.field3 = 1; // private 접근제한자는 같은 클래스에서만 접근 가능
    //같은 클래스 내에 있는 메소드에 접근하기
      //  a.method1();
        //a.method2();//같은 패키지에서만 접근 가능
    //a.method3(); //private 전근제한자는 같은 글레서으세먼 접근 가능
}
