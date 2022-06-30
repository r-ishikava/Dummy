/**BuySomeItemsGetOneFree class.
 *
 */
public class BuySomeItemsGetOneFree extends DiscountPolicy {
    private int nvalue;

    public BuySomeItemsGetOneFree(int quantity, double price, int nvalue) {
        super(quantity, price);
        setN(nvalue);
    }

    @Override
    public double getFinalPrice() { 
        return getFullPrice() - getDiscount();
    }

    @Override
    public double getDiscount() {
        return nvalue * getPrice();
    }

    public void setN(int n) {
        this.nvalue = n;
    }
    
    public int getN() {
        return this.nvalue;
    }

    public static void main(String[] args) {
        var disc1 = new BuySomeItemsGetOneFree(10, 250, 1);
        System.out.println(disc1.getFinalPrice());
    }
}
