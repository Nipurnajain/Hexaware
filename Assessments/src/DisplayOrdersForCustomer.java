import java.util.ArrayList;

class Order {
		    private int orderId;
		    private String customerName;
		    private String orderDetails;

		    public Order(int orderId, String customerName, String orderDetails) {
		        this.orderId = orderId;
		        this.customerName = customerName;
		        this.orderDetails = orderDetails;
		    }

		    // Getters for order properties
		    public int getOrderId() {
		        return orderId;
		    }

		    public String getCustomerName() {
		        return customerName;
		    }

		    public String getOrderDetails() {
		        return orderDetails;
		    }
		}

public class DisplayOrdersForCustomer {
	 public static void main(String[] args) {
	        // Sample list of orders
	        List<Order> orders = new ArrayList<>();
	        orders.add(new Order(1, "Customer A", "Details of order 1"));
	        orders.add(new Order(2, "Customer B", "Details of order 2"));
	        orders.add(new Order(3, "Customer A", "Details of order 3"));
	        orders.add(new Order(4, "Customer A", "Details of order 4"));

	        // Specify the customer name to display their orders
	        String specificCustomer = "Customer A";

	        // Display orders for the specific customer using a for loop
	        System.out.println("Orders for " + specificCustomer + ":");
	        for (Order order : orders) {
	            if (order.getCustomerName().equals(specificCustomer)) {
	                System.out.println("Order ID: " + order.getOrderId() + ", Details: " + order.getOrderDetails());
	            }
	        }
	    }
	 }
