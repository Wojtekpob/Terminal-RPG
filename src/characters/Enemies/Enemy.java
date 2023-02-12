package characters.Enemies;

import characters.Action.FightAction;
import characters.Character;

import java.util.List;

public abstract class Enemy extends Character{
    private List<FightAction> possibleActions;

    @Override //TODO implement choosing actions randomly after implementing the RNG class
    public FightAction chooseAction(){
        return possibleActions.get(0);
    }
}
