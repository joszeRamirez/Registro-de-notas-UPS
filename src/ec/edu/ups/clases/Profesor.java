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

    public Profesor(String titulo, double salario, String cargo, int codigo,
            String nombre, String cedula, String telefono, String direccion,
            String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
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

    public double getSalario(int horasTrabajadas, double valorPorHora) {
        return salario + (horasTrabajadas + valorPorHora);
    }

    public double getSalario(double comision) {
        return salario + comision;
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
        return "Profesor{" + super.toString() + "\n" + "\ttitulo=" + titulo
                + "\n" + "\tsalario=" + salario + "\n" + "\tcargo=" + cargo;
    }

}
