package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        boolean result1 = (x == 20); //x의 값이 20과 같은가? false출력
        boolean result2 = (x != 20); //x의 값이 20과 다른가? true출력

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        boolean stop = false;

        if(stop) {
            System.out.println("중지합니다.");
        }else {
            System.out.println("실행합니다.");
        }
    }
}
