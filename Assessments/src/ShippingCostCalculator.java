public class ShippingCostCalculator {

    public static void main(String[] args) {
        // Example usage:
        String sourceAddress = "123 Main Street, City A, State";
        String destinationAddress = "456 Market Street, City B, State";
        double parcelWeight = 2.5; // in kilograms

        double shippingCost = calculateShippingCost(sourceAddress, destinationAddress, parcelWeight);
        System.out.println("Shipping Cost: $" + shippingCost);
    }

    public static double calculateShippingCost(String sourceAddress, String destinationAddress, double parcelWeight) {
        // Assume a flat rate for distance and a rate per kilogram for weight
        double distanceRate = 0.10; // $0.10 per kilometer
        double weightRate = 2.50; // $2.50 per kilogram

        // Calculate the linear distance between source and destination (simplified for demonstration)
        double distance = calculateLinearDistance(sourceAddress, destinationAddress);

        // Calculate the shipping cost based on distance and weight
        double shippingCost = distance * distanceRate + parcelWeight * weightRate;

        return shippingCost;
    }

    private static double calculateLinearDistance(String sourceAddress, String destinationAddress) {
        // For simplicity, assume a linear distance between source and destination
        // In a real-world scenario, you might use a distance calculation library or API
        return 50.0; // Example: 50 kilometers
    }
}

