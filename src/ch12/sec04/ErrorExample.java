package ch12.sec04;

public class ErrorExample {
    public static void main(String[] args) {
        try {
        int value = Integer.parseInt("1aa");

        }catch (Exception e) {
            System.err.println("[에라내용]");
            System.err.println(e.getMessage());
        } finally {

        }

    }
}
