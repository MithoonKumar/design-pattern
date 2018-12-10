package CreationalDesignPattern;

import CreationalDesignPattern.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Hello world");
    }
}
