package 异常;

class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class T952 {
    public static void main(String[]args)throws LogFileException{
        T952 obj = new T952();
            try{
                obj.open();
                obj.process();
                //insert code here
            }
            catch(Exception e){
                  System.out.println("Completed.");
                }
         }
        public void process() throws LogFileException {
                System.out.println("processed");
                throw new LogFileException();//new异常的同时要抛出异常
            }
        public void open(){
                System.out.println("Opened");
                throw new AccessViolationException();
              }
}
