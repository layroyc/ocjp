package 数组;

public class T950 {
    public static void main(String[] args) {
        String []strs = {"A","B"};
        //String[]  strs = new String[2];  //如果未赋值就是空指针异常   反之就输出赋值的值
        int idx = 0;
        for(String s:strs) {
            strs[idx].concat(" element "+idx);
            idx++;
        }
        for(idx=0;idx<strs.length;idx++) {
            System.out.println(strs[idx]);
        }
    }
}
