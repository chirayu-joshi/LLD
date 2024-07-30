public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONIC_GOODS);
        Product item2 = new Item2("SOFA", 2000, ProductType.FURNITURE_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println("Total prince after discount: " + cart.getTotalPrice());
    }
}
