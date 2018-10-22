package Creational.Signleton;

//Singleton pattern giới hạn việc khởi tạo của một lớp và đảm bảo
// chỉ có duy nhất một đối tượng của lớp tồn tại trong máy ảo java
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //    private constructor to avoid client
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

