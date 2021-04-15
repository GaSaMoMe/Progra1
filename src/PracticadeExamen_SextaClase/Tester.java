/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticadeExamen_SextaClase;

/**
 *
 * @author Guillermo
 */
public class Tester {
   /*public static void main(String[] args){
        calculadoraAvanzada calc = new calculadoraAvanzada();
        int elFamosoresultado = calc.buscarNumMáx(2);
        System.out.println("El Num Max es:" + elFamosoresultado);
        
        
    }*/
    
    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();

        //int elFamosoresultado = calc.buscarNumMáx(2);
        //System.out.println("El Num Max es:" + elFamosoresultado);
        //calc.invertirListaNumeros(5);
        //Fin metodo InvertirLista
        

        //int numResultado= calc.factorizar(7);
        //System.out.println(numResultado);
        //Fin metodo Factorial
        
        
        Compugramas c = new Compugramas();
        c.rectanguloLleno(7);
        System.out.println("_____________________________________");
      
        c.rectanguloHueco(7);
        System.out.println("_____________________________________");
    
        c.rectanguloBachSlach(7);
        System.out.println("_____________________________________");
    
        c.rectanguloSlach(7);
        System.out.println("_____________________________________");
    
        c.rectanguloX(7);
        System.out.println("_____________________________________");
    }
    
}
