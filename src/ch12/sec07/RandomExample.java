package ch12.sec07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //Random 클래스를 이용한 로또 당첨

        //1. 번호 수동 선택
        int [] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열
        Random random = new Random(0); //seed를 주면 고정된 난수를 만들어준다
        System.out.println("선택 번호: ");

        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1; //1 ~ 45까지의 숫자
            System.out.println(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨번호: ");

        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + "");
        }
        //3. 당첨여부 알려주기
        Arrays.sort(selectNumber); //비교하기 전에 배열 값을 정렬
        Arrays.sort(winningNumber);

        System.out.println("정렬 후 배열");
        System.out.println(Arrays.toString(selectNumber));
        System.out.println(Arrays.toString(winningNumber));

        boolean result = Arrays.equals(selectNumber, winningNumber); //배열 값을 비교

        System.out.println("당첨여부 : ");
        if (result) System.out.println("!등 당첨1");
        else System.out.println("낙첨되셨습니다.");
    }
}
