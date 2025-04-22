package testPackage;

public class OverLoading {

    // Method with one parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Method with two parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();

        // Calling method with one argument
        obj.display(10);

        // Calling method with two arguments
        obj.display(10, 20);
    }
}