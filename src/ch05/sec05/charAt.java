package ch05.sec05;

public class charAt {
    public static void main(String[] args) {
        String ssn = "9506241230123"; //주민번호
        char sex = ssn.charAt(6); //7번째자리(뒷자리 첫번째 번호를 불러온다)

        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }
}
