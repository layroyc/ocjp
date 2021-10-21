package static方法;

public class App {
    static int count;
    public static void displayMsg() {
        count++; // line n1
        System.out.println("Welcome "+"Visit Count: "+count);// line n2
    }

    public static void main(String[] args) {
        App.displayMsg();// line n3
        App.displayMsg();// line n4
    }
}
