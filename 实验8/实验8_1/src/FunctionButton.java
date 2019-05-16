public class FunctionButton {
    private Command command;

    public FunctionButton(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
