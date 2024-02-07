package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = -0;
        byte var4 = 30;
        byte var5 = 127; // 2진수로 표현시 0111 1111 => 앞자리가 남는다
        //byte var6 = 128; 바이트 선언에서 담을 수 없는 값이기 때문에 오류 발생 2진수로 표현시 1000 0000 => 맨 앞자리는 항상 부호비트로 쓰이므로 127까지 밖에 되지 않는다
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
