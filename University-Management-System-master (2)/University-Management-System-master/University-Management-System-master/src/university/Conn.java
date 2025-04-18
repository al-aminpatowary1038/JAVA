/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conn {

    Connection c;
    Statement s;

    public Conn() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
                s = c.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException("Database connection failed! Check MySQL server or credentials.\n" + e);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException("MySQL JDBC Driver not found.\n" + ex);
            }
        }


    }
