public class Client {
    public static void main(String[] args){
        Controller controller=new Controller();
        PC pc;
        pc=controller.construct(new DesktopBuilder());
        System.out.println("Desktop");
        System.out.println(pc.getCPU());
        System.out.println(pc.getRAM());
        System.out.println(pc.getHDD());
        System.out.println(pc.getMonitor());
        pc=controller.construct(new LaptopBuilder());
        System.out.println("Laptop");
        System.out.println(pc.getCPU());
        System.out.println(pc.getRAM());
        System.out.println(pc.getHDD());
        System.out.println(pc.getMonitor());
        pc=controller.construct(new HostBuilder());
        System.out.println("Host");
        System.out.println(pc.getCPU());
        System.out.println(pc.getRAM());
        System.out.println(pc.getHDD());
        System.out.println(pc.getMonitor());

    }
}
