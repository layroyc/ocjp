package 异常;

public class T351 {
    public static void main(String[] args) {
        /*ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }catch(RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }catch(Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
*/

        float x = 22.00f % 3.00f;
        int y = 22 % 3;
        System.out.print(x + ", "+ y);
    }
}
