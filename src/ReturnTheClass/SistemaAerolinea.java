/*
 *Segundo Programa que hago
 * Viernes 29/Enero/2021
 * Ingenieria en Sistemas Computacionales
 */
package decimaclase;

/**
 *
 * @author GuilleSA
 */
public class SistemaAerolinea {
    Cliente unicoCliente;
    Cliente segundoCliente;
    
    public void iniciar(){
        unicoCliente = new Cliente();
        segundoCliente = new Cliente(); 
        
        solicitarDatosCliente();
        generarReporteClientes();
    }
    
    public void solicitarDatosCliente(){
        unicoCliente.solicitarDatos();
    }
    
    public void generarReporteClientes(){
        String infoCliente = this.unicoCliente.toString();
        System.out.println(infoCliente);
    }
}
