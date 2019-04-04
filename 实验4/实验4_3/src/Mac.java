public class Mac extends Computer {
    RAM GetRAM() {
        return new MacRAM();
    }

    CPU GetCPU() {
        return new MacCPU();
    }
}
