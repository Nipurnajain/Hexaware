import java.util.Arrays;

public class CourierSystem {

    public static void main(String[] args) {
        // Example usage:
        String[] parcelTrackingHistory = {"City A", "City B", "City C", "City D"};
        String[] availableCouriers = {"Courier1", "Courier2", "Courier3"};

        // Find the nearest available courier for a new order
        String nearestCourier = findNearestCourier("City D", availableCouriers);
        System.out.println("Nearest Available Courier: " + nearestCourier);
    }

    public static String findNearestCourier(String destination, String[] availableCouriers) {
        int minDistance = Integer.MAX_VALUE;
        String nearestCourier = null;

        for (String courier : availableCouriers) {
            int distance = calculateDistance(courier, destination);
            if (distance < minDistance) {
                minDistance = distance;
                nearestCourier = courier;
            }
        }

        return nearestCourier;
    }

    private static int calculateDistance(String location1, String location2) {
        // For simplicity, assume a linear distance between locations
        // In a real-world scenario, you might use a distance calculation library or API
        String[] locations = {"City A", "City B", "City C", "City D"};
        int index1 = Arrays.asList(locations).indexOf(location1);
        int index2 = Arrays.asList(locations).indexOf(location2);

        return Math.abs(index1 - index2);
    }
}

