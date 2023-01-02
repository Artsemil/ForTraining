package codewars;

public class PizzaPayments {

    public static double michaelPays(double cost) {
        double payAmountMichael;
        double payAmountKate;
        if (cost < 5) return round(cost,2);
        else {
            payAmountKate = cost / 3;
            if (payAmountKate > 10) {
                payAmountMichael = cost - 10;
            } else {
                payAmountMichael = cost - payAmountKate;
            }
        }
        return round(payAmountMichael,2);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
