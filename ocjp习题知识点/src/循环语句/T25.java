package 循环语句;

public class T25 {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arry[] = {1,3,5,7,8,9};
        int index = arry.length; //6
        while ( index>0 ) {
            if (arry[index-1] % 2 ==0) {
                isChecked = true;
            }
        --index;
        }
        System.out.print(arry[index]+","+isChecked);
    }
}
