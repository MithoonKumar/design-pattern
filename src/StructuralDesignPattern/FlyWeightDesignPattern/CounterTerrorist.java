package StructuralDesignPattern.FlyWeightDesignPattern;

public class CounterTerrorist implements Player{
    private final String task;
    private String weapon;

    public CounterTerrorist() {
        this.task = "Diffuse the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("The mission of counter terrorist is to " + this.task);
    }
}
