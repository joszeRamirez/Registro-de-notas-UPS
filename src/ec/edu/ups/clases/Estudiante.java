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

    private Carrera carrera;

    public Estudiante() {
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "carrera=" + carrera + '}';
    }

}
