import java.util.Scanner;

public class App {

    private String mostrarAltura(int altura) {
        String resultado = "";
        if (altura >= 180) {
            resultado = "eres una persona alta";
        } else {
            resultado = "eres una persona baja";
        }
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Hello, World2!");

        // variable
        int edad = 45;
        String nombre = "Lucia";
        Boolean verdadero = true;
        System.out.println(nombre + edad);
        System.out.printf("Me llamo %s tengo %d años", nombre, edad);

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("¿como te llamas? ");
        String miNombre = sc.nextLine();
        System.out.println("El usuario se llama " + miNombre);

        // Condicionales
        Scanner sc2 = new Scanner(System.in);
        System.out.print("¿cuanto mides? ");
        int altura = sc2.nextInt();

        // Funciones / Metodos
        App aplicacion = new App();
        System.out.println(aplicacion.mostrarAltura(altura));

        // Lista y Array
        String[] personas = { "Victor", "Fran", "Laura" };
        personas[2] = "Franco";
        System.out.println(personas[0]);

        // bucle
        for (String persona : personas) {
            System.out.println(persona);
        }
    }
}
