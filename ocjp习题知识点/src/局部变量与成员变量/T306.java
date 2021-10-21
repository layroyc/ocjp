package 局部变量与成员变量;

public class T306 {
    String greet="Welcome!";
    public T306(){
        String greent="Hello";
    }
    public void setGreet(){
        String greet="GoodDay!";
        System.out.println("greet wretgr= " + greet);
    }
    public static void main(String[]args){
        T306 t=new T306();
        String greet="GoodLuck!";
        System.out.println(t.greet);
        System.out.println(t);
    }
}
