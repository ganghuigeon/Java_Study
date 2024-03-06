package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.content = "안녕하세요";
        String content1 = box.content;

        Box<Integer> box2 = new Box<Integer>();
        box2.content = 10;
        int content2 = box2.content;

//        box.content = "문자열"; //String타입
//        box.content = 1; //Integer타입
//        box.content = new Bottle(); //새로운 객체


        String content3 = (String) box.content; // 컴파일 오류 발생
    }
}
