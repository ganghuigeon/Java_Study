package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //계산기 객체 생성
        Calculrator myCal = new Calculrator();

        //계산기 전원 on
        myCal.powerOn();

        //메소드의 return 타입과 같게 결과를 받을 변수 타입을 작성해준다.
        int result1 = myCal.plus(10,2);
        System.out.println("plus: " + result1);
        //변수 타입이 다르면 변환 불가라면서 오류 발생함

        int result2 = myCal.subtract(10,2);
        System.out.println("subtract: " + result2);

        long result3 = myCal.multiply(10,2 );
        System.out.println("multiply: " + result3);

        int x = 10;
        int y = 2;
        double result4= myCal.divide(x,y);
        System.out.println("divide: " + result4);

        //계산기 전원 off
        myCal.powerOff();
        System.out.println("");

        myCal.innerMethod();

    }
}
