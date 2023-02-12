package characters.Action;

import characters.Character;

public class Attack implements FightAction{
    final Character character;

    public Attack(Character character) {
        this.character = character;
    }

    @Override
    public void execute(Character target) {
        //TODO Implement the attack
    }
}
