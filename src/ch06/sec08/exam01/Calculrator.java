package ch06.sec08.exam01;

public class Calculrator {
    //필드 생략
    //생성자 생략
    //메소드(기능)

    //전원 켜기
    //리턴해줄 값이 없을 때는 void 키워드를 사용
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    //전원 끄기
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    //더하기
    int plus(int x, int y) {
        int result = x + y;
        return result; //int 형
    }

    //빼기
    int subtract(int x, int y) {
        int result = x - y;
        return result; //int 형
    }

    long multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    //나누기
    double divide(int x, int y) {
        double result = (double) x / y;
        return result; //double 형
    }

    //내부 클래스에서 메소드 호출 가능
    void innerMethod() {
        powerOn();
        int result = plus(3,5);
        System.out.println("내부 클래스 plus 결과: " + result);
    }
}
