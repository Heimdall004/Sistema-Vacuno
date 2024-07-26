package objetos;
import java.util.Date;
import java.util.Map;

import constantes.Raza;
import interfaces.AnimalRepository;

public class GestionGanado {

    private AnimalRepository animalRepository;
    private static final String ARCHIVO_DATOS = "src/db/animales.dat";

    public GestionGanado(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void iniciar() {
        // Aquí podrías cargar los datos del archivo al iniciar
        Map<Integer, Animal> animales = animalRepository.cargarDatos(ARCHIVO_DATOS);
        
        // Imprimir los animales cargados
        imprimirAnimales(animales);

        //Crear y añadir nuevos animales
        Propietario propietario1 = new Propietario("01","Juan Pérez");
        Animal animal1 = new Animal(1, 250.0, new Date(), Raza.ANGUS, propietario1);
        animales.put(animal1.getCodigo(), animal1);

        //Guardar los datos en el archivo
        animalRepository.guardarDatos(animales, ARCHIVO_DATOS);
    }
    public void imprimirAnimales(Map<Integer, Animal> animales) {
        for (Animal entry : animales.values()) {
            System.out.println(entry.toString());
        }
    }

    public static void main(String[] args) {
        AnimalRepository animalRepository = new AnimalRepositoryImpl();
        GestionGanado gestionGanado = new GestionGanado(animalRepository);
        gestionGanado.iniciar();
    }
}
