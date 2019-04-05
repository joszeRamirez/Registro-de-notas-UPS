package ec.edu.ups.clases;

/**
 * Grupo
 *
 * Clase que estructura al grupo
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Grupo {

    private int codigo;
    private String nombre;
    private int cupo;

    public Grupo() {
    }

    public Grupo(int codigo, String nombre, int cupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "Grupo{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", cupo=" + cupo + '}';
    }

}
