// Client
public class PrototypeClient {
    public static void main(String[] args) {
        CloneableAnimal originalDog = new Dog("Buddy");
        CloneableAnimal clonedDog = originalDog.clone();


        CloneableAnimal originalCat = new Cat("Whiskers");
        CloneableAnimal clonedCat = originalCat.clone();


        originalDog.makeSound(); // Output: Buddy says: Woof!
        clonedDog.makeSound();   // Output: Buddy says: Woof!


        originalCat.makeSound(); // Output: Whiskers says: Meow!
        clonedCat.makeSound();   // Output: Whiskers says: Meow!
    }
}
