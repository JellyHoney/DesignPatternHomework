public interface Iterator {
    void next();
    void previous();
    boolean isLast();
    Object getNextItem();
    Object getPrevious();
    Object currentItem();

}
