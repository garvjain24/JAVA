public class StringFunctionsExample {
    public static void main(String[] args) {
        // Sample string for demonstration
        String sampleString = "Hello, World!";

        // 1. Length of a String
        int length = sampleString.length();
        System.out.println("1. Length of the string: " + length);

        // 2. Concatenation
        String anotherString = " How are you?";
        String concatenatedString = sampleString.concat(anotherString);
        System.out.println("2. Concatenated String: " + concatenatedString);

        // 3. Substring
        String substring = sampleString.substring(7); // Starting from index 7 to the end
        System.out.println("3. Substring: " + substring);

        // 4. Character at a specific index
        char charAtIndex = sampleString.charAt(0);
        System.out.println("4. Character at index 0: " + charAtIndex);

        // 5. Index of a specific substring
        int indexOfWorld = sampleString.indexOf("World");
        System.out.println("5. Index of 'World': " + indexOfWorld);

        // 6. Replace characters
        String replacedString = sampleString.replace('l', 'z');
        System.out.println("6. Replaced String: " + replacedString);

        // 7. Uppercase and Lowercase
        String uppercaseString = sampleString.toUpperCase();
        String lowercaseString = sampleString.toLowerCase();
        System.out.println("7. Uppercase: " + uppercaseString);
        System.out.println("   Lowercase: " + lowercaseString);

        // 8. Trim leading and trailing whitespaces
        String stringWithWhitespaces = "    Trim me!   ";
        String trimmedString = stringWithWhitespaces.trim();
        System.out.println("8. Trimmed String: '" + trimmedString + "'");

        // 9. Check if starts/ends with a specific substring
        boolean startsWithHello = sampleString.startsWith("Hello");
        boolean endsWithWorld = sampleString.endsWith("World");
        System.out.println("9. Starts with 'Hello': " + startsWithHello);
        System.out.println("   Ends with 'World': " + endsWithWorld);

        // 10. Splitting a string
        String[] splitArray = sampleString.split(",");
        System.out.println("10. Split String:");
        for (String part : splitArray) {
            System.out.println("   " + part.trim());
        }
    }
}
