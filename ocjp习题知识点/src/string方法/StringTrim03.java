package string方法;

public class StringTrim03 {
    public static void main(String[] args) {
        String str = " ";
        str.trim();
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        System.out.println(str.equals("") + " " + str.isEmpty());
    }
}
