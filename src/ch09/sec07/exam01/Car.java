package ch09.sec07.exam01;

public class Car {
    //필드에 tire객체 대입
    private Tire tire1 = new Tire();

    //필드에 금호타이어 객체 대입하기
    private Tire tire2 = new Tire() { //   여기가 금호타이어 클래스가 됨(이름 없는 클래스이므로, 객체도 이름이 없음)
        @Override
        public void roll() {
            System.out.println("금호 타이어 굴러가유");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() { //한국 타이어 클래스가 됨(익명 개체(이름없는 개체))
            @Override
            public void roll() {
                System.out.println("한국 타이어 굴러가유");
            }

        };

        tire.roll();
    }
    //메소드(매개변수로 익명 객체를 넘겨줌)
    public void run3(Tire tire) {
        tire.roll();
    }
}
