package ch13.sec01;

public class Box<T> {
    //T: 타입이 아무것도 정해지지 않음
//public Object content; //String, Integer... 등등의 다른 여러
// 클래스들의 최상위 클래스 Object

    public T content;

    //꺾쇠를 클래스 명에 붙이고 그 사이에 A~Z까지의 아무것도 정해재지지 않은
    //임의의 변수를 써주면 이후에 클래서에서 사용가능해진다.
}
