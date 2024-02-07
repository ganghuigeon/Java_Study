package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        short shortValue1 = byteValue;
        int intValue = byteValue; //자동타입변환 -> intValue의 10은 int 타입으로 저장된다
        System.out.println("intvalue: " + intValue);


        intValue = 50;//int 타입
        long longValue = intValue;//자동타입변환 -> 50운 long 타입으로 저장된다.

        short shortValue = 10;
        int intValue2 = shortValue;//자동 타입 변환 => short 타입이었던 10은 int 타입으로 저장된다

        //★정수보다 실수의 허용범위가 더욱 크다 -> 정수에서 실수로 자동타입변환이 일어난다
        short longValue2 = 100;
        float floatValue = longValue2;
        double doubleValue = longValue2;


        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //실수끼리의 자동타입변환
        float floatValue2 = 100.5f;
        double doubleValue2 = floatValue2;
        System.out.println("doubleValue2:" + doubleValue2);

        //char -> int 타입변환 : 유니코드가 정수로 표현가능하다
        char charValue = '가';
        int intValue3 = charValue; //자동타입변환
        System.out.println("intValue3:" + intValue3);
    }
}
