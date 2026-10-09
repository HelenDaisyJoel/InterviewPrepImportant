package javaLearnings;

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive data type
        int num = 10;

        // Wrapper class
        Integer wrappedNum = Integer.valueOf(num); // Boxing

        // Auto-boxing (Java automatically converts primitive to wrapper)
        Integer autoBoxed = num;

        // Unboxing (Wrapper to primitive)
        int unboxed = wrappedNum.intValue();

        // Auto-unboxing
        int autoUnboxed = wrappedNum;

        System.out.println("Primitive: " + num);
        System.out.println("Wrapped: " + wrappedNum);
        System.out.println("Auto-boxed: " + autoBoxed);
        System.out.println("Unboxed: " + unboxed);
        System.out.println("Auto-unboxed: " + autoUnboxed);
    }
}

