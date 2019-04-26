public class Client {
    public static void main(String[] args){
        Plate root=new Plate("水果盘1");
        root.Add(new Apple());
        root.Add(new Apple());
        root.Add(new Apple());
        root.Add(new Apple());
        root.Add(new Apple());
        root.Add(new Banana());
        root.Add(new Pear());
        root.Add(new Pear());

        Plate plate2=new Plate("水果盘2");
        plate2.Add(new Apple());
        plate2.Add(new Apple());
        plate2.Add(new Apple());
        root.Add(plate2);

        Plate plate3=new Plate("水果盘3");
        plate3.Add(new Apple());
        plate2.Add(plate3);

        Plate plate4=new Plate("水果盘4");
        plate4.Add(new Pear());
        plate4.Add(new Pear());
        root.Add(plate4);

        root.eat();
    }

}