package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstnum = ssn.substring(0,6); //앞자리만 출력
        System.out.println(firstnum);

        String secondnum = ssn.substring(7); //뒷자리 출력
        System.out.println(secondnum);
    }
}
