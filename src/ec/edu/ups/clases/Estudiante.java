package ec.edu.ups.clases;

/**
 *
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

}
