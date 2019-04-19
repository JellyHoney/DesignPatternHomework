public class Client {
    public static void main(String[] args) {
        Sound sound;
        Lamp lamp;
        CarController car;
        sound = new ConcreteSound();
        lamp = new ConcreteLamp();
        car = new CarAdapter(sound, lamp);
        car.move();
        car.sound();
        car.light();
    }
}
