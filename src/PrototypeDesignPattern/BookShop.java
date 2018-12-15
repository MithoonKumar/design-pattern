package PrototypeDesignPattern;

import java.util.ArrayList;

public class BookShop implements Cloneable{
    private String shopName;
    private int k;
    private ArrayList<Book> books = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for(int i=0; i<=10; i++) {
            Book book =  new Book();
            book.setbId(i);
            book.setBookName("book " + i);
            this.books.add(book);
        }
    }

    @Override
    public String toString() {
        String str = this.shopName + ": ";
        for (Book book : this.books) {
            str+=("id: " + book.getbId() + " name: " + book.getBookName() + " ");
        }
        return str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // we are calling the clone method of Object class which is defined in native. The implementation of the method is not visible in the object class
        //It will return a shallow copy
        return super.clone();
    }
}
