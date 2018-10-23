package Behavioral.Template;

//Template Pattern được sử dụng để tạo ra một mẫu
// phương thức và trì hoãn một số bước thực hiện ở các lớp con
public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
//        using template method
        houseType.buildHouse();
        System.out.println("********************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
