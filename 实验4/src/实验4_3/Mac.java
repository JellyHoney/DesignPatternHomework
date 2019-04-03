package 实验4_3;

public class Mac extends Computer{
    RAM GetRAM(){
        return new MacRAM();
    }
    CPU GetCPU(){
        return new MacCPU();
    }
}
