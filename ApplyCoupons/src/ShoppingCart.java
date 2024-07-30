import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount =
                new TypeCouponDecorator(new PercentageCouponDecorator(product, 10), 3, product.getType());
        this.productList.add(productWithEligibleDiscount);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : this.productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
