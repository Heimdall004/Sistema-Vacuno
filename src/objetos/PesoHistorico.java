package objetos;

import java.io.Serializable;
import java.util.Date;

public class PesoHistorico implements Serializable{

    public PesoHistorico(Date fechaPesaje, double peso){
        this.fechaPesaje = fechaPesaje;
        this.peso = peso;
    }

    
    public double getPeso() {
        return peso;
    }
    public Date getFechaPesaje() {
        return fechaPesaje;
    }

    @Override
    public String toString() {
        return "PesoHistorico{" +
                "fechaPesaje=" + fechaPesaje +
                ", peso=" + peso +
                '}';
    }
    

    private double peso;
    private Date fechaPesaje;
}
