public class Adapter implements Cat,Dog{
    private Cat cat;
    private Dog dog;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void speak() {
        dog.speak();
    }
}
