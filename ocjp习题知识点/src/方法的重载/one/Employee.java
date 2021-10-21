package 方法的重载.one;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {//方法的重载
            /*setName(name);
            setAge(age);
            setSalary(2000);*/
    }

   public Employee(String name, int age, int salary) {
//        setSalary(salary);
//        this(name, age);//int类型和string类型 放到了一起
    }

             //getter and setter methods for attributes go here

     public void printDetails() {
         System.out.println(name + " : " + age + " : " + salary);
    }
}
