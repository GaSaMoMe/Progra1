
package ExExtraordinario;

/**
 *
 * @author User
 */
public class SistemaFabrica {
 
    Vehiculo[] vehiculo;
    Motor[] motor;
    Llanta[] llanta;
    int max;
    int vh;
    int ll;
    int mt;

    public SistemaFabrica() {
        max = 1000;
        vehiculo = new Vehiculo[max];
        vh= 0;
        mt = 0;
        ll = 0;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public void setPartes(Motor[] motor) {
        this.motor = motor;
    }

    public boolean agregarVehiculo(Vehiculo v) {
        boolean resultado = false;
        if (vh < max) {
            vehiculo[vh] = v;
            vh++;
            resultado = true;
        }
        return resultado;
    }
        public boolean agregarMotor(Motor m) {
        boolean resultado = false;
        if (mt < max) {
            motor[mt] = m;
            mt++;
            resultado = true;
        }
        return resultado;
    }
    
    
    public boolean agregarLlanta(Llanta l) {
        boolean resultado = false;
        if (ll < max) {
            llanta[ll] = l;
            ll++;
            resultado = true;
        }
        return resultado;
    }

}

