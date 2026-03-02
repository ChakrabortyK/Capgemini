// Abstract class 
abstract class Parent {

    private static int pin = 2233;          // private data
    private long balanceSavings;
    private long balanceCurrent;

    // Constructor overloading
    public Parent(long amt) {
        this.balanceCurrent = amt;
    }

    public Parent(long amt, int pin) {
        if (pin == Parent.pin) {
            this.balanceSavings = amt;
        }
    }

    public long getSavingsBalance(int pin) {
        if (pin == Parent.pin)
            return balanceSavings;
        return -1;
    }

    public long getCurrentBalance() {
        return balanceCurrent;
    }

    abstract void accountType(); //meth ovrd
}

class Child extends Parent {

    public Child(long amt) {
        super(amt);
    }

    public Child(long amt, int pin) {
        super(amt, pin);
    }

    // Method overriding
    @Override
    void accountType() {
        System.out.println("Child Account");
    }
}

public class OOPS {

    public static void main(String[] args) {

        Parent obj = new Child(5000, 2233);

        obj.accountType();  // runtime poly

        System.out.println("Savings Balance: " + obj.getSavingsBalance(2233));
        System.out.println("Current Balance: " + obj.getCurrentBalance());
    }
}
