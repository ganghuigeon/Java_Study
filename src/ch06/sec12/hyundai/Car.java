package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;
import ch06.sec12.kumho.RainTire;
import ch06.sec12.kumho.*;
import ch06.sec12.kumho.test.Test;

public class Car {
    Test t = new Test();

    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    //ctrl + spaaaace 같이 누르면 non-import되는 부분을 불러옴
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
    RainTire tire5 = new RainTire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

}
