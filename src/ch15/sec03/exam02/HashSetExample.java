package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("임꺽정",35));
        set.add(new Member("임꺽정",35));

        System.out.println("총 객체 수: " + set.size());
    }
}
