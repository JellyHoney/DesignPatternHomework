package 实验4_2;

public class Client {

    public static void main(String[] args) {
        TVFactory tvf=new HisenseFactory();
        TV tv=tvf.produceTV();
        tv.play();
        tvf=new HaierFactory();
        tv=tvf.produceTV();
        tv.play();
    }

}
