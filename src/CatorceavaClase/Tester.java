/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatorceavaClase;

import java.util.Scanner;

/**
 *
 * @author GaSaMoMe 
 */
public class Tester {
    public static void main(String[] args) {
       Scanner s;
        
       
       Perro p1= new Perro(); 
       p1.setNombre("Dogui");
       p1.setColor("rojo");
       //Perro.contador = Perro.contado +1;
       Perro.contador++;
       
       Perro p2= new Perro("Oso","rojo"); 
       Perro.contador++;
       
       Perro.incrementarContador();
      
       System.out.println(p1.nombre);
       System.out.println(Perro.contador);
       System.out.println(p2.nombre);
       System.out.println(Perro.contador);
       
       
       Integer num1 = 0;
       Integer num2 =num1;
       
       int numero1= 0;
       int numero2= 0;
       
       if(p1.equals(p2)){
        System.out.println("Los perros son iguales");
       }
       
       else{
        System.out.println("Los perros no son iguales");  
           
       }
       if("".equals("")){
           
       }
       if(numero1==numero2){
       
       }
       if(num1.equals(numero1)) {
       
       }  
       if(num1==numero2){
        System.out.println("si se imprime");
       }   
       
       
       
     }
   }
    
    

