package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;// 컴파일 단꼐에서 연산을 수행하므로 byte result1 = 30;
        System.out.println("result1: " + result1);

        //정수 + 정수
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 * v2; //int 타입으로 변환 후 연산
        byte result3 = (byte) (v1 + v2); // 강제 타입 변환 처리 -> 각각 byte타입으로 전환된 후 연산됨
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1001;
        long result4 = v3 + v4 + v5; // long 타입으로 변환 후 연산됨, 여러 타입이 있을 때 허용범위가 가장 큰 타입으로 전환되어 연산됨을 주의
        System.out.println("result4: " + result4);

        //실수 + 실수
        float f1 = 1.2f;
        double d1 = 3.4;
        double result5 = f1 + d1;//double 타입으로 변환 후 연산됨 -> 실수끼리 연산도 허용범위가 가장 큰 타입으로 전환되어 연산됨을 주의
        System.out.println("result5: " + result5);


        //실수 + 정수, 자바에서는 실수 리터럴을 double타입으로 인식하므로, 4.0은 double타입
        int v9 = 10;
        double result6 = v9 / 4.0; // 실수와 정수의 경우, 실수 타입이 정수 값보다 허용범위가 넒으므로 실수타입으로 변환 후 연산됨
        float result7 = v9 / 4.0f; // 실수와 정수의 경우, 실수 타입이 정수 값보다 허용범위가 넒으므로 실수타입으로 변환 후 연산됨
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        //char와 int 연산
        char v6 = 'A';
        char v7 = 1;
        int result8 = v6 + v7; //int 타입으로 변환 후 연산이 이뤄짐
        System.out.println("result8: " + result8);
        System.out.println("result8: " + (char)result8);


        int x = 1;
        int y = 2;
        double result = x/y; //★정수 연산의 값은 결과는 항상 정수이다. -> 결과 값인 0.5에서 소숫점 값을 버린다.
        //0을 double 타입 변수에 저장하므로, 0.0이 출력된다
        System.out.println(result);

        //올바른 값 0.5를 얻기 위한 방법1
        //double result9 = (double)x / y;

        //올바른 값 0.5를 얻기 위한 방법2
        //double result9 = x / (double)y;

        //올바흔 값 0.5를 얻기 위한 방법3
        //double result9 = (double)x / (double)y;

        //주의 아래와 같은 방법은 x와 y가 먼저 연산된 후 실수 타입이 적용된다.
        double result9 = (double) (x / y);
        System.out.println("result9: " + result9);

    }
}
