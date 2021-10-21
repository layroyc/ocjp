package 算术运算符;

public class T771 {
    public static void main(String[] args) {
        int x;
        //A     *
        x=0;

        do {

            System.out.print("*");

            x++;

        }while(x>=3);

       //B   ****
        /*x=0;

        do{

            System.out.print("*");

        }while(x++<3);*/

        //C   **
        /*x=3;

        do{

            System.out.print("*");

            x--;

        }while(x!=1);*/

        //D   *
        /*x=0;

        do{

            System.out.print("*");

            ++x;

        }while(x>3);*/
    }
}
