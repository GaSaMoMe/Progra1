/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticadeExamen_SextaClase;
import java.util.Scanner;

/**
 *
 * @author Guillermo SA
 */
public class ControlPacientesCovic19 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int edad = 0;
        String nombre = "";
        String genero = "";
        boolean antecedentes = true;
        String sangre = "";
        String covid19 = "";

        while (true) {
            System.out.println("Seleccione alguna de las siguientes opciones");
            System.out.println("1||Digitar Datos Básicos");

            System.out.println("2||Digitar Datos Médicos");

            System.out.println("3||Desplegar Infórmacion del Paciente");

            System.out.println("4||Probabilidad de una Enfermedad Grave");

            System.out.println("5||Borrar y reiniciar");
            System.out.println("*Seleccione alguna de las siguientes opciones*");

            int menu = sca.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("Digite el nombre del Paciente: ");
                    nombre = sca.next();
                    System.out.println("Digite la edad del paciente: ");
                    edad = sca.nextInt();
                    System.out.println("Digite el Genero del paciente: ");
                    genero = sca.next();
                    System.out.println("__________________________________________________");
                    
                    break;
                }

                case 2: {
                    if(nombre.equals("")){
                        System.out.println("Es necesario llenar los Datos Básicos");
                    }
                    else{
                    System.out.println("El paciente tiene antecedentes de alguna enfermedad?:");
                    antecedentes = sca.nextBoolean();
                    System.out.println("Cual es el tipo de sangre del Paciente?:");
                    sangre = sca.next();
                    System.out.println("El paciente es Positivo por Covid19?:");
                    covid19 = sca.next();

                    alertas(edad, antecedentes);
                    alertas(sangre);

                    System.out.println("__________________________________________________");
                   
                    }
                    
                    break;
                }

                case 3: {

                    System.out.println("El nombre del Paciente es:" + nombre);
                    System.out.println("El edad del Paciente es:" + edad);
                    System.out.println("El genero del Paciente es:" + genero);
                    System.out.println("Los antecedentes del Paciente son:" + antecedentes);
                    System.out.println("El tipo de Sangre del Paciente es:" + sangre);
                    System.out.println("El Paciente es:" + covid19);

                    System.out.println("__________________________________________________");
                    break;
                }

                case 4: {
                    double probabilidad = 0.9 * edad;
                    System.out.println("La Probabilidad de que el Paciente enferme de forma Grave es" + probabilidad);

                    System.out.println("__________________________________________________");
                    break;
                }

                case 5: {
                    edad = 0;
                    nombre = "";
                    genero = "";
                    antecedentes = true;
                    sangre = "";
                    covid19 = "";

                    System.out.println("__________________________________________________");
                    break;
                }

            }
        }
    }

    public static void alertas(int edad, boolean antecedentes) {
        edad = 0;
        antecedentes = true;
        if (edad > 60 || antecedentes == true) {
            System.out.println("El paciente es Factor de riesgo a Enfermedad Grave");

        }
    }

    public static void alertas(String sangre) {
        if (sangre == "o+") {
            System.out.println("El paciente es factor de riesgo");
        }

    }

}
