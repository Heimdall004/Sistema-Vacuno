package objetos;

import java.io.Serializable;
import java.util.Objects;

public class Propietario implements Serializable{
    
    public Propietario(String cedula,String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    public String getNombreProietario(){
        return nombre; 
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(cedula,nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Propietario other = (Propietario) obj;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    private String cedula;
    private String nombre;
}
