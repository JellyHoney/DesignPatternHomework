public class Client {
    public static void main(String[] args){
        Adapter adapter=new Adapter();
        adapter.setCat(new ConcreteCat());
        adapter.setDog(new ConcreteDog());
        adapter.catchMouse();
        adapter.speak();
    }
}
