package plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.print("nextLine()입력: ");
        String inputNextLine = scanner.nextLine();
        System.out.println(inputNextLine);

        System.out.println("next()입력: ");
        String inputNext = scanner.next();
        System.out.println(inputNext);
*/
        System.out.println("int햄 입력: ");
        int inputInt = scanner.nextInt(); //int 타입으로 값을 입력 받음
        System.out.println(inputInt);

        System.out.println("double햄 입력: ");
        double inputDouble = scanner.nextDouble(); //double 타입으로 값을 입력 받음
        System.out.println(inputDouble);

        System.out.println("int + double= " + (inputInt + inputDouble));

        System.out.println("boolean형 입력: ");
        boolean inputboolean = scanner.nextBoolean(); // boolean 타입으로 값을 입력 받음
        System.out.println(inputboolean);

    }
}
