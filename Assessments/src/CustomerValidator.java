import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator {

    public static void main(String[] args) {
        // Example usage:
        validateCustomerInformation("John Doe", "name"); // Valid name
        validateCustomerInformation("123 Main Street", "address"); // Invalid address (contains numbers)
        validateCustomerInformation("555-123-4567", "phone"); // Valid phone number
    }

    public static void validateCustomerInformation(String data, String detail) {
        switch (detail.toLowerCase()) {
            case "name":
                if (isValidName(data)) {
                    System.out.println("Valid name: " + data);
                } else {
                    System.out.println("Invalid name: " + data);
                }
                break;
            case "address":
                if (isValidAddress(data)) {
                    System.out.println("Valid address: " + data);
                } else {
                    System.out.println("Invalid address: " + data);
                }
                break;
            case "phone":
                if (isValidPhoneNumber(data)) {
                    System.out.println("Valid phone number: " + data);
                } else {
                    System.out.println("Invalid phone number: " + data);
                }
                break;
            default:
                System.out.println("Invalid detail type.");
        }
    }

    private static boolean isValidName(String name) {
        // Name should contain only letters and should be properly capitalized
        return name.matches("^[A-Z][a-z]*$");
    }

    private static boolean isValidAddress(String address) {
        // Address should not contain special characters
        return address.matches("^[a-zA-Z0-9 ]*$");
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Phone number should follow the format ###-###-####
        String phonePattern = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
