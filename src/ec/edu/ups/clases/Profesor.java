package ec.edu.ups.clases;

/**
 * Profesor
 *
 * Clase que, ademas de heredar de Persona, tiene sus propios atributos y se
 * encarga de estructurar al profesor
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Profesor extends Persona {

    private String titulo;
    private double salario;
    private String cargo;

    public Profesor() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "titulo=" + titulo
                + ", salario=" + salario + ", cargo=" + cargo + '}';
    }

}
