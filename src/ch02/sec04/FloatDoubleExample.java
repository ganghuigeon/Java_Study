package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도(double > float)
        //기본적으로 컴파일러는 실수 리터럴을 double로 인식, F를 붙여 반드시 float타입을 사용하겠음을 알려줘야함
        float var1 = 0.1234567890123456789F; //실수형은 리터럴을 double타입으로 인식하므로 float형은 반드시 F를 붙여준다
        double var2 = 0.1234567890123456789;

        System.out.println(var1);
        System.out.println(var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3 * 10^6
        System.out.println("var3: " + var3);

        float var4 = 3e6F;//float타입이다 보니 f를 쓴 것으로 사실 var3의 내용과 같다
        System.out.println("var4: " + var4);

        double var5 = 20e-3; // 2 * 10^-3
        System.out.println("var5: " + var5);
    }
}
