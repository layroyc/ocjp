package 局部变量与成员变量;

public class Test02 {
    String myStr = "7007";//成员变量

public void doStuff(String str) {
    int myNum = 0;
    try {
        String myStr = str;//局部变量
        myNum = Integer.parseInt(myStr);//把局部变量装换成int类型
    } catch (NumberFormatException ne) {
        System.err.println("Error");
    }
         System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

 public static void main(String[] args) {
     Test02 obj = new Test02();//new 一个本类的对象
    obj.doStuff("9009");//调用方法
}
}
