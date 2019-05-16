public class SystemExitClass implements Command {
    private Function function;

    public SystemExitClass(Function function) {
        this.function = function;
    }

    @Override
    public void execute() {
        function.SystemExit();
    }
}
