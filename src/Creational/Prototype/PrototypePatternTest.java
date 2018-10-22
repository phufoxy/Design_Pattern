package Creational.Prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.LoadData();
//        Use the clone method to get the employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Number Ten");
        List<String> list_item = empsNew1.getEmpList();
        list_item.remove("Number Two");
        System.out.println("emps list:" + emps.getEmpList());
        System.out.println("empsNew List:" + list);
        System.out.println("empsNew1 List:" + list_item);
    }
}
