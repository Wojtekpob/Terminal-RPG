package characters.Heroes;

import characters.Character;
import characters.CharacterExceptions.NegativeDamageException;
import characters.CharacterExceptions.NegativeHpException;

public class Warrior extends Hero {

    @Override
    public void takeDamage(int damage) throws NegativeDamageException {
        if (damage<0){
            throw new NegativeDamageException();
        }
        int reducedDamage=damage*getArmor()/10;
        setHp(getHp()-reducedDamage);
    }

}
