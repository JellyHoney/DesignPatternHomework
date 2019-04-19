public class CarAdapter extends CarController {
    private Sound sound;
    private Lamp lamp;

    public CarAdapter(Sound sound, Lamp lamp) {
        this.sound = sound;
        this.lamp = lamp;
    }

    @Override
    public void sound() {
        sound.phonate();
    }

    @Override
    public void light() {
        lamp.twinkle();
    }
}
