package ch04.sec05;

public class SumFromTo100 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(i <= 100 ){
            sum += i;
            i++;
        }
        System.out.println("1~100까지의 합: " + sum);
    }
}
