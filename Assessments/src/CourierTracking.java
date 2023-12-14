import java.util.concurrent.TimeUnit;

public class CourierTracking {
	 public static void main(String[] args) {
	        // Simulating courier's starting location
	        double currentLocation = 0.0; // Starting location (can be latitude/longitude)

	        // Destination location (assuming destination is 100 units away)
	        double destination = 100.0;

	        // Simulating courier's movement towards the destination
	        while (currentLocation < destination) {
	            // Move the courier (increment the location)
	            currentLocation += 5.0; // Simulating movement by 5 units (can be replaced by actual GPS tracking)

	            // Display current location
	            System.out.println("Courier's current location: " + currentLocation);

	            // Add a delay to simulate real-time tracking (optional)
	            try {
	                TimeUnit.SECONDS.sleep(1); // Simulating delay between location updates
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Courier has reached the destination
	        System.out.println("Courier has reached the destination at location: " + currentLocation);
	    }
}
