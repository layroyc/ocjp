public class T {

    static String args[] = {"lazy","lion","is","always"};
    public static void main(String[] args) {


//        for(int ii=0;ii<3;ii++){//012
//            String[][]arr={{"A","B","C"},{"D","E"}};
//            for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr[i].length;j++){
//                    System.out.println(arr[i][j])+"");
//                    if(arr[i][j]).equals("B")){
//                        break;
//                    }
//                }
//                continue;
//            }
//    }



      /*  String[][]arr={{"A","B","C"},{"D","E"}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
*/

/*

        int price=1000;
        int qty=2;
        String grade="2";
        double discount=0.0;
        switch(grade){
            case"1":
                discount=price*0.1;
                break;
            case"2":
                discount=price*0.5;
                default:
                System.out.println("ThankYou");
                }
        System.out.println(discount);
*/

        /*int[][] arr = new int[2][4];
        arr[0] = new int[] {1,3,5,7};
        arr[1] = new int[] {1,3};
        for (int[] a : arr) {
            for (int i = 0; i<arr.length; i++) {
                System.out.println(a[i] + " ");
            }
            System.out.println();
        }
*/

       /* String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        try{
            for(String n:names){
                pwd[idx]=n.substring(2,6);
                idx++;
            }
        }catch(Exception e){
            System.out.println("InvalidName");
        }
        for(String p:pwd){
            System.out.println(p);
        }*/


        /*int num=5;
        int sum;
        do{
            sum+=num;
        }while((num--)>1);
        System.out.println("The sum is"+sum+" ");*/

        /*int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;
        numbers=new int[4];
        numbers[2]=30;
        numbers[3]=40;
        for(int x:numbers){
            System.out.println(""+x);
        }
*/

       /* int[] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println("intArr = " + intArr.toString());*/


       /* int[]xx=null;
        for(int ii:xx){
            System.out.println(ii);
        }*/


                /*int sum=0;
                for(int x=0 ; x<=10 ; x++)
                    sum+=x;//line6
                System.out.print("Sum for 0 t0"+x);//line7
                System.out.println("="+sum);*/


       /* int n[][]={{1,3},{2,4}};
        System.out.println(n.length-1);
        for(int i=n.length-1;i>=0;i--){//i=1
            for(int y:n[i]){
                System.out.print(y);
            }
        }*/

        /*int arr[]=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        int sum=0;
        try{
            for(int pos=0;pos<=4;pos++){
                sum=sum+arr[pos];
            }
        }catch(Exception e){
            System.out.println("Invalidindex");
        }
        System.out.println(sum);
*/


        int array[] = new int[-2];
        for (int i : array) {
            System.out.println("i = " + i);
        }
    }


}