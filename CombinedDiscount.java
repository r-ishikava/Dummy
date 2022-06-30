/**foo.
 *
 */
public class CombinedDiscount extends DiscountPolicy {
    private DiscountPolicy disc1;
    private DiscountPolicy disc2;

    /**foo.
     *
     * @param quantity wqd
     * @param price qw
     * @param disc1 wqd
     * @param disc2 qwqwq
     */
    public CombinedDiscount(int quantity, double price,
                            DiscountPolicy disc1, DiscountPolicy disc2) {
        super(quantity, price);
        setDisc1(disc1);
        setDisc2(disc2);
    }

    @Override
    public double getDiscount() {
        return 1;
    }

    public void teste() {
        System.out.println(disc1.getDiscount());
        System.out.println(disc2.getDiscount());
    }

    @Override
    public double getFinalPrice() {
        return getFullPrice() - getDiscount();
    }

    public void setDisc1(DiscountPolicy disc1) {
        this.disc1 = disc1;
    }

    public void setDisc2(DiscountPolicy disc2) {
        this.disc2 = disc2;
    }

    public DiscountPolicy getDisc1() {
        return this.disc1;
    }

    public DiscountPolicy getDisc2() {
        return this.disc2;
    }

    /**main method.
     *
     * @param args dqwdwqd
     */
    public static void main(String[] args) {
        var o1 = new BulkDiscount(10, 250, 5, 0.5);
        var o2 = new BuySomeItemsGetOneFree(10, 250, 1);
        var o3 = new CombinedDiscount(10, 250, o1, o2);

        o3.getDisc1();
    }
}
