public class TypePromotionDemo {
    public static void main(String[] args) {
        // byte + byte = int (not byte)
        byte a = 10;
        byte b = 20;
        // byte c = a + b; 
        int c = a + b;     
        System.out.println("byte + byte promoted to int: " + c);

        // char + int = int
        char ch = 'A';     
        int num = 5;
        int result = ch + num; 
        System.out.println("char + int promoted to int: " + result);

        // int + float = float
        int x = 100;
        float y = 12.5f;
        float z = x + y;   
        System.out.println("int + float promoted to float: " + z);

        // long + float = float
        long l = 100000L;
        float f = 10.5f;
        float sum = l + f; 
        System.out.println("long + float promoted to float: " + sum);

        // double + int = double
        double d = 5.5;
        int i = 2;
        double dResult = d + i; 
        System.out.println("double + int promoted to double: " + dResult);
    }
}
