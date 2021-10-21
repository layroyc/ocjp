package 属性默认值;

public class T495 {
    private String name;
    private Boolean pass;   //name=null,pass =null
    //private boolean pass;  //name=null,pass =false
    public static void main(String[] args){
        T495 wb = new T495();
        System.out.print("name="+wb.name);
        System.out.print(",pass ="+wb.pass);
    }
}
