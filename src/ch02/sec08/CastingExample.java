package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        //강제타입변환(int -> byte)
        int var1 = 103029770;
        byte var2 = (byte) var1; // byte -128 ~ 127까지 표현할 수 있다보니, 데이터 손실을 발생시킴
        System.out.println("var2: " + var2);

        //강제타입 변환(long -> int) downsizing
        long var3 = 300000000000L;
        int var4 = (int) var3;
        System.out.println("var4: " + var4);
        //압도적으로 큰 값의 차이가 발생했을 때, 오버플로우 혹은 언더플로우 현상 발생

        //강제타입 변환(int -> char)
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println("var6: " + var6);
        
        //강제타입 변환(실수 -> 정수), 소숫점 이하는 절삭된다
        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println("var8: " + var8);



    }
}
