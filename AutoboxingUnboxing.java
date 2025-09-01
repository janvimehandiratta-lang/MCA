//program 9
public class AutoboxingUnboxing {
    public static void main(String[] args) {

        // 🔁 Autoboxing: converting primitive to object (Wrapper class)
        int num = 100;
        Integer obj = num; // int to Integer (autoboxing)
        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer: " + obj);

        // 🔁 Unboxing: converting object (Wrapper) to primitive
        Integer wrapperObj = new Integer(200);
        int primitive = wrapperObj; // Integer to int (unboxing)
        System.out.println("\nUnboxing:");
        System.out.println("Wrapped Integer: " + wrapperObj);
        System.out.println("Unboxed int: " + primitive);
    }
}
