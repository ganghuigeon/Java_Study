package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("박봉팔", 85);
        map.put("박춘배", 90);
        map.put("박명자", 80);
        map.put("박종덕", 95);
        map.put("박길산", 70);

        System.out.println("총 Entry 수: " + map.size());

        System.out.println();
        //키로 값 얻기
        int value = map.get("박춘배");
        System.out.println("박춘배의 점수: " + value);

        value = map.get("박종덕");
        System.out.println("박종덕의 점수: " + value);

        //hashMap 데이터를 모두 읽어오기

        //모든 key를 가져와 iterator객체로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+" : " +v);
        }


        System.out.println();

        //모든 Entry객체를 가져와 iterator객체로 변경

        map.remove("박종덕");

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
    }
}
