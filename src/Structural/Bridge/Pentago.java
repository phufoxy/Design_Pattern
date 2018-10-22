package Structural.Bridge;

public class Pentago extends Shape {
    public Pentago(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color ");
        color.applyColor();
    }
}
