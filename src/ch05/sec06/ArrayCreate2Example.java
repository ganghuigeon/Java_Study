package ch05.sec06;

public class ArrayCreate2Example {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        }


        System.out.println("=================================================");
        double[] arr2 = new double[3];
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }


        String[] arr3 = new String[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
