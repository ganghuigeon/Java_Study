package ch07.sec03.exam01;

public class SmartPhone extends Phone{
    public SmartPhone(String model, String color) {
        super(model, color); //부모 객체의 생성자 실행, 생략 가능(부모 생성자의 매개 변수가 없다면 생략 가능한 점 참고), 컴파일시 자동 추가됨
        //부모 생성자의 매개변수가 있다면, 생략 불가

//        this.model = model;
//        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
