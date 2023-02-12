package characters.Heroes;

import characters.Action.FightAction;
import characters.Character;

import java.util.List;
import java.util.Scanner;

public abstract class Hero extends Character {
    public List<FightAction> possibleActions;
    public void displayActions(){
        for (FightAction action: possibleActions){
            System.out.println("1."+action);
        }
    }

    public FightAction chooseAction() {
        //TODO handle wrong input from user
        displayActions();
        System.out.println("Pick action");
        int inp;
        try {
            Scanner scanner = new Scanner(System.in);
            inp = scanner.nextInt();
        } catch (Exception e) { //TODO add the specific conversion exception instead of Exception
            return chooseAction();
        }
        return possibleActions.get(inp);
    }

    public void setPossibleActions(List<FightAction> possibleActions) {
        this.possibleActions = possibleActions;
    }
}
