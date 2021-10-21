package 异常;

public class T21 {
    public static void main(String[] args) {
        T21 t=new T21();
        		try {
         		t.doPrint();
         		t.doList();

         	} catch (Exception e2) {
         			System.out.println("Caught "+e2);
         		}
        	}
public void doList() throws Exception {
   		throw new Error("Error");
   	}
public void doPrint() throws Exception {
        		throw new RuntimeException("Exception");
        	}
}
