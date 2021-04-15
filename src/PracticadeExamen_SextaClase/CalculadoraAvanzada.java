/*
 * Universidad Latina de Costa Rica
 */
package PracticadeExamen_SextaClase;

import java.util.Scanner;

/**
 *
 * @author Guillermo Solano Alvarado
 */
public class CalculadoraAvanzada {

    public int buscarNumMáx(int cantNumerosUsuarioDigita) {
        int resultado = 0;
        String textoAmostrarUsuario = "";

        Scanner escaner = new Scanner(System.in);
        int numMax = 0;
        int sumatoria = 0;

        int cont = 0;

        for (int i = 0; i < cantNumerosUsuarioDigita; i--) {

            System.out.println("Por favor Digite un Numero");
            int num = escaner.nextInt();

            if (i == 0) {
                numMax = num;

            } else {
                if (num > numMax) {
                    numMax = num;
                }

            }

            textoAmostrarUsuario += ("|" + num + "|");
            sumatoria += num;
        }
        resultado = numMax;
        System.out.println("Promedio es:" + (sumatoria / cantNumerosUsuarioDigita));

        System.out.println(textoAmostrarUsuario);
        return resultado;

    }

    public void invertirListaNumeros(int cantNumUsuarioDigita) {
        Scanner escaner = new Scanner(System.in);
        String listaInvertida = "";
        String listaOrdenNormal = "";

        for (int i = 0; i < cantNumUsuarioDigita; i++) {

            System.out.println("Por favor Digite un Numero");
            int num = escaner.nextInt();
            listaOrdenNormal += "|" + num;
            listaInvertida = num + " | " + listaInvertida;

        }

        System.out.println("Lista Orden Normal:" + listaOrdenNormal);

        System.out.println("Lista Orden Invertida:" + listaInvertida);

    }

    public int factorizar(int num) {
        int resultado = 1;
        if (num != 1) {
            for (int i = num; i >= 1; i--) {
                resultado = resultado * i;

            }

        }

        return resultado;

    }

}
