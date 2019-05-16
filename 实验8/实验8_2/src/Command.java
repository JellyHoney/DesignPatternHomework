public abstract class Command {
    public abstract int execute(int value);

    public abstract int undo(int value);
}
