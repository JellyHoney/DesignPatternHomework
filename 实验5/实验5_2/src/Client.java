public class Client {
    public static void main(String [] args){
        Waiter waiter=new Waiter();
        SetMealBuilder setMealBuilder;
        SetMeal setMeal;

        System.out.println("套餐A");
        setMeal=waiter.construct(new SetMealABuilder());
        System.out.println(setMeal.getMainMeal());
        System.out.println(setMeal.getJuice());


        System.out.println("套餐B");
        setMeal=waiter.construct(new SetMealBBuilder());
        System.out.println(setMeal.getMainMeal());
        System.out.println(setMeal.getJuice());
    }
}
