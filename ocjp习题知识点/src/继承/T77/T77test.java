package 继承.T77;

public class T77test {
    public static void main(String[] args) {
        Sun obj2 = new Sun();
        Start obj3 = obj2;
        ((Sun)obj3).doStuff();
        ((Start)obj3).doStuff();
        ((Universe)obj3).doStuff();
    }
}
