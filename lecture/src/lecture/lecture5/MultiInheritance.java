package lecture.lecture5;

public class MultiInheritance implements Base, Main {

    private int goods;
    private double price;
    private double tPrice;

    public MultiInheritance() {
    }

    public MultiInheritance(int goods, double price, double tPrice) {
        this.goods = goods;
        this.price = price;
        this.tPrice = tPrice;
    }

    @Override
    public double basecounting() {
        return goods;
    }

    @Override
    public double maincountin() {
        tPrice=price*price;
        return tPrice;
    }

    @Override
    public int countin() {
        return 0;
    }

    public static void main (String ...args) {
        MultiInheritance m = new MultiInheritance(20,15,0);

        System.out.println(m.basecounting());
        System.out.println(m.maincountin());
        System.out.println(m.countin());
        Main m1 = (Main)m;
        System.out.println(m1.countin());
    }
}
