package ch11.sec02.exam01;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJAVA");
        printLength("null"); //큰 따옴표를 지우면 data가 null이라며 예외상황이 발생됨
        System.out.println("[프로그램 종료]");
    }
    //문자열의 길이 출력
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 :" + result);
    }
}
