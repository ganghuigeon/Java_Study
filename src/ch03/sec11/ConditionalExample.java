package ch03.sec11;

public class ConditionalExample {
    public static void main(String[] args) {
        //점수로 A,B,C 등급을 저장
        int score = 85;
        //삼항 연산자를 중첩으로 사용(조건이 3개 이상일 때)
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급");
    }
}
