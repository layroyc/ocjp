package 数组;

public class Test03 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];//两行 四列  二维数组
    arr[0] = new int[]{1, 3, 5, 7};
    arr[1] = new int[]{1, 3};
    for (int[] a : arr) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    }
}
