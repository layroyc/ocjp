package 断言;

public class T748 {
    double fuelLevel;
    T748(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void start(){
//line n1
        assert fuelLevel > 0 : "Impossbile fuel " ;
        System.out.println("started");
    }
    public void stop(){
        System.out.println("Stopped");
    }
}
