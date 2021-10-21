package string方法;

public class StringTrim02 {
    public static void main(String[] args) {
        String s = " Java Duke ";
        int len = s.trim().length();//trim() 去除两端空格
        System.out.print(len);//下标为0  长度是Java Duke 中间有个空格
    }
}
