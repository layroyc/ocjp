package 缺少无参构造器;

public class T957Employee {
    private String name;
    private int age;
    private int salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //缺少了个无参构造
    public T957Employee(){
    }
    public T957Employee(String name,int age){
        setName(name);
        setAge(age);
        setSalary(2000);
    }
    public T957Employee(String name, int age, int salary){
        this(name, age);
        setSalary(salary);
    }

    //getter and setter methods for attributes go here

    public void printDetails(){
        System.out.println(name + " : " + age + " : " + salary);
    }
}
