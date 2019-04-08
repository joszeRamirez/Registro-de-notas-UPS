package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

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
    private List<HistorialCalificacionEstudiante> calificaciones;

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

    public Estudiante(int codigo, String nombre, String cedula,
            String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        calificaciones = new ArrayList<>();
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

    public void addCalificaciones(HistorialCalificacionEstudiante calificacion){
        calificaciones.add(calificacion);
    }
    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "\n" + "\tcarrera="
                + carrera + "\n" + "\tcalificaciones=" + calificaciones;
    }

}
