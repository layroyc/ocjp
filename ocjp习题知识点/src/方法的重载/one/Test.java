package 方法的重载.one;

public class Test {
    public static void main(String[] args) {
        //Employee e1 = new Employee();//没有无参构造
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
        //e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}
