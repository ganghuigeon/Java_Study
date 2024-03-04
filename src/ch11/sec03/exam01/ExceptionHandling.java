package ch11.sec03.exam01;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]" + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배욜 인덱스가 초과됨: " + e.getMessage());
            } catch (Exception e) { //최상위 부모인 Exception은 가장 하단에 작성해주면 된다.
                //반드시 잡아야 하는 예외를 제외한 나머지는 여기서 잡히기 때문
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            }
        }

    }
}
