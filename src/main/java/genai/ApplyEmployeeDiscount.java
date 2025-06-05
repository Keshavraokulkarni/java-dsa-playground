package genai;

public class ApplyEmployeeDiscount {

    //applyEmployeeDiscount function to support seasonal sales
    // e.g., Black Friday = Extra 5% discount, Cyber Monday = 10%
    /**
     * Applies employee discount and additional seasonal sale discount if applicable.
     * @param price Original price
     * @param employeeDiscountPercent Employee discount percentage (e.g., 20 for 20%)
     * @param seasonalSale Type of seasonal sale ("Black Friday", "Cyber Monday", or null/empty)
     * @return Final price after discounts
     */
    public static double applyEmployeeDiscount(double price, double employeeDiscountPercent, String seasonalSale) {
        // Apply employee discount
        double discountedPrice = price * (1 - employeeDiscountPercent / 100.0);

        // Apply extra seasonal discount if applicable
        if (seasonalSale != null) {
            if (seasonalSale.equalsIgnoreCase("Black Friday")) {
                discountedPrice *= 0.95; // Extra 5% off
            } else if (seasonalSale.equalsIgnoreCase("Cyber Monday")) {
                discountedPrice *= 0.90; // Extra 10% off
            }
        }

        return discountedPrice;
    }

    public static void main(String[] args) {
        double price = 200.0;
        double employeeDiscount = 20.0;

        double finalPriceRegular = applyEmployeeDiscount(price, employeeDiscount, null);
        System.out.println("Final price (no sale): $" + finalPriceRegular);

        double finalPriceBlackFriday = applyEmployeeDiscount(price, employeeDiscount, "Black Friday");
        System.out.println("Final price (Black Friday): $" + finalPriceBlackFriday);

        double finalPriceCyberMonday = applyEmployeeDiscount(price, employeeDiscount, "Cyber Monday");
        System.out.println("Final price (Cyber Monday): $" + finalPriceCyberMonday);
    }

}
