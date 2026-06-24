public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("DOG")) return new Dog();
        if (type.equalsIgnoreCase("CAT")) return new Cat();
        return null;
    }
}