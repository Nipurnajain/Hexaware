package com.hexaware.entities;

import java.util.Date;
import java.util.Arrays;

 class User {
    private int userID;
    private String userName;
    private String email;
    private String password;
    private long contactNumber;
    private String address;

   
    public User() {
    }

    
    public User(int userID, String userName, String email, String password, long contactNumber, String address) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", email=" + email + ", password=" + password
                + ", contactNumber=" + contactNumber + ", address=" + address + "]";
    }
}


 class Courier {
    private long courierID;
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private double weight;
    private String status;
    private long trackingNumber;
    private Date deliveryDate;
    private int userId;

    
    public Courier() {
    }

   
    public Courier(long courierID, String senderName, String senderAddress, String receiverName, String receiverAddress,
            double weight, String status, long trackingNumber, Date deliveryDate, int userId) {
        this.courierID = courierID;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.weight = weight;
        this.status = status;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
        this.userId = userId;
    }

    

    public long getCourierID() {
        return courierID;
    }

    public void setCourierID(long courierID) {
        this.courierID = courierID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // toString method
    @Override
    public String toString() {
        return "Courier [courierID=" + courierID + ", senderName=" + senderName + ", senderAddress=" + senderAddress
                + ", receiverName=" + receiverName + ", receiverAddress=" + receiverAddress + ", weight=" + weight
                + ", status=" + status + ", trackingNumber=" + trackingNumber + ", deliveryDate=" + deliveryDate
                + ", userId=" + userId + "]";
    }
}

 class Employee {
    private long employeeID;
    private String employeeName;
    private String email;
    private long contactNumber;
    private String role;
    private double salary;

    
    public Employee() {
    }

    
    public Employee(long employeeID, String employeeName, String email, long contactNumber, String role, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.salary = salary;
    }

    

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", email=" + email
                + ", contactNumber=" + contactNumber + ", role=" + role + ", salary=" + salary + "]";
    }
}


 class Location {
    private long locationID;
    private String locationName;
    private String address;

    
    public Location() {
    }

    
    public Location(long locationID, String locationName, String address) {
        this.locationID = locationID;
        this.locationName = locationName;
        this.address = address;
    }

    

    public long getLocationID() {
        return locationID;
    }

    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "Location [locationID=" + locationID + ", locationName=" + locationName + ", address=" + address + "]";
    }
}


  class CourierCompany {
	    private String companyName;
	    private Courier[] courierDetails;
	    private Employee[] employeeDetails;
	    private Location[] locationDetails;

	    
	    public CourierCompany(String companyName, Courier[] courierDetails, Employee[] employeeDetails,
	            Location[] locationDetails) {
	        this.companyName = companyName;
	        this.courierDetails = courierDetails;
	        this.employeeDetails = employeeDetails;
	        this.locationDetails = locationDetails;
	    }

	    

	    public String getCompanyName() {
	        return companyName;
	    }

	    public void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }

	    public Courier[] getCourierDetails() {
	        return courierDetails;
	    }

	    public void setCourierDetails(Courier[] courierDetails) {
	        this.courierDetails = courierDetails;
	    }

	    public Employee[] getEmployeeDetails() {
	        return employeeDetails;
	    }

	    public void setEmployeeDetails(Employee[] employeeDetails) {
	        this.employeeDetails = employeeDetails;
	    }

	    public Location[] getLocationDetails() {
	        return locationDetails;
	    }

	    public void setLocationDetails(Location[] locationDetails) {
	        this.locationDetails = locationDetails;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "CourierCompany [companyName=" + companyName + ", courierDetails=" + Arrays.toString(courierDetails)
	                + ", employeeDetails=" + Arrays.toString(employeeDetails) + ", locationDetails="
	                + Arrays.toString(locationDetails) + "]";
	    }
	}



    class Payment {
        private long paymentID;
        private long courierID;
        private double amount;
        private Date paymentDate;

        
        public Payment() {
        }

        
        public Payment(long paymentID, long courierID, double amount, Date paymentDate) {
            this.paymentID = paymentID;
            this.courierID = courierID;
            this.amount = amount;
            this.paymentDate = paymentDate;
        }


        public long getPaymentID() {
            return paymentID;
        }

        public void setPaymentID(long paymentID) {
            this.paymentID = paymentID;
        }

        public long getCourierID() {
            return courierID;
        }

        public void setCourierID(long courierID) {
            this.courierID = courierID;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public Date getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
        }

        // toString method
        @Override
        public String toString() {
            return "Payment [paymentID=" + paymentID + ", courierID=" + courierID + ", amount=" + amount
                    + ", paymentDate=" + paymentDate + "]";
        }
    }

    
public class OopsClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
