package objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import constantes.Raza;
import interfaces.PesoActualizable;

public class Animal implements Serializable , Comparable<Animal>, PesoActualizable{
    private int codigo;   
    private double pesoActual;  
    private Date fechaNacimiento; 
    private Raza  raza;     
    private Propietario propietario; 
    private  List<PesoHistorico> historicoPesos;


    public Animal(int codigo, double pesoActual, Date fechaNacimiento, Raza raza, Propietario propietario) {
        this.codigo = codigo;
        this.pesoActual = pesoActual;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.propietario = propietario;
        this.historicoPesos = new ArrayList<>();
        historicoPesos.add(new PesoHistorico(new Date(), pesoActual));
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Raza getRaza() {
        return raza;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public List<PesoHistorico> getHistoricoPesos() {
        return historicoPesos;
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigo,propietario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal objAnimal = (Animal) obj;
        return Objects.equals(codigo, objAnimal.codigo) &&
               Objects.equals(propietario, objAnimal.propietario);
    }

    @Override
    public int compareTo(Animal arg0) {
        return 0;
    }
    @Override
    public void actualizarPeso(double nuevoPeso) {
       this.pesoActual = nuevoPeso;
       this.historicoPesos.add(new PesoHistorico(new Date(), nuevoPeso));
    } 
    @Override
    public String toString() {
        return "Animal{" +
                "codigo=" + codigo +
                ", pesoActual=" + pesoActual +
                ", fechaNacimiento=" + fechaNacimiento +
                ", raza=" + raza +
                ", propietario=" + propietario +
                '}';
    }
}