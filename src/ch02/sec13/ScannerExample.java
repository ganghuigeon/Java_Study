package ch02.sec13;

import java.util.Scanner; //이 내용이 있어야 Scanner 사용 가능

public class ScannerExample {
    public static void main(String[] args) {
        //1. Scanner 객체 생성
        //자바에서 객체 생성시에는 new라는 키워드를 사용해 객체 생성
        //참조타입 변수명 = new객체
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력:");
        //2. scanner에서 값 입력받기
        String strX = scanner.nextLine();

        System.out.println("y값 입력:");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("x + y = " + result);

        //계속 입력 받을 수 있게, q를 입력했을 떄 프로그램이 끝나도록 만들기

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            //data에 입력된 값이 q인가?
            if(data.equals("q")) {
                break; //while문 중단
            }
            System.out.println("출력 문자열: " + data);

        }
        //while문 탈출 찍는 문자
        System.out.println("프로그램을 종료합니다.");
    }
}
