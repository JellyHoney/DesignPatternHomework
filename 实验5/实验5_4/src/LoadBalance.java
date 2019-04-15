public class LoadBalance {
    private LoadBalance(){
        System.out.println("Load Balance constructor");
    };
    private static class Holder{
        private static LoadBalance instance=new LoadBalance();
    }
    public static LoadBalance getInstance() {
        return Holder.instance;
    }
    public void fun(){
        System.out.println("fun");
    }
}
