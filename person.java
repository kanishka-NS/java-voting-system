package votingsystem;

public abstract class person {
    protected String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
