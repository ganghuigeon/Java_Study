package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 80;
        if(score > 90){
            System.out.println("점수가 90점보다 큽니다.");
            System.out.println("A등급입니다.");
        }
        if(score < 90) {
            System.out.println("점수가 90점보다 작습니다.");
            System.out.println("B등급입니다.");
        }
    }
}
