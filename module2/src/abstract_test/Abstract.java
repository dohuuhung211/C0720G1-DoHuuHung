package abstract_test;

public abstract class Abstract implements Interface{
    int id;
    String name;

    public Abstract(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract void doSomething();

}
