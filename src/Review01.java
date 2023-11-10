
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax;
        tax = tax(price);
        int taxInPrice = price + tax;
        System.out.println(price + "円の商品の税込価格は" + taxInPrice + "円（消費税は" + tax + "円）です。");
    }

    public static int tax(int price) {
        int per = 10;
        int tax = price * per / 100;
        return tax;
    }
}
