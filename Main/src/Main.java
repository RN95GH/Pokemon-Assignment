public class Main {
    public static void main(String[] args) {
        //create pokemon object
        FireP hitukage = new FireP(4, "Hitukage");
        WaterP zenigame = new WaterP(1, "Zenigame");
        GrassP fushigidane = new GrassP(2, "Fushigidane");
        ElectricP pikachu = new ElectricP(3, "Pikachu");


        //test attack method
        hitukage.attack();
        zenigame.attack();
       /* fushigidane.attack();
        pikachu.attack();*/
/*
        //create defense method
        hitukage.defend();
        zenigame.defend();
        fushigidane.defend();
        pikachu.defend();
        */

//test getters
        System.out.println(zenigame.getName()+" is level "+zenigame.getLevel());
        zenigame.setLevel(5); //test setter level
        System.out.println(zenigame.getName()+" is now level "+zenigame.getLevel());
//test setter name
       zenigame.setName("Squirtle!");
       System.out.println(" Zenigame name is now "+zenigame.getName());

//test override toString
        System.out.println(hitukage);
        System.out.println(zenigame);
       /* System.out.println(fushigidane);
        System.out.println(pikachu);*/
    }
}
