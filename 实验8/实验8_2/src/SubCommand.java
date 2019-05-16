public class SubCommand extends Command {
    private Suber suber = new Suber();
    private int value;

    public int execute(int value) {
        this.value = value;
        return suber.sub(value);
    }

    public int undo(int value) {
        return suber.sub(-value);
    }
}
