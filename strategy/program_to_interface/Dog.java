package program_to_interface;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " is barking.");
    }
}
