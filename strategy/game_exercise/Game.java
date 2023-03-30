package game_exercise;

public class Game {
    public static void main(String[] args) {
        System.out.println("Game starts");
        Character character = new Knight();
        character.fight();
        character = new King();
        character.fight();
        character.setFightBehavior(new Shoot());
        character.fight();
        System.out.println("Game over");
    }
}
