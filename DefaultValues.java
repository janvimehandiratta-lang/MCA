//program7
public class DefaultValues {

    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    String stringVar;

    public void printDefaults() {
        System.out.println("Default values of instance variables:");
        System.out.println("byte     : " + byteVar);
        System.out.println("short    : " + shortVar);
        System.out.println("int      : " + intVar);
        System.out.println("long     : " + longVar);
        System.out.println("float    : " + floatVar);
        System.out.println("double   : " + doubleVar);
        System.out.println("char     : '" + charVar + "'"); // May print empty space
        System.out.println("boolean  : " + booleanVar);
        System.out.println("String   : " + stringVar); // Reference type defaults to null
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        obj.printDefaults();
    }
}
