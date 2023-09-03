/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
/**
 *
 * @author mja-pc
 */
public class Conexion {
    Connection con;
    public Connection Conexion(){
        try{    
            con=DriverManager.getConnection("jdbc://localhost:3306/padron_electoral","root","235689");
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
        return con;

    }
}
