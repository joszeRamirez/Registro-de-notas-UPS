package ec.edu.ups.clases;

/**
 * HistorialCalificaciones
 *
 * Clase que estructura al historial de calificaciones
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class HistorialCalificaciones {

    private int aprovecha1;
    private int examen1;
    private int aprovecha2;
    private int examen2;
    private Estudiante estudiante;

    public HistorialCalificaciones() {
    }

    public int getAprovecha1() {
        return aprovecha1;
    }

    public void setAprovecha1(int aprovecha1) {
        this.aprovecha1 = aprovecha1;
    }

    public int getExamen1() {
        return examen1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public int getAprovecha2() {
        return aprovecha2;
    }

    public void setAprovecha2(int aprovecha2) {
        this.aprovecha2 = aprovecha2;
    }

    public int getExamen2() {
        return examen2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "HistorialCalificaciones{" + "aprovecha1=" + aprovecha1
                + ", examen1=" + examen1 + ", aprovecha2=" + aprovecha2
                + ", examen2=" + examen2 + ", estudiante=" + estudiante + '}';
    }

}
