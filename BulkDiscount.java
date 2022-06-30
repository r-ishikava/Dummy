/**Bulk Discount class.
 *
 */
public class BulkDiscount extends DiscountPolicy {
    private int minQuantity;
    private double discountPercentage;

    /**BulkDiscount initializer.
     *
     * @param quantity the quantity of products
     * @param price the individual price of the products
     * @param minQuantity minumum quantity required for the discount
     * @param discount discount value in percentage
     */
    public BulkDiscount(int quantity, double price, int minQuantity, double discount) {
        super(quantity, price);
        setMinQuanitty(minQuantity);
        setDiscount(discount);
    }

    /**foo.
     *
     */
    @Override
    public double getFinalPrice() {
        if (this.getQuantity() > minQuantity) {
            return getFullPrice() * (1 - discountPercentage);
        }
        return getFullPrice();
    }

    @Override
    public double getDiscount() {
        return getFullPrice() * getDiscountPercentage();
    }

    public void setMinQuanitty(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public void setDiscount(double discount) {
        this.discountPercentage = discount;
    }

    public int getMinQuantity() {
        return this.minQuantity;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public static void main(String[] args) {
        var disc1 = new BulkDiscount(10, 250, 5, 0.5);
        System.out.println(disc1.getFinalPrice());
    }
}
