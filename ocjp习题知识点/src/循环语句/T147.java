package 循环语句;

public class T147 {
    public static void main(String[] args) {
        for (int ii = 0; ii < 3;ii++) {  // 0  1  2
            int count = 0;
            for (int jj = 3; jj > 0; jj--) {  // 3 2 1
                if (ii == jj) {   // 0!=3 0!=2  0!=1   1!=3  1!=2  1==1  2!=3 2=2
                    ++count;   // 1  1
                    System.out.println("count000 = " + count);
                    break;
                }
            }
            System.out.print(count);// 0  1  1
            continue;
        }
    }
}
