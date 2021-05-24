
package ExExtraordinario;

/**
 *
 * @author GasaMome
 */
public class Alertas {
   
    Vista vis;
    SistemaFabrica sfa;
    
    public Alertas(Vista vista, SistemaFabrica sistem) {
        this.vis = vis;
        this.sfa = sistem;
    }
 
   
    public void imprimirListaVehiculos(){
        String ListaVehiculos = "";
        for(int i = 0; i < sfa.vh; i++){
          ListaVehiculos += "El inventario de vehiculos: ";
          ListaVehiculos += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaVehiculos);
    }
    
    
    public void imprimirListaLlantaIzq1(){
        String ListaLlantaIzq1 = "";
        for(int i = 0; i < sfa.ll; i++){
          ListaLlantaIzq1 += "Inventario de vehiculos:";
          ListaLlantaIzq1 += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaLlantaIzq1);
    }
    
    
    public void imprimirListaLlantaDer2(){
        String ListaLlantaDer2 = "";
        for(int i = 0; i < sfa.ll; i++){
          ListaLlantaDer2 += "Inventario de vehiculos:";
          ListaLlantaDer2 += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaLlantaDer2);
    }
    
    
    public void imprimirListaLlantaIzq3(){
        String ListaLlantaIzq3 = "";
        for(int i = 0; i < sfa.ll; i++){
          ListaLlantaIzq3 += "Inventario de vehiculos:";
          ListaLlantaIzq3 += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaLlantaIzq3);
    }
    
    
    public void imprimirListaLlantaDer4(){
        String ListaLlantaDer4 = "";
        for(int i = 0; i < sfa.ll; i++){
          ListaLlantaDer4 += "Inventario de vehiculos:";
          ListaLlantaDer4 += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaLlantaDer4);
    }
    
    
    public void imprimirListaMotor(){
        String ListaMotor = "";
        for(int i = 0; i < sfa.mt; i++){
          ListaMotor += "Inventario de vehiculos: ";
          ListaMotor += sfa.getVehiculo()[i].toString();
        }
       vis.imprimirAlertas(ListaMotor);
	}
}

    
 
