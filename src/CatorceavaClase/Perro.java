/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatorceavaClase;

import java.util.Objects;

/**
 *
 * @author GasaMOME
 */
public class Perro {
    public String nombre;
    public String color;
    public static int contador;
    
    /**
     *Explicacion1
     */
    public Perro(){
        
}
    
    public Perro(String nombrePerrito) {
        this.nombre = nombrePerrito;

    }

    /**
     *Explicacion2
     * @param nombrePerrito
     * @param color
     */
    public Perro(String nombrePerrito, String color) {
        this.nombre = nombrePerrito;
        this.color = color;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
         this.nombre= nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static void incrementarContador(){
     contador++;
     System.out.println(contador);
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    
    
}
