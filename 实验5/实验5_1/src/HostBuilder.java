public class HostBuilder extends Builder{
    @Override
    public void buildCPU() {
        pc.setCPU("Host CPU");
    }

    @Override
    public void buildRAM() {
        pc.setRAM("Host RAM");
    }

    @Override
    public void buildHDD() {
        pc.setHDD("Host HDD");
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("Host Monitor");
    }
}
