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

    /**
     * Método que introde la información al objeto codigo
     *
     * @param codigo codigo de la persona
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que devuelve el nombre de la persona
     *
     * @return (String) nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que introduce la información al objeto nombre
     *
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la cedula de la persona
     *
     * @return (String) cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método que introduce la información al objeto cedula
     *
     * @param cedula cedula de la persona
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método que devuelve el telefono de la persona
     *
     * @return (String) telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que introduce la información al objeto telefono
     *
     * @param telefono telefono de la persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que devuelve la direccion de la persona
     *
     * @return (String) direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que introduce la información al objeto direccion
     *
     * @param direccion direccion de la persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve el correo de la persona
     *
     * @return (String) correo
     */
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
