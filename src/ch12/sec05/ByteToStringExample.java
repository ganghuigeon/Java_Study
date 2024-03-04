package ch12.sec05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        String data = "자바";

        //String -> byte 배열(UTF-8로 인코딩이 이뤄짐)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1: " + Arrays.toString(arr1));
        //byte 배열 -> String
        String str1 = new String(arr1);
        System.out.println("str1: " + str1);
    }
}
