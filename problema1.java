/*Universidad Latina de Costa Rica
 * Programacion#1
 *Profesor Carlos Andres Mendez Rodriguez
 * Facultad de Ingenieria en Sistemas Computacionales
 *Suponiendo que el cambio bancario por 1 dólar equivale a 500 colones y que por un euro equivale a 1.53 dólares diseñe e implemente un programa orientado a objetos que le permita al usuario seleccionar la cantidad de unidades monetarias y el tipo de moneda de origen, así como el tipo de moneda de salida que es deseada.
 */
package ProyectoFinal;

import java.util.Scanner;


public class problema1 {
    Scanner sca= new Scanner(System.in);
    
    float dollar;
    float euro;
    float colon;
    
    

public float cambioDecolonesAdollar(){

    this.dollar =500;
    System.out.println("Digite la cifra  en Colones");
    
    this.colon= sca.nextFloat();
    float resultado= colon/dollar;
    
    System.out.println("Su cambio en Dollares es :" + resultado);
    return resultado;
} 

public float cambioDedollaresAcolones(){

    this.colon =500;
    System.out.println("Digite la cifra en Dollares");
    
    this.dollar= sca.nextFloat();
    float resultado= dollar * colon;
    
    System.out.println("Su cambio en Colones es :" + resultado);
    return resultado;
   
} 

public float cambioDeEuroAColones(){

    this.dollar = (float) 1.53;
    System.out.println("Digite la cifra en Euros");
    
    this.euro= sca.nextFloat();
    float resultad= euro * dollar;
    
    this.colon =500;
    float resultado= resultad * colon;
    System.out.println("Su cambio en Colones es :" + resultado);
    return resultado;
} 

public float cambioDeColonAEuro(){

    this.dollar =500;
    System.out.println("Digite la cifra en colones");
    
    this.colon= sca.nextFloat();
    float resulta= colon/dollar;
    
    this.euro =(float) 1.53;
    float resultado= resulta /euro;
    System.out.println("Su cambio en Euros es :" + resultado);
    return resultado;
} 

public float cambioDeDollaraEuro(){

    this.euro =(float) 1.53;
    System.out.println("Digite la cifra en Dollares");
    
    this.dollar= sca.nextFloat();
    float resultado= dollar/euro;
    
    System.out.println("Su cambio en Euros es :" + resultado);
    return resultado;
    
} 

public float cambiodeEuroADollar(){

    this.dollar =(float) 1.53;
    System.out.println("Digite la cifra en Euros");
    
    this.euro= sca.nextFloat();
    float resultado= euro + dollar;
    
    System.out.println("Su cambio en Dollares es :" + resultado);
    return resultado;
    
    
    
} 

public float metodoFinal(){
        
  Scanner Div= new Scanner(System.in);
     
  byte menu;
  
  while(true){
       System.out.println("-------------------------------------------");
        System.out.println("-----------Cambio de monedas--------------"
        + "\nDigite el cambio que desea realizar:"
        + "\n1. De Colones a Dollar"
        + "\n2. De Dollares a Colones"
        + "\n3. De Euro a Colones"
        + "\n4. De Colon a Euro"
        + "\n5. De Dollar a Euro"
        + "\n6. De Euro a Dollar");
                
    menu= Div.nextByte();
    
    switch(menu) {
        
        case 1:
            cambioDecolonesAdollar();
            break;
            
        case 2:
            cambioDedollaresAcolones();
            break;
            
        case 3:
            cambioDeEuroAColones();
            break;
            
        case 4:
            cambioDeColonAEuro();
            break;
            
        case 5:
            cambioDeDollaraEuro();
            break;
            
        case 6:
            cambiodeEuroADollar();
            break;
            
        default:
            System.out.println("Usted ha digitado un numero fuera de nuestra base de Datos"
               + "\n------------Muchas Gracias por su Preferencia------------");
               
      }     
    }  
  }
}
