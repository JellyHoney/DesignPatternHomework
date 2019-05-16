public class Client {
    public static void main(String[] args){
        try{
            Object object =Class.forName(XMLUtilFunction.getFunctionType()).getDeclaredConstructor(Function.class).newInstance(new Function());
            FunctionButton functionButton=new FunctionButton((Command)object);
            functionButton.call();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
