// Concrete prototypes
class Dog implements CloneableAnimal {
    private String name;


    public Dog(String name) {
        this.name = name;
    }


    @Override
    public CloneableAnimal clone() {
        return new Dog(name); // Shallow copy is sufficient as String is immutable
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
