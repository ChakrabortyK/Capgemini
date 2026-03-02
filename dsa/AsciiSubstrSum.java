
public class AsciiSubstrSum {
    public static void main(String[] args) {
        String str = "abab";
        int k = 196; 
        int result = findStartIndex(str, k);
        System.out.println("Starting Indx: " + result);
    }

    public static int findStartIndex(String s, int k) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            currentSum += (int) s.charAt(end);

            while (currentSum > k && start < end) {
                currentSum -= (int) s.charAt(start);
                start++;
            }

            if (currentSum == k) return start;
        }
        return -1;
    }
}