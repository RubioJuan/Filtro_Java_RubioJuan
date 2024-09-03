/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author camper
 */

public class Ninja {
    private int id;
    private String nombre;
    private String rango;
    private String aldea;
    
    public Ninja(int id,String nombre, String rango,String aldea){
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }
    
    // Getters
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getRango(){
        return rango;
    }
    
    public String getAldea(){
        return aldea;
    }
    
    // Setters
    public void setId(int id){
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setRango(String rango){
        this.rango = rango;
    }
    
    public void setAldea(String aldea){
        this.aldea = aldea;
    }
    
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
        sb.append("╔════════════════════════════════════════════════════════════════════════════════════╗\n");
        sb.append("                                        Ninjas                                      \n");
        sb.append("╠════════════════════════════════════════════════════════════════════════════════════╣\n");
        sb.append(String.format("║ Id      : %-45d \n", id));
        sb.append(String.format("║ Nombre               : %-45s \n", nombre));
        sb.append(String.format("║ Rango             : %-45.2f \n", rango));
        sb.append(String.format("║ Aldea         : %-45s \n", aldea));
        sb.append("╚════════════════════════════════════════════════════════════════════════════════════╝");
        return sb.toString();
    }
}
