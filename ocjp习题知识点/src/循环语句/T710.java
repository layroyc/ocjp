package 循环语句;

public class T710 {
    public static void main(String[] args) {
        int[] stack = {10,20,30};
        int size = 3;
        int idx =0;
        while (idx <size - 1){ //2
            idx++;
            System.out.println("idx = " + idx);//2 3
        }
        System.out.print("The Top element:" + stack[idx]);
    }
}
