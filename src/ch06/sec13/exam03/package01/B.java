package ch06.sec13.exam03.package01;

public class B {
    //객체를 생성해서 사용하기 위해 필요함
    public  void method() {
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1; // private 접근제한자는 같은 클래스에서만 접근 가능
        //같은 클래스 내에 있는 매ㅔ소드에 접근하기
        a.method1();
        a.method2();
        //a.method3(); //private 전근제한자는 같은 글레서으세먼 접근 가능
    }
}
