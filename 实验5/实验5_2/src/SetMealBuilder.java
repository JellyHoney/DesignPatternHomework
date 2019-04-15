public abstract class SetMealBuilder {
    protected SetMeal setMeal=new SetMeal();
    public abstract void buildMainMeal();
    public abstract void buildJuice();
    public SetMeal createSetMeal(){
        return setMeal;
    }
}
