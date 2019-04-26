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
    public void Announce() {

        System.out.println(name+"收到公文，并向下发公文");
        for(Company company:children){
            company.Announce();
        }
    }
}
