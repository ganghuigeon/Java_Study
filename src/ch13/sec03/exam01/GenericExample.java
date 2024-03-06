package ch13.sec03.exam01;

public class GenericExample {
    //제네릭 메소드, 리턴타입이 제네릭인 경우 무적권 <T>선언대상<T>을 해주어야 한다
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        Box<String> box2 = boxing("홍길동");

        System.out.println(box1.getT());
        System.out.println(box2.getT());
    }
}
