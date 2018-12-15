package PrototypeDesignPattern;

public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShopCopy bs1 = new BookShopCopy();
        bs1.setShopName("firstShop");
        bs1.loadData();
        BookShopCopy bs2 = new BookShopCopy();
        bs2 = bs1.clone();
        bs2.setShopName("secondShop");
        bs2.getBooks().remove(0);
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
