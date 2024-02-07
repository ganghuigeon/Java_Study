package ch02.sec01;

public class VariableInitialZationExample {
    public static void main(String[] args) {
        //변수 선언(메모리에 값이 할당 되지 않음)
        int value;

        value = 20; //메모리에 값이 할당된다.

        //변수 선언과 동시에 값을 할당(메모리에 값이 할당됨)
        int value2 = 10;

        System.out.println("value 값: " + value); // ctrl + d 누르면 현재 라인 값을 바로 아래에 복사해줌
        System.out.println("value2 값: " + value2);
    }
}
