public class RobotAdapter extends Robot{
    private Dog dog;

    public RobotAdapter(Dog dog) {
        this.dog = dog;
    }

    public void wang() {
        dog.wang();
    }

    public void run() {
        dog.run();
    }
}
