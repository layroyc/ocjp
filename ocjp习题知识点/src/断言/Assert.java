package 断言;

public class Assert {
    public static void main(String[] args) {
        //测试断言要配置  -ea
        //String name = "sd";
        String name = null;
        assert (name!=null):"变量name为空null";
        System.out.println(name);
    }
}
