/*Universidad Latina de Costa Rica
 * Programacion#1
 *Profesor Carlos Andres Mendez Rodriguez
 * Facultad de Ingenieria en Sistemas Computacionales
 */
package ProyectoFinal;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author GasaMOME
 */
public class problema3 extends JPanel {
    
    public problema3(){
      setBackground(Color.DARK_GRAY); 
    
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
        
        int numrandom= (int) (Math.random()*500+1);
        int numrandomA= (int) (Math.random()*500+1);
       
        int numrandom2= (int) (Math.random()*500+1);
         int numrandomB= (int) (Math.random()*500+1);
         
        int numrandom3= (int) (Math.random()*500+1);
        int numrandomC= (int) (Math.random()*500+1);
        
        int numrandom4= (int) (Math.random()*500+1);
        int numrandomD= (int) (Math.random()*500+1);
        
        int numCreacionFiguras=5;
        for (int n = 0; n <numCreacionFiguras; n++) {
        
        g.setColor(Color.red);
        g.fillOval(numrandom, numrandomA, numrandom, numrandomA);
       
        g.setColor(Color.ORANGE);
        g.fillRect(numrandomB, numrandom2, numrandomB, numrandom2);
        
        g.setColor(Color.WHITE);
        g.fillOval(numrandom3, numrandomC, numrandom3, numrandomC);
       
        g.setColor(Color.GREEN);
        g.fillRect(numrandomD, numrandom4, numrandomD, numrandom4);

    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
