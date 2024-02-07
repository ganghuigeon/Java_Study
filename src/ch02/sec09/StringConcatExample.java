package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        //문자열  결합 연산
        String result2 = 10 + 2 + "8"; //10과 2가 연산되어 12값이 출력된 후 문자열 8이 나열되어 128이 됨
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8; //숫자 10 문자 2 숫자 8이 나열된 1028 값이 출력됨
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8; //문자 10 숫자 2 숫자 8이 나열된 1028 값이 출력됨 첫 값이 문자열이었기 때문에 뒤의 숫자는 연산되지 않고 문자열로 처리됨
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);// 숫자 2와 8이 먼저 연산된 값 10이 나오고 문자열 10과 나열되어 1010이 출력됨
        System.out.println("result5: " + result5);
    }
}
