package com.hexaware.dao;

import java.sql.Connection;

import util.DBConnection;

public class CourierServiceDb {

    // Static variable to hold the database connection
    private static Connection connection;

    // Private constructor to prevent instantiation from outside
    private CourierServiceDb() {
        // Initialize the connection in the constructor
        connection = DBConnection.getDBConnection("your_connection_string_here");
    }

    // Method to get the database connection
    public static Connection getConnection() {
        // If the connection is null, create a new instance of the class
        if (connection == null) {
            new CourierServiceDb();
        }
        return connection;
    }
}

