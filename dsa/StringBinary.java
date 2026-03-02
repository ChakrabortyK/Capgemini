import java.util.Scanner;

public class StringBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (char c : s.toCharArray()) {
            if ((c != '0') && (c != '1')) {
                System.out.println("Not a binary String ");
                break;
            }
        }

        System.out.println("Bin");
    }
}
