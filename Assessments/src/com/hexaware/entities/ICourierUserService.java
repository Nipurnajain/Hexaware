package com.hexaware.entities;
import java.util.Date;
import java.util.List;

public interface ICourierUserService {
    
    String placeOrder(Courier courierObj);

   
    String getOrderStatus(String trackingNumber);

   
    boolean cancelOrder(String trackingNumber);

    
    boolean assignCourier(String trackingNumber, int courierStaffId);

    
    boolean markOrderDelivered(String trackingNumber);

    
    List<String> getAssignedOrders(int courierStaffId);
}

