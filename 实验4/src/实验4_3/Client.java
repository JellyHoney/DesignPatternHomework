package 实验4_3;

public class Client {
    public static void main(String[] args){
        Computer com=new PC();
        CPU cpu=com.GetCPU();
        RAM ram=com.GetRAM();

        com=new Mac();
        cpu=com.GetCPU();
        ram=com.GetRAM();

    }
}
