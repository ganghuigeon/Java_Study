package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("samsung", "Android os");
        System.out.println(myPhone);
        System.out.println(myPhone.toString());
    }
}
