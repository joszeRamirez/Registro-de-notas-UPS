/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;
import ec.edu.ups.clases.*;

/**
 *
 * @author Josze
 */
public class Principal {

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.setNombre("Josze");
        est.setCodigo(158);
        est.setCedula("0706740610");
        est.setDireccion("no me acuerdo de las calles");
        est.setTelefono("0982432751");
        est.setCorreo("jo.an.ra.k_@hotmail.com");
        
        Sede sed = new Sede();
        sed.setNombre("Cuenca");
        sed.setCodigo(542);
        sed.setDireccion("Detras del parque");
        sed.setTelefono("2983418");
        
        est.setSede(sed);
        
        System.out.println(est);
    }
}
