package Creational.Builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer com = new Computer.ComputerBuilder("500GB", "2 GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(com);
    }
}
