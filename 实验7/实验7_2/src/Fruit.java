class Fruit extends Component {
    public Fruit(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {

    }

    @Override
    public void Delete(Component c) {

    }

    @Override
    public void eat() {
        System.out.println("吃掉了"+name);
    }
}
