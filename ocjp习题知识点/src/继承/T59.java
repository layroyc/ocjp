package 继承;
class T59 {
        public void mX() {
            System.out.println("Xm1");
        }
    }
    class Y extends T59{
        public void mX() {
            System.out.println("Xm2");
        }
        public void mY() {
            System.out.println("Ym");
        }


    public static void main(String[] args) {
        T59 xRef = new Y();
        Y yRef = (Y)xRef;
        yRef.mY();
        xRef.mX();
    }
}
