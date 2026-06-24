public class FactoryTest {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("DOG");
        a1.speak();

        Animal a2 = AnimalFactory.getAnimal("CAT");
        a2.speak();
    }
}