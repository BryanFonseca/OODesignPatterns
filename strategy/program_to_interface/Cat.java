package program_to_interface;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + " is meowing.");
    }
}
