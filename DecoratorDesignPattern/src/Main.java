import base.BasePizza;
import base.VegDelight;
import decorator.ExtraCheese;
import decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza vegDelightWithExtraCheese = new ExtraCheese(new VegDelight());
        int bill = vegDelightWithExtraCheese.cost();
        System.out.println("Bill for Veg Delight with Extra Cheese is: " + bill);

        BasePizza vegDelightWithExtraCheeseAndMushroom = new Mushroom(vegDelightWithExtraCheese);
        int updatedBill = vegDelightWithExtraCheeseAndMushroom.cost();
        System.out.println("Bill for Veg Delight with Extra Cheese and Mushroom is: " + updatedBill);
    }
}
