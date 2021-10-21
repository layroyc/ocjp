package 局部变量与成员变量;

public class MyField {
    int x;//成员变量  默认值 0
    int y;
    public void doStuff(int x, int y) {
        this.x = x;//使用this调用本类中的属性，也就是类中的成员变量
        y = this.y;
    }
     public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
                m1.x = 100;
                m1.y = 200;
                MyField m2 = new MyField();
                m2.doStuff(m1.x, m1.y);//调用doStuff方法
                m1.display();//100 200
                m2.display();//100 0
    }
}
