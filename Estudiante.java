
package fundamentosPOO;

import java.util.Scanner;

public class Estudiante extends Persona {

    // ! atributos

    private int notas[];

    // ! constructores
    public Estudiante() {

        this.notas = new int[4];

    }

    public Estudiante(String nombre, int edad, String cedula, boolean sexo){
        super(nombre, edad, cedula, sexo);
        this.notas = new int[4];
    }

    // ! metodos

    public int[] getNotas() {
        return notas;
    }

    public void llenarNotas() {

        System.out.println("Ingresar notas: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota [" + (i + 1) + "]: ");
            this.notas[i] = new Scanner(System.in).nextInt();

        }
    }

    public void listarNotas() {

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota [" + (i + 1) + "]: ");
            System.out.println(this.notas[i]);

        }
    }

    public double promedio(){

        double resul=0;

        for (int i = 0; i < notas.length; i++) {
           
            resul+=notas[i];
        }

        return resul/notas.length;


    }


    @Override
    public String mostrarInfo(){

        String sexoString = this.getSexo() ? "Masculino" : "Femenino";

        return "Id: " + this.getId() + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Cedula: " + this.getCedula() + "\n" +
                "Sexo: " + sexoString + "\n"+
                "Notas:"+ "1°= "+this.notas[0]+" 2°= "+this.notas[1]+" 3°= "+
                this.notas[2]+" 4°= "+this.notas[3]+"\n";

    }

}
