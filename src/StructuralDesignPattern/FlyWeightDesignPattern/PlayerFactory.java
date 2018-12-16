package StructuralDesignPattern.FlyWeightDesignPattern;

import java.util.HashMap;

public class PlayerFactory {

    private static  HashMap<String, Player> hashMap = new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;

        if (hashMap.containsKey(type)) {
            p = hashMap.get(type);
        } else {
            if (type.equals("terrorist")) {
                p = new Terrorist();
            } else if(type.equals("counterTerrorist")){
                p = new CounterTerrorist();
            }
            hashMap.put(type, p);
        }
        return p;
    }

}
