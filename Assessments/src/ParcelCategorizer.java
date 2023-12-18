
import java.util.Scanner;

public class ParcelCategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the parcel: ");
        double weight = scanner.nextDouble();

        String category = categorizeParcel(weight);

        System.out.println("The parcel is categorized as: " + category);

        scanner.close();
    }

    public static String categorizeParcel(double weight) {
        String category;

        // Using switch-case to categorize based on weight
        switch (Double.compare(weight, 5.0)) {
            case -1:
                category = "Light";
                break;
            case 0:
            case 1:
                category = "Medium";
                break;
            default:
                category = "Heavy";
                break;
        }

        return category;
    }
}

