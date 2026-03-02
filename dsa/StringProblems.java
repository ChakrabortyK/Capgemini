
public class StringProblems {
    public static int getLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty())
            return 0;

        
        int count = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !isWord) {
                isWord = true;
                count++;
            } else if (str.charAt(i) == ' ') {
                isWord = false;
            }
        }
        return count;
    }

    public static boolean isBinary(String str) {
    for (char c : str.toCharArray()) {
        if (c != '0' && c != '1') {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
String testStr = "Hello 1010 World";
        String binaryStr = "101101";

        // Length without length()
        System.out.println("Length: " + getLength(testStr));

        // remove Spaces
    System.out.println("No Spaces: " + removeSpaces(testStr));

        // word Count
        System.out.println("Word Count: " + countWords(testStr));

        // bin Check
        System.out.println("Is '" + binaryStr + "' binary? " + isBinary(binaryStr));
        System.out.println("Is '" + testStr + "' binary? " + isBinary(testStr));

    }
}
