/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author mja-pc
 */
public class Logica {
   
    Conexion c=new Conexion();
    Connection con =c.Conexion();
    
    //int id,String nombre,String apellido,String sexo,String direccion,int localidad_id
    
    public ArrayList recuperarPersonas( ){
      ArrayList<Persona> personas= new ArrayList<>();
       try{
          //empezamos con la logica de las llamadas personas 
          
          String sql="SELECT * FROM persona ";
          Statement st;
          st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              personas.add(new Persona(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
          }
      }
      catch(Exception err){
          System.out.println(err.getMessage());
      }
      return personas;
    }
    
    public String[] datosEstablecimiento(){
        
        String[] establecimiento= new String[3];
        try{
            
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    return establecimiento;
    }

}

