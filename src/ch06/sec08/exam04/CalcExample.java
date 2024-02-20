package ch06.sec08.exam04;

public class CalcExample {
    public static void main(String[] args) {
        Calc mycalc = new Calc();
        //정사각형의 너비
        double result1 = mycalc.areaRectangle(10);

        //직사각형의 너비
        double result2 = mycalc.areaRectangle(10,20);

        System.out.println("정사각형의 너비: " + result1);
        System.out.println("직사각형의 너비: " + result2);
    }
}
