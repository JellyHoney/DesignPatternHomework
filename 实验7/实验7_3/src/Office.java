public class Office extends Company {
    public Office(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {

    }

    @Override
    public void Delete(Company c) {

    }

    @Override
    public void Announce() {
        System.out.println(name+"收到公文");
    }
}
