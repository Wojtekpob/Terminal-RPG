package characters.Heroes;

import characters.Action.FightAction;
import characters.Character;

import java.util.List;

public abstract class Hero extends Character {
    private List<FightAction> possibleActions;
}
