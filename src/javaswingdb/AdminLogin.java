/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingdb;

import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ujjwal
 */
 
public class AdminLogin {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
   
//    try{
//            
//                stmt = con.createStatement();
//                String userName = jTextField1.getText();
//                String userPass = new String(jPasswordField1.getPassword());
//                
//                String sql = "select * from login where username='"+userName+"' and password = '"+userPass+"'";
//                rs = stmt.executeQuery(sql);
//                if(rs.next()){
//                
//                    setVisible(false);
//                    home object = new home();
//                    object.setVisible(true);
//                }
//                else{
//                
//                    JOptionPane.showMessageDialog(null, "Username or Password incorrect");
//                }
//                
//            }
//            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
            
}    

