package static方法.Alpha;

public class TestA {
    public static void main(String[] args) {
        /*Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();*/
        int data[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e: data) {
            if (e != key) {
                count++;
                continue;
            }
            //count++;//count++ 先赋值再+1
        }
        System.out.print(count + " Found");
    }
}
