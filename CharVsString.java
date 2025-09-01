public class CharVsString {
    public static void main(String[] args) {
        char letter = 'A';
        String word = "Apple";

        System.out.println("Character (char): " + letter);
        System.out.println("String (String): " + word);

        System.out.println("Length of char (always 1): " + 1);
        System.out.println("Length of String: " + word.length());

        char nextLetter = (char) (letter + 1); // 'B'
        System.out.println("Next character after '" + letter + "': " + nextLetter);

        String upper = word.toUpperCase();
        System.out.println("Uppercase String: " + upper);
    }
}
