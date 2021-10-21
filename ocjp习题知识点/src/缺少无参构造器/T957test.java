package 缺少无参构造器;

import 方法的重载.one.Employee;

public class T957test {
    public static void main(String[] args){
        T957Employee e1 = new T957Employee();//缺少无参构造器
        T957Employee e2 = new T957Employee("Jack", 50);
        T957Employee e3 = new T957Employee("Chole", 40, 5000);
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}
