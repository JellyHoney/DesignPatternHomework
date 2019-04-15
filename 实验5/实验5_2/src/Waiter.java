public class Waiter {
    public SetMeal construct(SetMealBuilder setMealBuilder){
        setMealBuilder.buildMainMeal();
        setMealBuilder.buildJuice();
        return setMealBuilder.createSetMeal();
    }
}
