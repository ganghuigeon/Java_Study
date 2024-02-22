package ch07.sec10.exam02;

public abstract class Animal {
    //일반 메소드 구현
    public void breathe() {
        System.out.println("숨 쉰다.");
    }
    //추상 메소드(abstract method) 구현 -> 선언부만
    //오버라이드 용으로만 사용
    public abstract void sound();
}
