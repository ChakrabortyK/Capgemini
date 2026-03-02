
public class SubstringIteration {

    public static boolean isSubstring(String str, String pattern) {

        int n = str.length();
        int m = pattern.length();

        // If pattern longer than string
        if (m > n) return false;

        
        for (int i = 0; i <= n - m; i++) {

            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }


            if (j == m) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "hello world";
        String pattern = "world";

        System.out.println(isSubstring(str, pattern));
    }
}
