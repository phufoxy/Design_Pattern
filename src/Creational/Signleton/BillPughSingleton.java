package Creational.Signleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingleHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingleHelper.INSTANCE;
    }
}
