package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://10.41.32.2.database.windows.net:1433;"
                        + "database=SZ_001;"
                        + "user=SZ_user;"
                        + "password=SZuser;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
