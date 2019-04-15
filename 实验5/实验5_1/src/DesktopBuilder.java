public class DesktopBuilder extends Builder {
    @Override
    public void buildCPU() {
        pc.setCPU("Desktop CPU");
    }

    @Override
    public void buildRAM() {
        pc.setRAM("Desktop RAM");
    }

    @Override
    public void buildHDD() {
        pc.setHDD("Desktop HDD");
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("Desktop Monitor");
    }
}
