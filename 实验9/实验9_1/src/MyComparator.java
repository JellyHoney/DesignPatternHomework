import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((Student)o1).getAge()<((Student)o2).getAge())?1:-1;
    }
}
