package ec.edu.ups.clases;

/**
 * Estudiante
 *
 * Clase que, ademas de heredar de Persona, tiene sus propios atributos y se
 * encarga de estructurar al estudiante
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Estudiante extends Persona {

    /*Carrera privado del objeto carrera*/
    private Carrera carrera;

    /**
     * Constructor
     */
    public Estudiante() {
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int codigo, String direccion, String telefono) {
        super(codigo, telefono, telefono);
    }

    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula,
            String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.carrera = carrera;
    }

    /**
     * Método que devuelve la carrera del estudiante
     *
     * @return (Carrera) carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * Método que introduce la informacion al objeto carrera
     *
     * @param carrera carrera del estudiante
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante{" + "carrera=" + carrera;
    }

}
