package game_exercise;

public abstract class Character {
    private FightBehavior fightBehavior;
    
    public void setFightBehavior (FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void fight() {
        // Hace referencia a la implementación en específico de Character en tiempo de ejecución
        String className = this.getClass().getSimpleName();
        System.out.println(className + " character is: " + fightBehavior.fight());
    }
}
