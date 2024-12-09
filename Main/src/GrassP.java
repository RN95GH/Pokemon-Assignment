public class GrassP extends Pokemon {
    public GrassP(int level, String name) {
        super(level,name);
    }
    @Override
    public void attack () {
        System.out.println(getName() + " using Razor leaf! ");
    }

/*
    @Override
    public void defend() {
        System.out.println(getName() + " using Tailwhip! ");
    }
 */
}
