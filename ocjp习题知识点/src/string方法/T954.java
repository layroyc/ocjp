package string方法;

public class T954 {
    public static void main(String[] args) {
        String str = "Sweet Sweet";
        String str2 = str.trim().charAt(6)+" "+str.indexOf("Sw",1);
        System.out.println(str2);
    }
}
