package ch05.sec09;

public class ArrayCopyExample {
    //배열의 길이 3에서 5로 바꾸기
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3}; //length: 3
        int[] newIntArray = new int[5];//length: 5
        //배열 항목 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        //배열 항목 출력
        newIntArray[3]=4;
        newIntArray[4]=10;
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }

        System.out.println(newIntArray); //배열을 출력하면, 배열 주소를 출력해벌임....
    }
}
