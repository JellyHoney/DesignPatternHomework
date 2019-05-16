public class DisplayHelpClass implements Command {
    private Function function;

    public DisplayHelpClass(Function function) {
        this.function = function;
    }

    @Override
    public void execute() {
        function.DisplayHelp();
    }
}
