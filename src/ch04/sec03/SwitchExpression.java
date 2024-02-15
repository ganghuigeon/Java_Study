package ch04.sec03;

public class SwitchExpression {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            //case문 중괄호 안에 실행문이 하나만 있을 떄는 중괄호를 생략할 수 있다.
            case 'A', 'a' -> System.out.println("우수회원입니다.");
            case 'B', 'b' -> System.out.println("일반회원입니다.");
            default -> System.out.println("비회원입니다.");

        }
    }
}
