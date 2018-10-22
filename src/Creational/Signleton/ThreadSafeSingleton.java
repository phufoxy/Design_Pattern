package Creational.Signleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    //    ứng dụng đa tiến trình (multi-thread)
    // chế độ synchronized cần được thêm vào phương thức truy cập
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
