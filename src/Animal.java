public class Animal {
    // declaracion de atributos
    private String nombre;
    private String tipo;
    private String genero;
    // metodo constructor
    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo.toLowerCase();//toLowerCase convierte a minusculas
        this.genero = genero.toLowerCase();//toLowerCase convierte a minusculas
    }
    // propiedades getters
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public String getGenero() {
        return genero;
    }
    //propiedades setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }
    public void setGenero(String genero) {
        this.genero = genero.toLowerCase();
    }
    // metodo toString
    @Override
    public String toString() {
        return nombre; //+ " es un "+ tipo +" y es de genero "+ genero;
    }
}
