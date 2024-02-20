package ch06.sec08.exam03;

public class Car {
    //필드
    int gasoline; //개솔린의 양, 개솔린 저장

    //메소드
    //1. 기름 주유하는 메소드
    void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    //2. 기름이 있는지 없는 출력하는 메소드
    boolean isLeftGas(){
        if (gasoline == 0) {
            System.out.println("기름이 없습니다.");
            return false;
        }else {
            System.out.println("기름이 있습니다.");
            return true;
        }
    }
    //3. 자동차가 달리면서 기름을 소진하는 메소드
    void run() {
        while (true) {
            if(gasoline > 0) {
                //차가 달릴때마다 1씩 소진시킴
                System.out.println("달립니다.(gas잔량: " + gasoline + ")");
                gasoline = gasoline -1;
            } else {//기름이 없으면
                System.out.println("멈춥니다.(gas잔량: " + gasoline + ")");
                return;//void 메소드를 종료시키고 싶을 때 사용함
            }
        }
    }
}
