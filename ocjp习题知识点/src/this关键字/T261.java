package this关键字;

public class T261 {
    String name;
    boolean contract;
    double salary;
    public T261() {
        //line n1
        /*name = "Joe";
        contract = true; //true要为小写
        salary = 100.0f;*/

        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
    public static void main(String[] args) {
        T261 e = new T261();
        //line n2
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        System.out.println(e);
    }
}
