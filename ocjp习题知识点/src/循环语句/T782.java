package 循环语句;

public class T782 {
    public static void main(String[] args) {
        int x = 5;
        while(isAvailable(x)) {//5
            System.out.print(x);//6
            //System.out.print(--x);//6
            //7
            x--;
        }
    }
    public static boolean isAvailable(int x) {
        return --x > 0 ? true : false;//12
    }
}
