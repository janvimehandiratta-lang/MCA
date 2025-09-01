public class VarExample {
    public static void main(String[] args) {
        var number = 10; // int
        var name = "Alice"; // String
        var price = 19.99; // double
        var isAvailable = true; // boolean
        var numbersList = java.util.List.of(1, 2, 3); // List<Integer>

        System.out.println("number (int): " + number);
        System.out.println("name (String): " + name);
        System.out.println("price (double): " + price);
        System.out.println("isAvailable (boolean): " + isAvailable);
        System.out.println("numbersList (List<Integer>): " + numbersList);
        System.out.println("Length of name: " + name.length());
        System.out.println("First number in list: " + numbersList.get(0));
    }
}
