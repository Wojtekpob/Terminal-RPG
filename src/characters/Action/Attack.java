package characters.Action;

import characters.Character;
import characters.CharacterExceptions.NegativeDamageException;

public class Attack implements FightAction{
    final Character character;

    public Attack(Character character) {
        this.character = character;
    }

    @Override
    public void execute(Character target) {
        //TODO Implement the attack
        int damage = character.getStrength(); //TODO implement random damage dealing later
        try {
            target.takeDamage(damage);
        } catch (NegativeDamageException e) {
            System.out.println("Damage was negative, didn't deal any.");;
        }
    }
}
