import java.util.ArrayList;
import java.util.List;
public class AbstractObjectList implements Aggregate{
    private List<Object> objects;

    public AbstractObjectList(ArrayList objects) {
        this.objects = objects;
    }
    void addObject(Object obj){
        objects.add(obj);
    }
    void removeOjbect(Object obj){
        objects.remove(obj);
    }
    List getObject(){
        return objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
