/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

import java.io.Serializable;

public class ClsRegistro implements Serializable{
    
    private int id;
    private String nombre;
  
    
   
    
    public ClsRegistro(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
     
  
    }

    @Override
    public String toString(){
        return this.id+" "+this.nombre;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    
}
