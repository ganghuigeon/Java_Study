package ch12.sec04;

public class MeasureRunTime {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();
        System.out.println("1~100000의 합: " + sum);
        System.out.println("계산에 소요된 시간: " + (time2 - time1) + " nano sec");
    }
}
