public class ConstructorTypesExample {
    private int id;
    private String name;

    // Default Constructor
    public ConstructorTypesExample() {
        System.out.println("Default Constructor");
        this.id = 0;
        this.name = "Default";
    }

    // Parameterized Constructor
    public ConstructorTypesExample(int id, String name) {
        System.out.println("Parameterized Constructor");
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public ConstructorTypesExample(ConstructorTypesExample other) {
        System.out.println("Copy Constructor");
        this.id = other.id;
        this.name = other.name;
    }

    // Method to display object details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        ConstructorTypesExample defaultConstructorObj = new ConstructorTypesExample();
        System.out.println("Details of defaultConstructorObj:");
        defaultConstructorObj.displayDetails();
        System.out.println();

        // Using Parameterized Constructor
        ConstructorTypesExample parameterizedConstructorObj = new ConstructorTypesExample(1, "John");
        System.out.println("Details of parameterizedConstructorObj:");
        parameterizedConstructorObj.displayDetails();
        System.out.println();

        // Using Copy Constructor
        ConstructorTypesExample originalObj = new ConstructorTypesExample(2, "Alice");
        ConstructorTypesExample copyConstructorObj = new ConstructorTypesExample(originalObj);
        System.out.println("Details of originalObj:");
        originalObj.displayDetails();
        System.out.println("Details of copyConstructorObj (copied from originalObj):");
        copyConstructorObj.displayDetails();
    }
}
