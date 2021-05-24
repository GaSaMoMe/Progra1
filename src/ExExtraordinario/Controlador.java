package ExExtraordinario;

/**
 *
 * @author User
 */
public class Controlador {

    SistemaFabrica sfa = new SistemaFabrica();
    Vista vis = new Vista(sfa);
    Alertas alertas = new Alertas(vis, sfa);

    public void iniciar() {
        while (true) {
            int menu = vis.menu();
            Llanta llantas = new Llanta();
            Motor motor = new Motor();
            Vehiculo vehiculo = new Vehiculo(llantas, motor);
            switch (menu) {
                case 1:
                    vis.agregarVehiculo(vehiculo);
                    sfa.agregarVehiculo(vehiculo);
                    break;
               
                case 2:
                    vis.agregarMotor(motor);
                    sfa.agregarMotor(motor);
                    break;
                
                case 3:
                    vis.agregarLlantaIzq1(llantas);
                    sfa.agregarLlanta(llantas);
                    break;
               
                case 4:
                    vis.agregarLlantaDer2(llantas);
                    sfa.agregarLlanta(llantas);
                    break;
               
                case 5:
                    vis.agregarLlantaIzq3(llantas);
                    sfa.agregarLlanta(llantas);
                    break;
               
                case 6:
                    vis.agregarLlantaDer4(llantas);
                    sfa.agregarLlanta(llantas);
                    break;
               
                case 7:
                    alertas.imprimirListaVehiculos();
                    break;
                case 8:
                    alertas.imprimirListaMotor();
                    break;
                case 9:
                    alertas.imprimirListaLlantaIzq1();
                    break;
                case 10:
                    alertas.imprimirListaLlantaDer2();
                    break;
                case 11:
                    alertas.imprimirListaLlantaIzq3();
                    break;
                case 12:
                    alertas.imprimirListaLlantaDer4();
                    break;
            }
            if (menu == 12) {
                break;
            }
        }
    }
}
 

