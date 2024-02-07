package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        /*char var1 = "A"; // char 타입은 큰 따옴표를 사용할 수 없다
        char var2 = "김길동"; // char 타입에는 글자 하나만 쓸 수 있다*/

        String name = "김길동"; // String 타입에는 작은 따옴표를 사용할 수 없다
        String job = "프로게이머";

        System.out.println(name + "은 " + job + "입니다.");

        String str = "나는 \'행복\'합니다";
        System.out.println(str);

        //tab 만큼 띄어쓰기
        str = "번호\t이름\t직업";
        System.out.println(str);

        //줄바꿈
        System.out.println("나는\n파이썬을\n배웁니다.");
    }
}
