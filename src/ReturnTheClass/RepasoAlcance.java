/*
 * Segundo Programa que hago
 * Viernes 29/Enero/2021
 * Ingenieria en Sistemas Computacionales
 */
package decimaclase;

import novenaclase.Tiempo1;

/**
 *
 * @author GuilleSA
 */
public class RepasoAlcance {
    
    int iii;
    
    public void pruebaUno(){
        //Ejemplo de Null Pointer Exception
        //Tiempo1 nn; //= new Tiempo1();
        //System.out.println(nn.toString());
        
        int iii = 90;
        this.iii = 44;
    }
    
    public void pruebaAlnce(){
        int iii = 0;
        this.iii = 500;
        this.iii = 501;
        this.iii = 503;
        this.iii = 50234324;
        this.iii = 343;
    }
    
    public void iniciar(){
        boolean diaFeriado = false;
        
        int iii = 11;
        
        if(false){
            iii = 777;
        }
        else{
            iii = 8;
        }
        
        pruebaUno();
        pruebaAlnce();
        this.iii = 1000;
        System.out.println(iii);
    }
}
