package 局部变量与成员变量;

public class Test04 {
    public static void main(String[] args) {
        Test04 ts = new Test04();
        System.out.print(isAvailable + " ");//未调用静态方法isAvailable = false
        isAvailable= ts.doStuff();//对象调用doStuff静态方法且不等于isAvailable为true
        System.out.println(isAvailable);
    }
    public static boolean doStuff() {
        return !isAvailable;
}
    static boolean isAvailable = false;
}
