package ch04.sec02;

public class IfNestExample {
    public static void main(String[] args) {
        /*
         * 랜덤한 숫자를 구하는 공식
         * start부터 n개의 정수를 랜덤한 숫자로 구한다.
         * (int) (Math.random()*n) + start;
         * */
        double score = (int) (Math.random() * 20) + 61; //81부터 100까지 사이의 숫자를 구한다.
        System.out.println("랜덤 정수 지정: " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) grade = "A+";
            else grade = "A";
        } else if(score >= 80) {
            if (score >= 85) grade = "B+";
            else  grade = "B";
        } else {
            if (score >= 73) grade = "C+";
            else  grade = "C";
        }
        System.out.println("학점: " + grade);
    }
}
