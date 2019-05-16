public class Client {

    public static void main(String[] args) {
        CalculatorForm cf = new CalculatorForm();
        Command add = new AddCommand();
        cf.setCommand(add);
        cf.compute(2);
        cf.compute(3);
        cf.undo(5);

    }

}
