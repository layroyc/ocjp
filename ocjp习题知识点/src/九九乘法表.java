public class 九九乘法表 {
    public static void main(String[] args) {
        /*for(int i=0;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }*/



for(int i=0;i<=9;i++){
    for (int j=1;j<=i;j++){
        if(i==5){
            break;
        }
        System.out.print(i+"*"+j+"="+i*j+" ");
    }
    System.out.println();
}
        /*int i=9;
        do{
            int j=1;
            do{
                System.out.print(i+"*"+j+"="+(i*j)+" "+"\t"); //   "\t"这是Java语言默认的制表符号
                j++;
            }while(j<=i);//大于i之后跳出循环

            System.out.println();
            i--;
        }while(i>=1);//小于1之后跳出循环*/



    }
}
