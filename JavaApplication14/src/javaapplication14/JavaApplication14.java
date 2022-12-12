/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication14;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class JavaApplication14 {
    static Connection conn;
public static void conectarBaseDeDatos(){
   Conexion miConexion = new Conexion();
   conn = miConexion.conectar(); 
}
  public static void guardarDatos(String nombres, String apellidos, String DNI)
    {
        PreparedStatement prepStatement = null;
        
        try
        {
            String query = "INSERT INTO tabla2 VALUES(null,?,?,?)";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1,nombres);
            prepStatement.setString(2,apellidos);
            prepStatement.setString(3,DNI);
            prepStatement.executeUpdate();
            System.out.println("Registro agregado correctamente.");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }       
    
public static void main(String[] args) {
        // TODO code application logic here
    conectarBaseDeDatos();
    Scanner read = new Scanner(System.in);
        
        String nombre;
        String apellido;
        String DNI;
        
        nombre = read.next();
        apellido = read.next();
        DNI = read.next();
        
        guardarDatos(nombre, apellido, DNI);
    }
    
}
