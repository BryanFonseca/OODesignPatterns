package game_exercise;

public class Knight extends Character{
    public Knight() {
        setFightBehavior(new Shoot());
    }

    public Knight(FightBehavior fightBehavior) {
        setFightBehavior(fightBehavior);
    }
}
