package fundamentosPOO;

public class Principal {

    // !atributos
    private static Estudiante p1 = new Estudiante("Juan", 18, "175212312", true);
    private static Profesor p2 = new Profesor("Pablo Parra", 44, "11231231", true, "Programacion", 10, 2);

    // !constructores

    // ! metodos
    public static void main(String args[]) {

        // p1.llenarNotas();
        // p1.listarNotas();
        // System.out.println("Promedio: "+p1.promedio());
        // System.out.println("INFORMACION: ");
        // System.out.println(p1.mostrarInfo());

        p2.evaluarHorasTrab();
        System.out.println(p2.mostrarInfo());

    }

}
