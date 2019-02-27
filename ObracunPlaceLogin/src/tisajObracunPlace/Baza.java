/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisajObracunPlace;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Profesor
 */
public class Baza{
    Connection conn=null;
    public static Connection Baza(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/login?serverTimezone=UTC&"
            + "useUnicode=true&characterEncoding=utf-8","edunova","edunova");
            JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    } 
    }
    
}
    
