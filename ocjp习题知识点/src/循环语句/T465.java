package 循环语句;

public class T465 {


        public static void main(String[] args) {

            int num = 5;

            int sum = 0;//只声明未初始化  所以sum报错

            do {

                sum += num;

            } while ((num--) > 1);

            System.out.println("The sum is" + sum + ".");

        
        }

    }
