import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderConfirmationEmailGenerator {

    public static void main(String[] args) {
        // Example usage:
        String customerName = "John Doe";
        int orderNumber = 12345;
        String deliveryAddress = "456 Main Street, Cityville, State, 12345";
        Date expectedDeliveryDate = new Date(); // Use a real date here

        String orderConfirmationEmail = generateOrderConfirmationEmail(customerName, orderNumber, deliveryAddress, expectedDeliveryDate);
        System.out.println(orderConfirmationEmail);
    }

    public static String generateOrderConfirmationEmail(String customerName, int orderNumber, String deliveryAddress, Date expectedDeliveryDate) {
        // Format the date using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedExpectedDeliveryDate = dateFormat.format(expectedDeliveryDate);

        // Construct the order confirmation email
        String emailBody = "Dear " + customerName + ",\n\n"
                + "Thank you for your order! Your order number is: " + orderNumber + ".\n"
                + "We will deliver your order to the following address:\n"
                + deliveryAddress + "\n\n"
                + "Expected delivery date: " + formattedExpectedDeliveryDate + "\n\n"
                + "Thank you for choosing our services!\n\n"
                + "Sincerely,\nYour Company Name";

        return emailBody;
    }
}

