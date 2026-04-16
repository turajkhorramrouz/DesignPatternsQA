public class Singleton {


    // Private static instance variable
    private static Singleton instance;


    // Private constructor to prevent direct instantiation
    private Singleton() {}


    // Static method for accessing the Singleton instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
