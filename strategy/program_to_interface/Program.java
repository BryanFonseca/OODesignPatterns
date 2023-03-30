package program_to_interface;

public class Program {
    public static void main(String[] args) {
        // The AnimalAdmin class does not need to know about the actual types 
        // since it's relying on polymorphism
        AnimalAdmin animalAdmin = new AnimalAdmin();
        animalAdmin.setAnimal(new Dog("Max"));
        animalAdmin.useAnimal();
        animalAdmin.setAnimal(new Cat("Luis"));
        animalAdmin.useAnimal();
    }
}