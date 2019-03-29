package 实验4_2;

public class HisenseFactory extends TVFactory {
    public TV produceTV(){
        return new HisenseTV();
    }
}
