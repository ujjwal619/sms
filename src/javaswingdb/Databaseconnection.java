/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingdb;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ujjwal
 */
public class Databaseconnection {

    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/smsdb?zeroDateTimeBehavior=convertToNull";
    final static String USER = "root";
    final static String PASS = "";

    public static Connection connection() {

        try {

            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Conneted to database as well");
         return null;
        }
       
    }
}
