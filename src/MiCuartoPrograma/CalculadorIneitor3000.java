/*
 * Universidad Latina de Costa Rica
 * Faciultad de Programación
 * Lunes 15/FFebrero/2021
 */
package MiCuartoPrograma;

import java.util.Scanner;

/**
 *
 * @author Guillermo SA
 */
public class CalculadorIneitor3000 {

    public int Suma(int num1, int num2) {
        int resultado;
        resultado = num1 + num2;

        return resultado;
    }

    public int Resta(int num1, int num2) {
        int resultado;
        resultado = num1 - num2;

        return resultado;
    }

    public int Multiplicacion(int num1, int num2) {
        int resultado;
        resultado = num1 * num2;

        return resultado;
    }

    public int División(int num1, int num2) {
        int resultado;
        resultado = num1 / num2;

        return resultado;
    }
    
     public int Residuo(int num1, int num2) {
        int resultado;
        resultado = num1 % num2;

        return resultado;
        
        
    }

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        CalculadorIneitor3000 scaCalcu = new CalculadorIneitor3000();

        System.out.println("Bienvenidos");

        System.out.println("#########Aqui podra realizar sus operaciones en la CalculadorIneitor3000");
        int num1;
        int num2;

        System.out.println("Digite Numeros para empezar");
           System.out.print("Digite el primer numero de las Operaciones de Suma:");
             num1 = sca.nextInt();
           System.out.print("Digite el segundo numero de las Operaciones de Suma:");
             num2 = sca.nextInt();
               int resultado = scaCalcu.Suma(num1, num2);

        System.out.println("El resultado de sus Operaciones de Suma es el sig..."+ resultado);
    
        System.out.println("Digite Numeros para empezar");
           System.out.print("Digite el primer numero de las Operaciones de Resta:");
             num1 = sca.nextInt();
           System.out.print("Digite el segundo numero de las Operacionesde Resta:");
             num2 = sca.nextInt();
                int resultado2 = scaCalcu.Resta(num1, num2);
 
        System.out.println("El resultado de sus Operaciones de Resta es el sig..."+ resultado2);

        System.out.println("Digite Numeros para empezar");
           System.out.print("Digite el primer numero de las Operacionesde Multiplicacion:");
              num1 = sca.nextInt();
           System.out.print("Digite el segundo numero de las Operaciones de Multiplicacion:");
              num2 = sca.nextInt();
                int resultado3 = scaCalcu.Multiplicacion(num1, num2);
 
        System.out.println("El resultado de sus Operaciones de Multiplicacion es el sig..." + resultado3);
        
        
        System.out.println("Digite Numeros para empezar");
           System.out.print("Digite el primer numero de las Operaciones de Division:");
             num1 = sca.nextInt();
           System.out.print("Digite el segundo numero de las Operaciones de Division");
             num2 = sca.nextInt();
              int resultado4 = scaCalcu.División(num1,num2);
        
        System.out.println("El resultado de sus Operaciones de Division es el sig..."+ resultado4);
        
                
                
         System.out.println("Digite Numeros para empezar");
           System.out.print("Digite el primer numero de las Operaciones de Residuo:");
             num1 = sca.nextInt();
           System.out.print("Digite el segundo numero de las Operaciones de Residuo:");
             num2 = sca.nextInt();
              int resultado5 = scaCalcu.Residuo(num1,num2);
        
        System.out.println("El resultado de sus Operaciones de Residuo es el sig..."+ resultado5);
    }

}
