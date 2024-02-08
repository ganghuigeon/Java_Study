package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A'; // 자동타입변환
        //65 ~ 90사이의 글자(대문자 알파벳 유니코드)
        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        }
        //97 ~ 122사이의 글자(소문자 알파벳 유니코드)
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자");
        }
        if((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9사이의 숫자");
        }
        System.out.println("+++++++++++++++++++++++++++++");
        
        int value = 16;
        if((value % 2 == 0)|(value % 3 == 0)){
            System.out.println("2또는 3의 배수");
        }
        if((value % 8 == 0)|(value % 9 == 0)){
            System.out.println("8또는 9의 배수");
        }
    }
}
