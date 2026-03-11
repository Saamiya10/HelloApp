public class HelloWorld {
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if user provided a name
        if (args.length > 0) {
            name = args[0];
        }

        // Display personalized greeting
        System.out.println("Hello " + name + "!");
    }
}