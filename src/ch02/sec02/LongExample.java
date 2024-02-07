package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        
        //long 타입을 쓸 때, int 타입의 허용범위에 있는 숫자는 사용가능
        long var1 = 10; //int타입으로 인식함 => int 타입의 허용범위 안에 있으면, L을 붙이지 않아도 된다.
        long var2 = 20L; //L을 썼으므로 long타입으로 인식함
        long var3 = 100000000000000l; //★ int 타입으로 인식하나 int타입의 허용범위를 벗어나므로 오류 발생, L을 붙여야 한다.
        long var4 = 100000000000000L;//long타입으로 인식함

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }
}
