public class Client {
    public static void main(String[] args){
        ConcreteCompany root=new ConcreteCompany("北京总部");
        root.Add(new Office("教务办公室"));
        root.Add(new Office("行政办公室"));
        ConcreteCompany comp=new ConcreteCompany("湖南分校");
        comp.Add(new Office("湖南分校教务办公室"));
        comp.Add(new Office("湖南分校行政办公室"));
        root.Add(comp);
        ConcreteCompany comp1=new ConcreteCompany("长沙教学点");
        comp1.Add(new Office("长沙教学点教务办公室"));
        comp1.Add(new Office("长沙教学点教务办公室"));
        comp.Add(comp1);
        ConcreteCompany comp2=new ConcreteCompany("湘潭教学点");
        comp2.Add(new Office("湘潭教学点教务办公室"));
        comp2.Add(new Office("湘潭教学点教务办公室"));
        comp.Add(comp2);
        root.Announce();
    }

}
