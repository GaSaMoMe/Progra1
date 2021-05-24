
package ExExtraordinario;

/**
 *
 * @author GasaMome
 */
public class Vehiculo {
    /**color: Rojo
    marca: Hyundai
    modelo: SantaFe
    año:2022
                                             marca del motor:Hyundai Surcorea
                                             serie: 999999
                                             peso: 1.875 kg
                                             marca llantaIzq 1: Firestone
                                             modelo llantaIzq 1: e22
                                             altura llantaIzq 1: 17
                                             marca llantaDer 2: Michelin
                                             modelo llantaDer 2: t55                                                          
                                             altura llantaDer 2: 17                                                                                                                                             
                                             marca llantaIzq 3: Fireston
                                             modelo llantaIzq 3: ty99
                                             altura llantaIzq 3: 17
                                             marca llantaDer 4: Michelin
                                             modelo llantaDer 4: e25
                                             altura llantaDer 4: 17
    */
            
    
    String color;
    String marca;
    String modelo;
    String estado;
    int anno;
    Motor motor;
    Llanta llantaIzq1;
    Llanta llantaDer2;
    Llanta llantaIzq3;
    Llanta llantaDer4;
    String vendido;
    
    
    public Vehiculo(){
        
    }

    Vehiculo(Llanta llantas, Motor motor) {
        
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
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

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta getLlantaIzq1() {
        return llantaIzq1;
    }

    public void setLlantaIzq1(Llanta llantaIzq1) {
        this.llantaIzq1 = llantaIzq1;
    }

    public Llanta getLlantaDer2() {
        return llantaDer2;
    }

    public void setLlantaDer2(Llanta llantaDer2) {
        this.llantaDer2 = llantaDer2;
    }

    public Llanta getLlantaIzq3() {
        return llantaIzq3;
    }

    public void setLlantaIzq3(Llanta llantaIzq3) {
        this.llantaIzq3 = llantaIzq3;
    }

    public Llanta getLlantaDer4() {
        return llantaDer4;
    }

    public void setLlantaDer4(Llanta llantaDer4) {
        this.llantaDer4 = llantaDer4;
    }
    
     @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", año=" + anno + ", motor=" + motor + ", llantaIzq1=" + llantaIzq1 + ", llantaDer2=" + llantaDer2 + ", llantaIzq3=" + llantaIzq3 + ", llantaDer4=" + llantaDer4 + ", vendido=" + vendido + '}';
    }

}
