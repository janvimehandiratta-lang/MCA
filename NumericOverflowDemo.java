public class NumericOverflowDemo {
    public static void main(String[] args) {
        // Integer overflow
        int maxInt = Integer.MAX_VALUE; // 2,147,483,647
        System.out.println("Max int value: " + maxInt);
        int overflowInt = maxInt + 1;
        System.out.println("After overflow (int): " + overflowInt); // Should wrap around

        // Integer underflow
        int minInt = Integer.MIN_VALUE; // -2,147,483,648
        System.out.println("Min int value: " + minInt);
        int underflowInt = minInt - 1;
        System.out.println("After underflow (int): " + underflowInt); // Should wrap around

        // Byte overflow
        byte maxByte = 127;
        System.out.println("Max byte value: " + maxByte);
        byte overflowByte = (byte) (maxByte + 1);
        System.out.println("After overflow (byte): " + overflowByte); // Should be -128

        // Short overflow
        short maxShort = 32767;
        short overflowShort = (short) (maxShort + 1);
        System.out.println("After overflow (short): " + overflowShort); // Should be -32768
    }
}
