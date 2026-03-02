public class AlphaPosSum {
    public static void main(String[] args) {
        String str = "apple";
        int k = 32; 
        int result = findStartIndex(str, 17);
        System.out.println("Starting Index: " + result);
    }
    
    public static int findStartIndex(String s, int k) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            currentSum += (s.charAt(end) - 'a' + 1);

            while (currentSum > k && start < end) {
                currentSum -= (s.charAt(start) - 'a' + 1);
                start++;
            }

            if (currentSum == k) return start;
        }
        return -1;
    }
}