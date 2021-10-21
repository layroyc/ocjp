package static方法;

public class Test {
    static int count = 0;//静态变量
    int i = 0;//实例变量

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
            System.out.println("i = " + i);
        }
        System.out.println("ic = " + i);
    }

    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.print(check1.count + " : " + check2.count);
    }

}
