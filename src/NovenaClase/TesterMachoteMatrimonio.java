/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

import octavaclase.*;

/**
 *
 * @author Andres
 */
public class TesterMachoteMatrimonio {

    public static void main(String[] args) {
        MachoteMatrimonio acta1 = new MachoteMatrimonio();
        acta1.nombre1 = "Mario";
        acta1.nombre2 = "Juanita";
        acta1.setCedula1("1-1343-1222");
        acta1.setCedula2("2-3242-3424");
        System.out.println(acta1.toString());

        MachoteMatrimonio acta2 = new MachoteMatrimonio();
        acta2.nombre1 = "Jose";
        acta2.nombre2 = "Maria";
        acta2.setCedula1("1-2644-1332");
        acta2.setCedula2("2-3545-3433");
        System.out.println(acta2.toString());

        MachoteMatrimonio acta3 = new MachoteMatrimonio();
        acta3.nombre1 = "Mauricio";
        acta3.nombre2 = "Laura";
        acta3.setCedula1("1-2454-1342");
        acta3.setCedula2("2-6345-3493");
        acta3.establecerVersion(202104);
        System.out.println(acta1.toString());
        
        Tiempo1 t = new Tiempo1();
        t.establecerTiempo(7, 15, 30);
        System.out.println(t.aStringUniversal());
    }
}
