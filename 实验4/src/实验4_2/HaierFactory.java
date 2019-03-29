package 实验4_2;

public class HaierFactory extends TVFactory {
    public TV produceTV(){
        return new HaierTV();
    }
}
