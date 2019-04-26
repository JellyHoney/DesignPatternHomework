abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void Add(Company c);

    public abstract void Delete(Company c);

    public abstract void display();
}
