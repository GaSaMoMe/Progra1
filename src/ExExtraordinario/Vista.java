
package ExExtraordinario;

import javax.swing.JOptionPane;

/**
 *
 * @author GasaMome
 */
public class Vista {
    
    public SistemaFabrica agencia;
    
    public Vista(SistemaFabrica agencia) {
        this.agencia = agencia;
    }
    
    
    public int menu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("\n1.Agregar Vehiculo."
                + "\n2.Agregar motor."
                + "\n3.Agregar llantaIzq1."
                + "\n4.Agregar llantaDer2."
                + "\n5.Agregar llantaIzq3."
                + "\n6.Agregar llantaDer4."
                + "\n7.Mostrar Lista de Vehiculos."
                + "\n8.Mostrar lista de llantaIzq1"
                + "\n9.Mostrar lista de llantaDer2"
                +"\n10.Mostrar lista de llantaIzq3"
                + "\n11.Mostrar lista de llantaDer4"
                + "\n12.Mostrar Motor"
                + "\n13.Salir"));
        return menu;
    }
    public void agregarVehiculo(Vehiculo vl) {
        String modelo = JOptionPane.showInputDialog("Digite el modelo del automovil: ");
        String color = JOptionPane.showInputDialog("Digite el color del automovil: ");
        String marca = JOptionPane.showInputDialog("Digite la marca del automovil: ");
        String estado = JOptionPane.showInputDialog("Digite el año de venta del vehiculo ");

        vl.setModelo(modelo);
        vl.setMarca(marca);
        vl.setColor(color);
        vl.setEstado(estado);
    }
    
   
    public void agregarMotor(Motor motor) {
        float peso=Float.parseFloat(JOptionPane.showInputDialog("Peso del Motor:"));
        String Motor = JOptionPane.showInputDialog("Marca del motor: ");
        String numSerie = JOptionPane.showInputDialog("Numero de serie del motor: ");

        motor.setMarca(Motor);
        motor.setPeso(peso);
        motor.setNumSerie(numSerie);
    }
    
    
    public void agregarLlantaIzq1(Llanta llantaIzq1) {
        int tamano=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño de las llantas?: "));
        String marca = JOptionPane.showInputDialog("Cual es la marca de las llantas?: ");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo de las llantas?: ");

        llantaIzq1.setMarca(marca);
        llantaIzq1.setModelo(modelo);
        llantaIzq1.setTamano(tamano);
	}
    
    
    public void agregarLlantaDer2(Llanta llantaDer2) {
        int tamano=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño de las llantas?: "));
        String marca = JOptionPane.showInputDialog("Cual es la marca de las llantas?: ");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo de las llantas?: ");

        llantaDer2.setMarca(marca);
        llantaDer2.setModelo(modelo);
        llantaDer2.setTamano(tamano);
	}
    
    
    public void agregarLlantaIzq3(Llanta llantaIzq3) {
        int tamano=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño de las llantas?: "));
        String marca = JOptionPane.showInputDialog("Cual es la marca de las llantas?: ");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo de las llantas?: ");

        llantaIzq3.setMarca(marca);
        llantaIzq3.setModelo(modelo);
        llantaIzq3.setTamano(tamano);
	}
    
    
    public void agregarLlantaDer4(Llanta llantaDer4) {
        int tamano=Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño de las llantas?: "));
        String marca = JOptionPane.showInputDialog("Cual es la marca de las llantas?: ");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo de las llantas?: ");

        llantaDer4.setMarca(marca);
        llantaDer4.setModelo(modelo);
        llantaDer4.setTamano(tamano);
	}
    
    
    public void imprimirAlertas(String Reporte) {
        JOptionPane.showMessageDialog(null, Reporte);
	}
}

    
  

