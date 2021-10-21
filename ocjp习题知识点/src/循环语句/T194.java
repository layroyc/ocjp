package 循环语句;

public class T194 {
    /*private int i;
    void disp() {
        while (i <=5) {
            for (int i=1; i <=5;) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        new T194().disp();
    }*/

    /*public static void main(String[] args){
        Integer num = Integer.parseInt(args[1]);
        System.out.println("Number is : " + num);
    }*/

    public static void main(String[] args) {
        String s = "123";
        if (s.length() >2)
            s.concat("456");
        for(int x = 0; x <3; x++)
            s += "x";
        System.out.println(s);
    }


}
