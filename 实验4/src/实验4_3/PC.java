package 实验4_3;

public class PC extends Computer {
    RAM GetRAM(){
        return new PCRAM();
    }
    CPU GetCPU(){
        return new PCCPU();
    }
}
