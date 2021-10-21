package 属性默认值;

public class T951 {
    char c;   //默认值
    boolean b;//默认值  false
    float f; //默认值  0.0
    double d; //默认值  0.0
    int i; //默认值  0.0
    short s; //默认值  0.0
    long l; //默认值  0.0
    byte by;


    void printAll(){
        System.out.println("c= "+c);
        System.out.println("b= "+b);
        System.out.println("f= "+f);
        System.out.println("d= "+d);
        System.out.println("i= "+i);
        System.out.println("s= "+s);
        System.out.println("l= "+l);
        System.out.println("by= "+by);
    }
    public static void main(String[] args) {
        T951 f=new T951();
        f.printAll();
    }
}
