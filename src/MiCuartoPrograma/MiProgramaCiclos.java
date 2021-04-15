/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiCuartoPrograma;

/**
 *
 * @author User
 */
public class MiProgramaCiclos {

    public static void main(String[] args) {
         imprimirCompugrama1=(20);
    }
        //Compugrama
       
     public static void imprimirCompugrama1(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("- ");

        }
        System.out.print(">");

     }
     public static void imprimirCompugrama2(int j) {

        for (int j = 0; j < 3; j++){

            for (int i = 0; i < n; i++) {
            System.out.print("-     ");

        }
        System.out.print(">");
        }
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
//primera forma

        for (int num = 1; num <= 1000; num++) {

            int residuo = num % 50;

            if (residuo == 0) {

                System.out.println("El numero" + "--:" + num);
            }
        }

        //segunda forma
        boolean par = true;

        for (int num = 0; num <= 100; num++) {

            if (par) {

                System.out.println("El numero" + num);
                par = false;

            } else {

                par = true;
            }
        }

        //tercera forma
        for (int n = 0; n <= 10; n++) {
            System.out.print(n + "-");

}
}

