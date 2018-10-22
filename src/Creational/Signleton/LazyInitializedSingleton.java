package Creational.Signleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    //    Phương pháp này khởi tạo đối tượng của lớp ngay bên
    //  trong phương thức truy cập chế độ public của lớp.
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
