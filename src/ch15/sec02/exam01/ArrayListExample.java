package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 정의 방법

        //E에 지정된  타입 객체만 저장
        List<Board> list = new ArrayList<Board>(); //가장 바람직한 방향, 형변환을 따로 해주지 않고, 리스트 설정시 무엇을 명시하는지 보여주기 때문임
        List<Board> list2 = new ArrayList<>();

        list.add(new Board("제목","글쓰기1","박봉팔"));
        list.add(new Board("제목","글쓰기2","박봉팔"));
        list.add(new Board("제목","글쓰기3","박봉팔"));

        Board board = list.get(2);
        System.out.println (board.getSubject() + " " + board.getContent() + " " + board.getWriter());

        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + " " +b.getWriter());
        }

        for (Board b : list) {
            System.out.println(b.getSubject() + " " +b.getWriter());
            //동기화는 순서를 지정해주는 것이다 참고
        }


        list.add(new Board("제목","글쓰기4","박봉팔"));
        list2.add(new Board("제목","글쓰기5","박봉팔"));
        //list3.add("문자열 객체");

        //모든 타입의 객체 저장(제네릭을 저장하지 않으면 모든 클래스의 상위인 디폴트타입인 object가 저장됨)
        List list3 = new ArrayList();
        list3.add(new Board("제목","글쓰기6","박봉팔"));
        list3.add("문자열 객체");

        ArrayList list4 = new ArrayList();
        list4.add(new Board("제목","글쓰기7","박봉팔"));
        list4.add("문자열 객체");



    }
}
