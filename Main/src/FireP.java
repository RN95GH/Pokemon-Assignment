//subclass
public class FireP extends Pokemon {
    //constructor
    public FireP(int level, String name) {
        super(level, name);
    }

    //override attack method
    @Override
    public void attack() {
        System.out.println(getName() + " using Flame thrower! ");
    }

    /*
    //override defense method
    @Override
    public void defend() {
        System.out.println(getName() + " using Defense Curl! ");
    }
     */
}
