import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList();
        for(int i=0;i<2;++i){
            arrayList.add(i);
        }
        AbstractObjectList obj=new ProductList(arrayList);
        Iterator iterator=obj.createIterator();
        obj.addObject(2);
        obj.addObject(3);
        obj.removeOjbect(2);
        while(!iterator.isLast()){
            System.out.println((int)iterator.currentItem());
            iterator.next();
        }
    }
}
