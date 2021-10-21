package 集合;

import java.util.ArrayList;
import java.util.List;

public class Test114 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);//把p2的元素追加到ps中  //Int indexOf（E e）:返回在此集合中指定元素第一次出现的索引
        // insert code here
        int f = ps.indexOf(p2);
        if (f >=0 ) {
        System.out.print("Mike Found");
            }
    }
}
