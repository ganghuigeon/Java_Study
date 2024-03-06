package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv()); //tv타입으로 지정했기 때문에 tv객체 set
        product1.setModel("Smart Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("그랑죠");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
