import characters.Action.Attack;
import characters.Heroes.Warrior;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Warrior warrior = new Warrior();
        warrior.setHp(12);
        warrior.setArmor(5);
        warrior.setStrength(10);
        System.out.println(warrior.getHp());
        warrior.setPossibleActions(new ArrayList<>(){{add(new Attack(warrior));}});
        warrior.chooseAction().execute(warrior);
        System.out.println(warrior.getHp());
    }
}