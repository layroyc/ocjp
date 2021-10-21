package 数组;

public class Test05 {
    public static void main(String[] args) {
        int[] intArr = {8, 16, 32, 64, 128};
        /*A  错*/
        /*for (int i : intArr) {
            System.out.println(intArr[i] + "");
        }*/
        /*B*/
        for (int i : intArr) {
            System.out.println("i = " + i);
        }
        /*C  报错*/
        /*for (int i=0 : intArr) {
                System.out.print(intArr[i] +" ");
                i++;
        }*/
        /*D*/
        for (int i=0; i < intArr.length; i++) {
                System.out.print(i +" ");//输出的下标 0 1 2 3 4
        }
        /*E*/
        for (int i=0; i < intArr.length; i++) {
                System.out.print(intArr[i] +" ");
        }
        /*F*/
        /*for (int i; i < intArr.length; i++) {
            System.out.print(intArr[i] +" ");
        }*/
    }
}
