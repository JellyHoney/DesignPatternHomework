import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company>  children=new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        children.add(c);
    }

    @Override
    public void Delete(Company c) {
        children.remove(c);
    }

    @Override
    public void display() {
        System.out.println(name);
        for(Object obj:children){
            ((Company)obj).display();
        }
    }

}
