/**Discount Policy class.
 *
 */
public abstract class DiscountPolicy {
    private int quantity;
    private double price;

    public DiscountPolicy(int quantity, double price) {
        setQuantity(quantity);
        setPrice(price);
    }

    public abstract double getDiscount();

    public double getFullPrice() {
        return price * quantity;
    }

    public abstract double getFinalPrice();

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    
    public double getPrice() {
        return this.price;
    }
}
