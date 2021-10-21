package 断言;

public class T890 {
    public static void main(String[] args) {
        boolean assertsOn = false;
        assert (assertsOn) : assertsOn= true;
        if(!assertsOn) {
            System.out.println("assertis on");
            }
        }
}
