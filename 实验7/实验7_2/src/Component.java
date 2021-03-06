abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component c);

    public abstract void Delete(Component c);

    public abstract void eat();
}
