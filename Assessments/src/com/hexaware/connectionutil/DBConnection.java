package com.hexaware.connectionutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private static Connection connection;

    static {
        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            // Loading JDBC driver
            Class.forName(properties.getProperty("jdbc.driver"));

            // to Establish database connection
            connection = DriverManager.getConnection(
                    properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password")
            );
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection is closed successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        try (Connection connection = DBConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Connection with the database is made successfully!");
                
            } else {
                System.out.println("Failed to establish the connection.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getDate(6)+" "+rs.getDouble("salary"));