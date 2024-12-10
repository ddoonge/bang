package day07;

public class BeverageMain {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("=======================");

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
