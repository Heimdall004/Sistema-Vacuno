package interfaces;

import java.util.Map;
import objetos.Animal;

public interface AnimalRepository {
    void guardarDatos(Map<Integer,Animal> animales,String pathFile);
    Map<Integer, Animal> cargarDatos(String nombreArchivo);
}
