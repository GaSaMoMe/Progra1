/*
 * Universidad Latina de CR
 * Progra 1, Profe Carlos Mendez
 * Jueves 29 de Abril
 */
package ProyectoFinal;

/**
 *
 * @author GuilleSA
 */
public class problema4 {

    public int problema4(int arreglo[], int elemento) {

        int centro;
        int menor = 0;
        int mayor = arreglo.length - 1;
        int valorVector;

        while (menor <= mayor) {
            centro = (menor + mayor) / 2;
            valorVector = arreglo[centro];
            

            if (elemento == valorVector) {
                return centro;
            } else if (elemento < valorVector) {
                mayor = centro - 1;
            } else {
                menor = centro + 1;
            }
        }
        return -1;

    }

}
