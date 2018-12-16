package StructuralDesignPattern.FlyWeightDesignPattern;

public class Terrorist implements Player {
    private  final String task ;
    private String weapon;

    public Terrorist() {
        task = "Plant the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("The mission of this terrorist player is to " + task);
    }
}
