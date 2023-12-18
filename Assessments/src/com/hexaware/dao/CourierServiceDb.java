package com.hexaware.dao;

import com.hexaware.connectionutil.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourierServiceDb {
    private static Connection connection = DBConnection.getConnection();

    private CourierServiceDb() {
    }

    
    public static void getDeliveryHistory(String trackingNumber) {
        String query = "SELECT * FROM Courier WHERE trackingNumber = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, trackingNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            
            while (resultSet.next()) {
                
                String status = resultSet.getString("status");
                String deliveryDate = resultSet.getString("deliveryDate");
                System.out.println("Status: " + status + ", Delivery Date: " + deliveryDate);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static void generateShipmentStatusReport() {
       
    }

   
    public static void generateRevenueReport() {
        
    }
}
