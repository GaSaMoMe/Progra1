
package ExExtraordinario;

/**
 *
 * @author User
 */
public class Llanta {
    
    int tamano;
    String marca;
    String modelo;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
    @Override
    public String toString() {
        return "Llanta{" + "tamano=" + tamano + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}