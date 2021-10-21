package 类型转换;

public class Long转String {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; //line n1
        //String s4 = (String) (s3 * s2);//line n2
        String s4 = String.valueOf(s3 * s2);//用String.valueof(long)方法
        System.out.println("Sum is " + s4);
        System.out.println("Sum is " + s3);
    }
}
