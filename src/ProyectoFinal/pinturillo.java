/*Universidad Latina de Costa Rica
 * Programacion#1
 *Profesor Carlos Andres Mendez Rodriguez
 * Facultad de Ingenieria en Sistemas Computacionales
 */
package ProyectoFinal;

import javax.swing.JFrame;

/**
 *
 * @author GasaMOME
 */
public class pinturillo {
    
     public static void main(String[]args){
         
        problema3 pinturillo=new problema3();
        JFrame aplicacion = new JFrame();
       
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(pinturillo);
        aplicacion.setSize(75,100);
        aplicacion.setVisible(true);
         
     }
    
    
    
}
