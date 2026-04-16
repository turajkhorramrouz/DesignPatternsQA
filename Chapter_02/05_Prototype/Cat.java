class Cat implements CloneableAnimal {
    private String name;


    public Cat(String name) {
        this.name = name;
    }


    @Override
    public CloneableAnimal clone() {
        return new Cat(name); // Shallow copy is sufficient as String is immutable
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
