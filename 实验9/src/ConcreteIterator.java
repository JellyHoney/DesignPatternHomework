public class ConcreteIterator implements Iterator {
    private AbstractObjectList abstractObjectList;
    private int cursor;

    public ConcreteIterator(AbstractObjectList abstractObjectList) {
        this.abstractObjectList = abstractObjectList;
        cursor=0;
    }

    @Override
    public void next() {
        if(cursor<abstractObjectList.getObject().size()){
            cursor++;
        }
    }

    @Override
    public void previous() {
        if(cursor>0){
            cursor--;
        }
    }

    @Override
    public boolean isLast() {
        return cursor==abstractObjectList.getObject().size();
    }

    @Override
    public Object getNextItem() {
        if(cursor+1<abstractObjectList.getObject().size()){
            return abstractObjectList.getObject().get(cursor+1);
        }
        return null;
    }

    @Override
    public Object getPrevious() {
        if(cursor-1>=0){
            return abstractObjectList.getObject().get(cursor-1);
        }
        return null;
    }

    @Override
    public Object currentItem() {
        if(cursor<abstractObjectList.getObject().size()){
            return abstractObjectList.getObject().get(cursor);
        }
        return null;
    }
}
