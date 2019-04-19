public class Client {
    public static void main(String [] args){
        RobotAdapter robotAdapter=new RobotAdapter(new Dog());
        robotAdapter.run();
        robotAdapter.wang();
        robotAdapter.cry();
        robotAdapter.move();
    }
}
