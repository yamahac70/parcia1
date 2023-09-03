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
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private int localidad_id;
    Conexion c= new Conexion();
    Connection con=c.Conexion();
    
    public Persona(int id, String nombre,String apellido,String sexo,String direccion,int localidad_id ){
            this.id=id;
            this.nombre=nombre;
            this.apellido=apellido;
            this.sexo=sexo;
            this.direccion=direccion;
            this.localidad_id=localidad_id;
            
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLocalidad_id() {
        return localidad_id;
    }

    public void setLocalidad_id(int localidad_id) {
        this.localidad_id = localidad_id;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void crearPersonaDB(){
        //insertamos la persona
        try{
                 String sql = "INSERT INTO personas (nombre, apellido, sexo, direccion, localidad_id) VALUES (?, ?, ?, ?, ?)";
               // Crea una declaración preparada con la consulta
                PreparedStatement query = con.prepareStatement(sql);
                //indicamos los valores
                query.setString(1,this.nombre);
                query.setString(2,this.apellido);
                query.setString(3,this.sexo);
                query.setString(4,this.direccion);
                query.setInt(5,this.localidad_id);
                //ejecutamos la consulta
                query.executeUpdate();
                //cierro la conexion 
                query.close();
                con.close();

        }catch(Exception err){
            System.out.println(err.getMessage());
        }
        //
    
    }
    
}
