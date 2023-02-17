package fundamentosPOO;

class Persona {

    // ! atributos

    // ? 1. abstraccion .- proceso mental de abstraer conceptos, caracteristicas y
    // funcionalidades de un objeto del mundo real
    // ? 2. encapsulamiento .- son todas las tecnicas para privatatizar , aislar
    // ciertas caracteristicas de mi objeto
    private String nombre;
    private int edad;
    private String cedula;
    private boolean sexo;

    // * id.- es el valor inicial, de identificador del objeto unico , static nos
    // sirve paara poder usar dicho atributo sin necesidad de instanciar el objeto
    // en cuestion
    private static int id = 0;

    // !constructores

    // * constructor por defecto, todo aquel que inicializa mis atributos a su valor
    // por defecto, ademas no tiene parametros iniciales
    protected Persona() {

        this.nombre = "";
        this.edad = 0;
        this.cedula = "";
        this.sexo = false;

    }

    protected Persona(String nombre, int edad, String cedula, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;

    }

    // !metodos

    protected void setNombre(String nombre) {

        this.nombre = nombre;

    }

    protected String getNombre() {

        return this.nombre;

    }

    protected void setEdad(int edad) {

        this.edad = edad;
    }

    protected int getEdad() {
        return this.edad;
    }

    protected void setCedula(String cedula) {

        this.cedula = cedula;
    }

    protected String getCedula() {
        return this.cedula;
    }

    protected void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    protected boolean getSexo() {

        return this.sexo;
    }


    //*Metodo polimorfico para mostrar la informacion de cada tipo de persona en cuestion
    protected String mostrarInfo() {

        String sexoString = this.sexo ? "Masculino" : "Femenino";

        return "Id: " + this.id + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "Cedula: " + this.cedula + "\n" +
                "Sexo: " + sexoString + "\n";

    }

    public static int getId() {
        return id;
    }

}
