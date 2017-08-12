package Builder;

public class Main {
    public static void main(String[] args){
        MealBuilder mealBuilder=new MealBuilder();
        Meal vegMeal=mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
