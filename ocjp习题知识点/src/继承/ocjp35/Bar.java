package 继承.ocjp35;

public class Bar extends Foo {
    public int a = 8;

    public void addFive() { this.a += 5; System.out.print("b " ); }

    public static void main(String[] args) {
        Foo f = new Bar();
        //Bar f = new Bar();   //13
        f.addFive();
        System.out.println(f.a);
    }



}
