package Structural.Bridge;

// Đây là một pattern thuộc kiểu structural pattern,
// nó tách implementation class và abstract class bằng cách tạo ra một cầu nối giữa hai thứ.
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        Shape pent = new Pentago(new GreenColor());
        pent.applyColor();
    }
}
