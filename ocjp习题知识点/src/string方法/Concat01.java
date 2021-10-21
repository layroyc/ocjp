package string方法;

public class Concat01 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");//把括号里的追加到ta的后面
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');//未把replace替换赋值
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
