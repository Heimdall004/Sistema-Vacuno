package objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import interfaces.AnimalRepository;

public class AnimalRepositoryImpl implements AnimalRepository{

    @Override
    public void guardarDatos(Map<Integer, Animal> animales, String pathFile) {
        try ( ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(pathFile)) ) {
            output.writeObject(animales);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Map<Integer, Animal> cargarDatos(String nombreArchivo) {
       Map<Integer, Animal> animales = new HashMap<>();
       try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
        animales = (Map<Integer,Animal>)inputStream.readObject(); 
       } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
       }
       return animales;
    }
}