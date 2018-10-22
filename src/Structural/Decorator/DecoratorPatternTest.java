package Structural.Decorator;

//dược sử dụng để sửa đổi chức năng của một đối tượng trong thời gian chạy
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n *****");
        Car sportLuxury = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxury.assemble();
    }
}
