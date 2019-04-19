public class Client {
    public static void main(String[] args){
        Adapter adapter=new Adapter(new ConcreteCat(),new ConcreteDog());
        adapter.catchMouse();
        adapter.speak();
    }
}
