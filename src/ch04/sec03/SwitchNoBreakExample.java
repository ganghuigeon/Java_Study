package ch04.sec03;

public class SwitchNoBreakExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재시간: " + time + "시]");

        switch (time) { //switch(값) => 실수형, boolean형 사용 불가
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의 합니다.");
                break;
            case 10:
                System.out.println("업무 봅니다.");
                break;
            default:
                System.out.println("외근 갑니다.");
        }
    }
}
