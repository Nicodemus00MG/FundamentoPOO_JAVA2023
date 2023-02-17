package fundamentosPOO;

public class Profesor extends Persona {
    // !atributos
    private double sueldo;
    private int horasTrabajo;
    private int horasExtraTrabajo;
    private String materia;

    // !constructores

    public Profesor() {
        this.materia = "";
        this.sueldo = 700.00;
        this.horasTrabajo = 0;
        this.horasExtraTrabajo = 0;

    }

    public Profesor(String nombre, int edad, String cedula, boolean sexo, String materia, 
            int horasTrabajo, int horasExtraTrabajo) {

        super(nombre, edad, cedula, sexo);
        this.materia = materia;
        this.sueldo = 700.0;
        this.horasTrabajo = horasTrabajo;
        this.horasExtraTrabajo = horasExtraTrabajo;
    }

    // !metodos

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getHorasExtraTrabajo() {
        return horasExtraTrabajo;
    }

    public void setHorasExtraTrabajo(int horasExtraTrabajo) {
        this.horasExtraTrabajo = horasExtraTrabajo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    public void evaluarHorasTrab(){

        if(this.horasTrabajo>=8 && this.horasExtraTrabajo>=0){

            //! sueldo se incrementa por h extra en 40$
            for(int i=0;i<horasExtraTrabajo;i++){
                 this.sueldo+=40;
            }

        }


    }


    @Override
    public String mostrarInfo(){
        
        String sexoString = this.getSexo() ? "Masculino" : "Femenino";

        return "Id: " + this.getId() + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Cedula: " + this.getCedula() + "\n" +
                "Sexo: " + sexoString + "\n"+
                "Materia: "+this.materia+"\n"+
                "Sueldo: "+this.sueldo+"\n"+
                "Horas de trabajo total: "+this.horasTrabajo+"\n"+
                "Horas de trabajo extra: "+this.horasExtraTrabajo+"\n";


    }

}
