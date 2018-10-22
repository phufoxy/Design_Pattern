package Structural.Composite;

//Xây dựng phần mềm hướng đối tượng
// là một quá trình thu thập các object đơn giản
// (các object này chỉ gồm các thành phần đơn giản như integer và string),
// rồi kết hợp thành những object phức tạp hơn như các hồ sơ nhân sự hay danh sách các bài hát.
public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
        drawing.draw("Red");
        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
