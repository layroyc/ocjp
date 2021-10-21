package static方法;

public class X静态变量 {
    static int i;//静态变量
    int j;//实例变量

    public static void main(String[] args) {
        X静态变量 x1 = new X静态变量();//静态变量由于不属于任何实例对象，属于类的，所以在内存中只会有一份，在类的加载过程中，JVM只为静态变量分配一次内存空间。
        //static变量值在类第一次加载的时候分配空间，以后创建类对象的时候不会重新分配
        X静态变量 x2 = new X静态变量();//每次创建对象，都会为每个对象分配成员变量内存空间，实例变量是属于实例对象的，在内存中，创建几次对象，就有几份成员变量。
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                        x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
}
