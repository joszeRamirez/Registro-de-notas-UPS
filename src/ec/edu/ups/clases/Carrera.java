package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Carrera
 *
 * Clase que estructura a la carrera
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Carrera {

    private int codigo;
    private String nombre;
    private int numSemestres;
    private int numeroEstudiantes;
    private String titulo;
    private List<Materia> materias;

    public Carrera() {
        
    }

    public Carrera(int codigo, String nombre, int numSemestres,
            int numeroEstudiantes, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numSemestres = numSemestres;
        this.numeroEstudiantes = numeroEstudiantes;
        this.titulo = titulo;
        materias = new ArrayList<>();
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

    public int getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addMateria(Materia materia) {
        materias.add(materia);
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + "\n" + "\t\tnombre=" + nombre
                + "\n" + "\t\tnumSemestres=" + numSemestres + "\n"
                + "\t\tnumeroEstudiantes=" + numeroEstudiantes + "\n"
                + "\t\ttitulo=" + titulo;
    }

}
