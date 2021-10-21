package 三元运算符;

public class T789 {
    public static void main(String[] args) {
        int x = 100;

        int a = x++;//100
        System.out.println("a = " + a);

        int b = ++x;//102
        System.out.println("b = " + b);

        int c = x++;//102
        System.out.println("c = " + c);
        System.out.println("x = " + x);

        int d = (a<b)?(a<c)?a:(b<c)?b:c:x;

        System.out.println(d);

    }
}
