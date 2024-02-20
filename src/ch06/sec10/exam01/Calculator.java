package ch06.sec10.exam01;

public class Calculator {

    //static을 붙이면 객체를 생성하지 않아도 된다.
   static double pi = 3.13159;

    static int plus(int x, int y) {
        return x + y;
    }
    static int minus(int x, int y) {
        return  x - y;
    }
}
