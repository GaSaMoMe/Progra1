package ProyectoFinal;


import ProyectoFinal.problema4;
import java.util.Scanner;

/*
 * Universidad Latina de CR
 * Progra 1, Profe Carlos Mendez
 * Jueves 29 de Abril
/**
 *
 * @author GuilleSA
 */
public class nproblema4 {

    public static void main(String[] args) {
        Scanner scanin = new Scanner(System.in);

        problema4 vector = new problema4();
        System.out.println("Digite el tamaño del vector");
        int n = scanin.nextInt();

        int vectorn[] = new int[n];

        System.out.println("Digite los valores del vector: ");
        for (int i = 0; i < vectorn.length; i++) {
            System.out.print((i + 1) + " numero: ");
            vectorn[i] = scanin.nextInt();
        }
        
        
        int menos;

        for (int i = 0; i < vectorn.length; i++) {
            for (int j = 0; j < vectorn.length; j++) {

                if (vectorn[i] < vectorn[j]) {
                    menos = vectorn[i];

                    vectorn[i] = vectorn[j];
                    vectorn[j] = menos;
                }

            }

        }

        for (int i = 0; i < vectorn.length; i++) {
            System.out.print(vectorn[i] + ". ");

        }
        System.out.println("\nDigite el numero que desea buscar en la lista: ");
        int elemento = scanin.nextInt();

        int indice = vector.problema4(vectorn, elemento);

        if (indice != -1) {
            System.out.println("Si se encuentra en: " + " " + indice);
        } else {
            System.out.println("No se encontro." + " " + indice);
        }
    }
}
