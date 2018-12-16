package CreationalDesignPattern.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs1 = new BookShop();
        bs1.setShopName("firstShop");
        bs1.loadData();
        BookShop bs2 = new BookShop();
        bs2 = (BookShop) bs1.clone();
        bs2.setShopName("secondShop");
        bs2.getBooks().remove(0);
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
