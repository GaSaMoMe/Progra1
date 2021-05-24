
package ExExtraordinario;

/**
 *
 * @author User
 */
public class Motor {
    
    float peso;
    String numSerie;
    String marca;
    String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "Motor{" + "Peso:" + peso + ", Marca:" + marca + ", numSerie:" + numSerie + '}';
    }
    
    
    
}
