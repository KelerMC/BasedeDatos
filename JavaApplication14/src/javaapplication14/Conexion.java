/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;
import java.sql.*;
/**
 *
 * @author Usuario
 */
public class Conexion {
    String driver = "com.mysql.cj.jdbx.Driver";
    String url = "jdbc:mysql://localhost:3306/ejemplo";
    //Driver, protocolo, detalles de la conexion
    
    String username = "root";
    String password = "root";
    
    Connection conn = null;
    public Connection conectar ()
    {
        try
        {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado exitosamente!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
        }
    
}
