public class Client {
    public static void main(String[] args){
        LoadBalance loadBalance=LoadBalance.getInstance();
        loadBalance.fun();
        LoadBalance loadBalance1=LoadBalance.getInstance();
        loadBalance1.fun();
    }
}
