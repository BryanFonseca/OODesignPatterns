package game_exercise;

public class King extends Character {
    public King() {
        setFightBehavior(new Kick());
    }

    public King(FightBehavior fightBehavior) {
        setFightBehavior(fightBehavior);
    }
}
