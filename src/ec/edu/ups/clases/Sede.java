package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Sede
 *
 * Clase que estructura a la sede
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Sede {

    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carreras;

    public Sede() {
        
    }

    public Sede(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        carreras = new ArrayList<>();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void addCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    @Override
    public String toString() {
        return "Sede{" + "\n" + "\tcodigo=" + codigo + "\n" + "\tnombre=" + nombre
                + "\n" + "\tdireccion=" + direccion + "\n" + "\ttelefono=" + telefono
                + "\n" + "\tcarreras=" + carreras;
    }

}
