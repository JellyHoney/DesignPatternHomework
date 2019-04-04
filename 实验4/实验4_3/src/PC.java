public class PC extends Computer {
    RAM GetRAM() {
        return new PCRAM();
    }

    CPU GetCPU() {
        return new PCCPU();
    }
}
