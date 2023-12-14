import java.util.Scanner;

public class ParcelTrackingSystem {
    public static void main(String[] args) {
        // Initialize a 2D String array with tracking numbers and statuses
        String[][] parcelStatusArray = {
                {"123456789", "Parcel in transit"},
                {"987654321", "Parcel out for delivery"},
                {"456789123", "Parcel delivered"}
        };

        // Display initial status
        displayStatus(parcelStatusArray);

        // Allow users to input a parcel tracking number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parcel tracking number: ");
        String inputTrackingNumber = scanner.nextLine();

        // Find and display status based on the entered tracking number
        findAndDisplayStatus(inputTrackingNumber, parcelStatusArray);
    }

    // Display the current status of all parcels
    private static void displayStatus(String[][] parcelStatusArray) {
        System.out.println("Current Parcel Status:");
        for (String[] parcel : parcelStatusArray) {
            System.out.println("Tracking Number: " + parcel[0] + ", Status: " + parcel[1]);
        }
        System.out.println();
    }

    // Find and display the status of a specific parcel based on the tracking number
    private static void findAndDisplayStatus(String trackingNumber, String[][] parcelStatusArray) {
        boolean found = false;
        for (String[] parcel : parcelStatusArray) {
            if (parcel[0].equals(trackingNumber)) {
                found = true;
                displayStatusMessage(parcel[1]);
                break;
            }
        }
        if (!found) {
            System.out.println("Parcel tracking number not found.");
        }
    }

    // Display status message based on the status
    private static void displayStatusMessage(String status) {
        switch (status) {
            case "Parcel in transit":
                System.out.println("Parcel is currently in transit.");
                break;
            case "Parcel out for delivery":
                System.out.println("Parcel is out for delivery.");
                break;
            case "Parcel delivered":
                System.out.println("Parcel has been delivered.");
                break;
            default:
                System.out.println("Invalid status.");
        }
    }
}
