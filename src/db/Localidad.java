/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author mja-pc
 */
public class Localidad {
    int id;
    String nombre;
    int estado;
    public Localidad (String nombre,int id,int estado){
           this.nombre=nombre;
           this.id=id;
           this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "id:"+this.id +"nombre: "+this.nombre+" estado: "+this.estado;
    }
  
}
