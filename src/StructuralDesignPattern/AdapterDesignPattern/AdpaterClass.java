package StructuralDesignPattern.AdapterDesignPattern;

public class AdpaterClass implements Pen {

    private PilotPen pilotPen =  new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
