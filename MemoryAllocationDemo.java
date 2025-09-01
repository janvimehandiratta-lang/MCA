public class MemoryAllocationDemo {
    // A simple class with one field (used for reference type)
    static class MyObject {
        int value;

        MyObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Primitive variable
        int primitiveA = 10;
        int primitiveB = primitiveA; // Copy of the value is made

        // Change primitiveB
        primitiveB = 20;

        System.out.println("Primitive Variables:");
        System.out.println("primitiveA = " + primitiveA); // Still 10
        System.out.println("primitiveB = " + primitiveB); // Changed to 20

        // Reference variable
        MyObject refA = new MyObject(10);
        MyObject refB = refA; // Both point to the same object in heap

        // Change value via refB
        refB.value = 20;

        System.out.println("\nReference Variables:");
        System.out.println("refA.value = " + refA.value); // Will be 20
        System.out.println("refB.value = " + refB.value); // Also 20
    }
}
