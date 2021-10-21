package 分割;

public class TO20 {
    public static void main(String[] args) {
        String test = "Test A. Test B. Test C.";
        System.out.println("test[0] = " + test);
      // insert code here
        String regex = "\\.\\s*";

      String[] result = test.split(regex);
        System.out.println("result = " + result.toString());
        System.out.println("result[0] = " + result[0]);
        for (String s : result) {
            System.out.println("s = " + s);
        }
    }
}
