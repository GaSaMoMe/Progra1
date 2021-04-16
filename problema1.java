/*Universidad Latina de Costa Rica
 * Programacion#1
 *Profesor Carlos Andres Mendez Rodriguez
 * Facultad de Ingenieria en Sistemas Computacionales
 */
package ProyectoFinal;

import java.util.Scanner;


public class problema1 {
    Scanner divisa = new Scanner(System.in);
    
    public problema1(){
        System.out.println("Bienvenido al cambio de Divisas a Colones");
        int vDólar,dólar,vEuro,euros,colones;
        
        System.out.println("Ingrese el valor actual del Dólar: ");
        vDólar=divisa.nextInt();       
        System.out.println("Ingrese la cantidad de Dólares a convertir");
        dólar=divisa.nextInt();
       
        colones=dólar*vDólar;
        
        System.out.println(dólar+" Dólares es igual a "+ colones+" colones.");
           
        System.out.println("-----------------------------------------");
        
        System.out.println("Ingrese el valor actual del Euro: ");
        vEuro=divisa.nextInt();  
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros=divisa.nextInt();
        
        colones=euros*vEuro;
        
        System.out.println(euros+" Euros es igual a "+ colones+" colones.");
        
        
        
        
    }
    
    public static void main(String[]args){
        
        problema1 solucion= new problema1();
        
    }
    
    
    
}
