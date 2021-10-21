package 继承;

public class Car extends Vehicle {
    /*String trans;
     Car(String trans) {//line n1
        this.trans = trans;
    }
    Car(String type ,int maxSpeed,String trans) {
        super(type,maxSpeed);//line n2
        this.trans=trans;
    }*/
    String trans;
    Car(String trans){ //line n1
        this.trans = trans;
    }
    Car(String type, int maxSpeed, String trans){
        super(type,maxSpeed);
        //this(trans); //line n2
    }
}
