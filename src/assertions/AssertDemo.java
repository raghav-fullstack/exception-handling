package assertions;

public class AssertDemo {
    public static void main(String[] args) {
        int withdrawlAmount = 100;
        int currentBalance = 60;

        assert (withdrawlAmount < currentBalance):"withdrawl amount is more than current balance.";

    }
}
