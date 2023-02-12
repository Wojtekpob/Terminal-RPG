package characters;

import characters.CharacterExceptions.NegativeHpException;

public abstract class Character {
    private int hp;
    private String name;
    private int armor;


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

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public abstract int takeDamage(int damage);

    public abstract void doAction();
}
