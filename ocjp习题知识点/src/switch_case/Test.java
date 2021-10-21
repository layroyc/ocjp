package switch_case;

public class Test {
    /*public static void main(String[] args) {
        // JDK 1.5以前：x 只能是byte, short, char, int
        //JDK 1.5之后：x 的类型也可以是枚举类型啦！
        //JDK 1.7之后：x 的类型又多了一个String类型

        //数值型的只可以是 int 类型，但是 byte, short, char 都可以自动转换成 int 类型，
        // 所以 x 也可以是byte, short, char。
        // 当然了，对应的包装类也是可以自动转换，所以 x 也可以是包装类型的

        //无论哪个版本的JDK，都是不支持 long，float，double，boolean 这个一定要注意！


        //line n1
        //byte x =1;
        //short x = 1;
        //String x = "1";
        Integer i = new Integer(1);
        *//*long x = 1;
        double x = 1;*//*
        switch (i) {
            case 1:
                 System.out.println("One");
                 break;
            case 2:
                 System.out.println("Two");
                 break;
        }
    }*/


    public static void main(String[] args) {
            //boolean opt = true;//switch中不支持boolean
            String opt = "true";
            switch (opt) {
                case "true":
                    System.out.print("True");
                    break;
                 default:
                     System.out.print("***");
                 }
             System.out.println("Done");
        }
}
