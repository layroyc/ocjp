package 循环语句;

public class T110 {

        public static void main(String[]args) {

            int a = 0, z = 10;

            while (a < z) {

                a++;

                --z;
            }
            System.out.print(a + ":" + z);
        }
}
