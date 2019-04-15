abstract class Builder {
    protected PC pc = new PC();

    public abstract void buildCPU();

    public abstract void buildRAM();

    public abstract void buildHDD();

    public abstract void buildMonitor();

    public PC createPC() {
        return pc;
    }
}
