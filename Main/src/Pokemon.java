//superclass
public class Pokemon {
    //variables
    private int level;
    private String name;

    //constructor
    public Pokemon(int level, String name) {
        this.level = level;
        this.name = name;
    }

    //methods
    public void attack () {
        System.out.println(name + " attacking ");
    }
    public void defend () {
        System.out.println(name + " defending ");
    }

    //getters
    public int getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }

    //setters
    public void setLevel(int level) {
        this.level = level;
    }
    public void setName(String name) {
        this.name = name;
    }

    //override tostring method
    @Override
    public String toString() {
        return "Pokemon level = " + level + ", name = " + name + "";
    }
}
