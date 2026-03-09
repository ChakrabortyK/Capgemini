import java.util.*;

enum CoffeeSize {
    VENTI(20), // Ordinal 0
    TALL(12), // Ordinal 1
    GRANDE(16), // Ordinal 2
    SHORT(8); // Ordinal 3

    private final int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}

public class EnumSort {
    public static void main(String[] args) {
        List<CoffeeSize> sizes = new ArrayList<>(Arrays.asList(
                CoffeeSize.SHORT, CoffeeSize.VENTI, CoffeeSize.GRANDE, CoffeeSize.TALL));

        System.out.println(sizes);
    }
}
