public class WaterP extends Pokemon {
    public WaterP(int level, String name) {
        super(level, name);
    }
    @Override
    public void attack () {
        System.out.println(this.getName() + " using Crabhammer! ");
    }

    /*
    @Override
    public void defend() {
        System.out.println(getName() + " using Withdraw! ");
    }
     */
}
