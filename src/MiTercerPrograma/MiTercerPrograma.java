package MiTercerPrograma;

import java.util.Scanner;

/*
 * Universidad Latina de Costa Rica
 * Ingenieía en sistemas
 * Viernes 05 Febrero,2021.
package MiTercerPrograma;

/**
 *
 * @author Guillermo Solano Alvarado
 */
public class MiTercerPrograma {

    public static void main(String[] args) {
        MiTercerPrograma mp= new   MiTercerPrograma();
        
        int Edad = 22;
        if (Edad > 20) {
            System.out.println("Entre al Inf...");
        } else if (Edad < 20) {
            System.out.println("Entre al segundo Else...");
        } else {
            System.out.println("Entre al Else....");
            System.out.println("Fin del Programa.");
        }

        String nombre = "Guillermo";

        switch (nombre) {
            case "Guillermo":
                System.out.println("case Guillermo...");
                break;
            // El break es para parar la ejecucion del Switch...
            case "Alonso":
                System.out.println("case Alonso...");
                break;
            case "Rebeca":
                System.out.println("case Rebeca...");
                break;
            case "Jairo":
                System.out.println("case Jairo...");
                break;
            case "Jimena":
                System.out.println("case Jimena...");
        }
        int param1 = 6;
        int param2 = 5;
        int param3 = 4;

        int param4 = 650000;
        int param5 = 12;

        int totaltiempo;
        totaltiempo = calcularSuma(param1, param2, param3);
        System.out.println(totaltiempo);

        if (totaltiempo > 10) {
            System.out.println("Usted ya tiene muchos años de Estudio...");
        } else if (totaltiempo < 11) {
            System.out.println("A usted le faltan años de Estudio...");
        }

        int totaltiempo2;
        totaltiempo2 = calcularMultiplicacion(param4, param5);
        System.out.println(totaltiempo2);

        if (totaltiempo > 6000000) {
            System.out.println("Usted podria ganar un mejor salario...");
        } else if (totaltiempo <= 6500000) {
            System.out.println("Usted ya tiene un buen Salario de Ingeniero...");

        }
        establecerFormatoEmpresa("   ---Escuela TICS---");

    }//fin del metodo main

    public static int calcularSuma(int param1, int param2, int param3) {
        int resultado;
        resultado = param1 + param2 + param3;

        return resultado;
    }//Fin del metodo de suma de años estudio

    public static int calcularMultiplicacion(int param4, int param5) {
        int resultado;
        resultado = param4 * param5;

        return resultado;
    }//Fin de multiplicacion salario mensual*año

    public static void establecerFormatoEmpresa(String textoAImprimir) {
        String encabezado = "----Universidad LATINA----\n";
        String pie = "\n----------------------------\n";
        String todoMayuscula = (encabezado + textoAImprimir + pie).toUpperCase();

        System.out.println(todoMayuscula);
    
    
    //Viernes 12 de Febrero 2021...


    }

}//Fin del Programa
