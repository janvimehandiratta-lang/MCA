import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);

        String hexadecimal = Integer.toHexString(number);

        System.out.println("Binary representation: " + binary);
        System.out.println("Hexadecimal representation: " + hexadecimal.toUpperCase());

        scanner.close();
    }
}
