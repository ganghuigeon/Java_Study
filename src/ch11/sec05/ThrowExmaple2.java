package ch11.sec05;

public class ThrowExmaple2 {
    public static void main(String[] args) throws ClassNotFoundException {

        //main메소드에서 throws를 하면 JVM에서 예외처리를 해준다
        findClass();
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
