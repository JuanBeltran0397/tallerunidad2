import java.util.*;
import java.util.ArrayList;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Animal> animales = new ArrayList<Animal>();
    private static Map<String, List<Animal>> clasificacion = new TreeMap<>();

    public static void main(String[] args) {

        System.out.println(" Sistema de Clasificacion de Animales");

        String avanzar;
// metodo para agregar animales segun necesidad del usuario
        do {
            Animal animal = crearAnimalDesdeConsola();
            animales.add(animal);
            clasificarAnimal(animal);

            System.out.print("¿Desea agregar otro animal? (s/n): ");
            avanzar = sc.nextLine().trim().toLowerCase();
        } while (avanzar.equals("s"));

        mostrarClasificacion();
    }
// se crea metodo para ingresar el animal por nombre
    private static Animal crearAnimalDesdeConsola() {
        System.out.println("Ingrese el nombre del animal: ");
        String nombre = sc.nextLine();
// por tipo
        String tipo;
        do {
            System.out.println("Tipo (Terrestre, Aereo, Acuatico): ");
            tipo = sc.nextLine().trim().toLowerCase();
        } while (!tipo.equals("terrestre") && !tipo.equals("aereo") && !tipo.equals("acuatico"));
 // por genero
        String genero;
        do {
            System.out.println("Género (Masculino, Femenino): ");
            genero = sc.nextLine().trim().toLowerCase();
        } while (!genero.equals("masculino") && !genero.equals("femenino"));
        // retorna la informacion del animal.
        return new Animal(nombre, tipo, genero);
    }
    // metodo para clasificacion de los animales
    private static void clasificarAnimal(Animal animal) {
        String tipo = animal.getTipo();
        clasificacion.putIfAbsent(tipo, new ArrayList<>());
        clasificacion.get(tipo).add(animal);
    }
    // metodo para mostrar la clasificacion de los animales
    private static void mostrarClasificacion() {
        System.out.println("clasificacion de animales: ");
        for (String tipo: clasificacion.keySet()) {
            System.out.println("Tipo: " + tipo);
            for (Animal animal : clasificacion.get(tipo)) {
                System.out.println(" - " + animal);
            }
        }
    }

}
