package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();
        //이진트리에 저장된다. 자식 노드가 두개씩 밖에 없음
        //보다 크면 오른쪽, 보다 작으면 왼쪽에 저장된다.

    scores.add(87); //기준점이 되는 노드
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);

    //정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println();

        //특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래의 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));

        System.out.println();

        //내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();

        //범위 검색(80 <= )
        //tailSet(): 주어진 객체와 함께 그 보다 높은 객체를 가지고 온다.(true), 주어진 객체를 제외하고 그보다 높은 객체를 가지고 온다(false)
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);

        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
        System.out.println();

        //범위검색(80 <= score < 90)
        //subSet(fromElement, fromInclusive, toElement, toInclusive): 시작과 끝으로 주어진 사이의 객체들을 구한다.
        rangeSet = scores.subSet(80,true,90,false);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }



        //범위검색(87 >=)
        //headSet : 주어진 객체보다 낮은 객체를 가지고 온다.
        rangeSet = scores.headSet(87,true);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
    }
}
