package com.csse.exam.config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * 
 */
public class DBConnection {

    //Initializing the driver
    static String driver = "com.mysql.jdbc.Driver";
    // Initializing the path to the database
    static String url = "jdbc:mysql://127.0.0.1:3306/examsystem?";//jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12196110
    //database username and password
    static String username = "root";//sql12196110
    static String password = "";//ZmI6UAuyYA

    public static Connection getConnection() {

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
