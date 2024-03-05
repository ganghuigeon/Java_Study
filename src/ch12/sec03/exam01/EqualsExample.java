package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {

        Member obj1= new Member("blue");
        Member obj2= new Member("blue");
        Member obj3= new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 같습니다.");
        } else {
            System.out.println("obj1과 obj2는 같지 않습니다");
        }

        if (obj2.equals(obj3)) {
            System.out.println("obj2와 obj3은 같습니다.");
        } else {
            System.out.println("obj2와 obj3은 같지 않습니다");
        }

    }
}
