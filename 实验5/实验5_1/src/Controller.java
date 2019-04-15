public class Controller {
    public PC construct(Builder builder){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildHDD();
        builder.buildMonitor();
        return builder.createPC();
    }
}
