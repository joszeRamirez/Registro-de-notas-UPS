package ec.edu.ups.clases;

/**
 *
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

}
