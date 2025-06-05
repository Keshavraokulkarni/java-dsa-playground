package genai;

public class EmployeeDiscount
{
    /*
    Employees receive a discount based on their level. Walmart’s policy:
Regular Employee → 10% discount
Senior Employee → 20% discount
Manager → 30% discount

    */
    public static double getDiscount(String employeeLevel) {
        switch (employeeLevel.toLowerCase()) {
            case "regular employee":
                return 0.10;
            case "senior employee":
                return 0.20;
            case "manager":
                return 0.30;
            default:
                return 0.0; // No discount for unknown levels
        }
    }

    public static void main(String[] args) {
        System.out.println(getDiscount("manager1"));
    }

}
