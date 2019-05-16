public class CalculatorForm {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void compute(int value) {
        System.out.println(command.execute(value));
    }

    public void undo(int value) {
        System.out.println(command.undo(value));
    }
}
