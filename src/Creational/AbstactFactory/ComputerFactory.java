package Creational.AbstactFactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstactFactory factory) {
        return factory.createComputer();
    }
}
