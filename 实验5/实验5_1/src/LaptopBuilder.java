public class LaptopBuilder extends Builder {
    @Override
    public void buildCPU() {
        pc.setCPU("Laptop CPU");
    }

    @Override
    public void buildRAM() {
        pc.setRAM("Laptop RAM");
    }

    @Override
    public void buildHDD() {
        pc.setHDD("Laptop HDD");
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("Laptop Monitor");
    }
}
