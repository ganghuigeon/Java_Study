package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        //값 자체는 전위든 후위든 증가와 감소값이 적용된다
        x++;
        System.out.println("x= " + x);
        ++x;
        System.out.println("x= " + x);
        y--;
        System.out.println("y= " + y);
        --y;
        System.out.println("y= " + y);

        System.out.println("--------------------------------");

        z = x++; //변수에 사용할 때에는 자바스크립트처럼 출력 먼저 발생한 후 연산이 진행된다.
        //후위연산자 변수에 대입할 때 주의
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("=========================");
        z = ++x;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("=========================");
        z = ++x + y++;
        //x이전까지의 값은 14, 전위 연산자이므로 1을 더해 15를 출력
        //y이전까지의 값은 8, 후위 연산자이므로 8을 출력 후 1을 더함
        //z는 23의 값을 출력된 후
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
