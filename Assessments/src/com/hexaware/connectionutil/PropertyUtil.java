package com.hexaware.connectionutil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

    public static String getPropertyString() {
        try (InputStream input = PropertyUtil.class.getClassLoader().getResourceAsStream("connection.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            String hostname = properties.getProperty("hostname");
            String dbname = properties.getProperty("dbname");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String port = properties.getProperty("port");

            return "jdbc:mysql://" + hostname + ":" + port + "/" + dbname + "?user=" + username + "&password=" + password;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        String connectionString = PropertyUtil.getPropertyString();

        if (connectionString != null) {
            System.out.println("Connection String: " + connectionString);
        } else {
            System.out.println("Failed to obtain connection string.");
        }
    }
}


