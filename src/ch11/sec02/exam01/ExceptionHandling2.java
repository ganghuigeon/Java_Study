package ch11.sec02.exam01;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJAVA");
        printLength(null); //큰 따옴표를 지우면 data가 null이라며 예외상황이 발생됨
        System.out.println("[프로그램 종료]");
    }

    public static void printLength(String data) {

        //예외처리 코드 작성
        try {
             int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            //System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
            //System.out.println(e.toString()); // 예외가 발생한 이유 + 예외의 종류를 리턴
            e.printStackTrace();//예외의 종류 + 예외가 발생한 이유 + 예외가 발생한 위치까지 리턴, try catch문을 안썼을 때랑 동일한 메세지를 출력해줌
            //다만 위에는 작성된 모든 코드를 실행해주기 때문에 예외 발생을 찾기 위해서는 위 코드를 써주는 것이 바람직 해보임
        } finally {
            System.out.println("[마무리 실행]");
        }

    }
}
