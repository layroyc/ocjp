package 数组;

public class 二维数组49 {
    public static void main(String[] args) {
        String[][] chs = new String[2][];//二维数组共包含两个一维数组元素
        chs[0] = new String[2];//第一个一维数组两个
        chs[1] = new String[5];//第二个一维数组五个
        int i = 97;
        //00 01 10 11 12 13 14

        for (int a = 0; a < chs.length; a++) {//第一个一维数组
            System.out.println("as = " + chs.length);
            for (int b = 0; b < chs.length; b++) {//第二个一维数组
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
