package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원입니다.");
                break;
            default:
                System.out.println("비회원입니다.");
        }
    }
}
