package program_to_interface;

public class AnimalAdmin {
    public Animal animal;

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void useAnimal() {
        animal.makeSound();
    }
}
