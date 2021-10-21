package 数组;

public class Test04 {
    public static void main(String[] args) {

        String[][] chs = new String[2][];//二维数组共包含两个一维数组元素
        chs[0] = new String[2];//第一个一维数组两个
        chs[1] = new String[5];//第二个一维数组五个
        int i = 97;
//01 02 10 11 12 13 14

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                 chs[a][b] = "" + i;
                 i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
