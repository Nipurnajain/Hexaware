
public class IfelseStatus {
	public static void main(String[] args) {
		// 2.1--------------------------------------------------------------------------------------------------
		String status;
		if(status=="processing") {
			System.out.println("order is not delivered , its under process and will be delivered soon");
		}
		else if(status=="Delivered") {
			System.out.println("Order is delivered");
		}
		else if(status=="Cancelled") {
			System.out.println("Order is cancelled");
		}
	}
}
