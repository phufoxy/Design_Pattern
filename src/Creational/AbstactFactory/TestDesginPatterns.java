package Creational.AbstactFactory;

public class TestDesginPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500 GB", "2.4 GHz"));
        System.out.println(pc);
        Computer server = ComputerFactory.getComputer(new ServerFactory("4GB", "1 TB", "3.6 GHz"));
        System.out.println(server);
    }
}
