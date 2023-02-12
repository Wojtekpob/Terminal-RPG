package characters;

import characters.CharacterExceptions.NegativeHpException;
import characters.CharacterExceptions.WrongArmorException;
import characters.CharacterExceptions.WrongStrengthException;

public abstract class Character {
    private int hp;
    private String name;
    private int armor;
    private int strength;


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws NegativeHpException {
        if (hp < 0) {
            throw new NegativeHpException();
        }
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) throws WrongArmorException {
        if (armor <= 0) {
            throw new WrongArmorException();
        }
        this.armor = armor;
    }

    public abstract void takeDamage(int damage);

    public abstract void doAction();

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) throws WrongStrengthException {
        if (strength <= 0) {
            throw new WrongStrengthException();
        }
        this.strength = strength;
    }
}
