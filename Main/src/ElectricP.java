public class ElectricP extends Pokemon {
    public ElectricP(int level, String name) {
        super(level, name);
    }
    @Override
    public void attack () {
        System.out.println(this.getName() + " using Thunder punch! ");
    }

    /*
    @Override
    public void defend() {
        System.out.println(getName() + " using Screech! ");
    }
     */
}
