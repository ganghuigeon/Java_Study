package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123"; //주민번호
        int length = ssn.length();//반드시 인트형으로 length를 선언해야한다,

        if (length == 13) System.out.println("주민번호 자릿수가 맞읍니다.");
        else System.out.println("주민번호 자릿수가 틀렸읍니다.");
    }
}
