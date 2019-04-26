import java.util.ArrayList;
import java.util.List;

public class Plate extends Component {
    private List<Component>  children=new ArrayList<Component>();

    public Plate(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Delete(Component c) {

    }

    @Override
    public void eat() {
        System.out.println("吃掉了水果盘");
        for(Component component:children){
            component.eat();
        }
    }

}
