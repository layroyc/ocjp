package planet;

public class Planet {
    public String name;
    public int moons;

        public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planet[] planets = {
             new Planet("Mercury", 0),
             new Planet("Venus", 0),
             new Planet("Earth", 1),
             new Planet("Mars", 2)
        };

        //因为 Java 数组中没有 toString() 方法，所以我如果直接调用数组toStrign()方法的话，只会得到它的内存地址
        System.out.println(planets);//[Lplanet.Planet;@4554617c
        System.out.println(planets[2]);//planet.Planet@74a14482
        System.out.println(planets[2].moons);//1

    }
}
