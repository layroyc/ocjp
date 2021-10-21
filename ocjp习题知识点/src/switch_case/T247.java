package switch_case;

public class T247 {
    public static void main(String[] args) {
        String option="3";

        switch(option){

            case"1":

                System.out.println("A");

            case"2":

            case"4":

                System.out.println("B");

                break;

            case"3":

            case"5":

                System.out.println("C");
                //break;

            default:  //未打印break输出default

                System.out.println("E");

        }
    }
}
