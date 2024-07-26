package constantes;


public enum Raza {

    ANGUS("Angus", "Una raza de carne de alta calidad, originaria de Escocia", "Escocia", "Carne de alta calidad, sin cuernos"),
    HEREFORD("Hereford", "Raza de carne originaria de Herefordshire, Inglaterra", "Inglaterra", "Carne tierna y bien marmoleada"),
    BRAHMAN("Brahman", "Raza adaptada al clima cálido, originaria de India", "India", "Resistente al calor, carne magra"),
    CHAROLAIS("Charolais", "Raza de carne de Francia conocida por su excelente calidad", "Francia", "Carne muy tierna, color blanco cremoso");

    Raza(String nombre, String descripcion, String origen, String caracteristicas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.caracteristicas = caracteristicas;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getOrigen() {
        return origen;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    private final String nombre;
    private final String descripcion;
    private final String origen;
    private final String caracteristicas;
}
