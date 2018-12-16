package StructuralDesignPattern.AdapterDesignPattern;

public class Main {

    public static void main(String[] args) {
        Pen p = new AdpaterClass();
        p.write("Hello World ! I learnt using adpater");
    }
}
