package ec.edu.ups.clases;

/**
 * Persona
 *
 * Clase que construye a la persona
 *
 * @since 2019
 * @version 1.0
 * @author Josze
 */
public class Persona {

    /*int privado del objeto codigo*/
    private int codigo;
    /*String privado del objeto nombre*/
    private String nombre;
    /*String privado del objeto cedula*/
    private String cedula;
    /*String privado del objeto telefono*/
    private String telefono;
    /*String privado del objeto direccion*/
    private String direccion;
    /*String privado del objeto correo*/
    private String correo;
    /*Sede privado del objeto sede*/
    private Sede sede;

    /**
     * Constructor
     */
    public Persona() {
    }

    /**
     * Método que devuelve el codigo de la persona
     *
     * @return (int) codigo
     */
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", cedula=" + cedula + ", telefono=" + telefono
                + ", direccion=" + direccion + ", correo=" + correo
                + ", sede=" + sede + '}';
    }

}
