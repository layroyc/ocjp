package static方法.Alpha;

public class Alpha {
    int ns;//实例变量
    static int s;//静态变量
    Alpha(int ns) {//50 125
        System.out.println("ns = " + ns);
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
