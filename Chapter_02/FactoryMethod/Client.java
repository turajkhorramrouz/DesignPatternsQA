// Client Code
public class Client {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.doSomething(); // Output: "Product A does something."


        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.doSomething(); // Output: "Product B does something."
    }
}
