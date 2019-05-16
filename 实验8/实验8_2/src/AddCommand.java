public class AddCommand extends Command {
    private Adder adder = new Adder();
    private int value;

    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    public int undo(int value) {
        return adder.add(-value);
    }
}
