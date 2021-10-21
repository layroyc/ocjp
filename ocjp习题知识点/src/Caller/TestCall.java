package Caller;

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
            c.start();
            //c.init();//init()方法是私有的 只能自己或本类进行调用
        System.out.println("Result A " + 0 + 1);
        System.out.println("Result B " + (1) + (2));
    }
}
