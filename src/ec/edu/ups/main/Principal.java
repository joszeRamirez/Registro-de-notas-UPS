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
        Sede sedeCuenca = new Sede(123, "Sede Cuenca", "Detras del parque",
                "2983418");
        Carrera compu = new Carrera(1, "Computacion", 10, 200,
                "Ingeniero en Ciencias de la Computación");
        Carrera telemat = new Carrera(2, "Telemática", 8, 150,
                "Ingeniero en Ciencias de la Telemática");
        Carrera mecatro = new Carrera(3, "Mecatrónica", 10, 250,
                "Ingeniero Mecatrónico");
        sedeCuenca.addCarrera(compu);
        sedeCuenca.addCarrera(telemat);
        sedeCuenca.addCarrera(mecatro);
        Materia calculoDife = new Materia(20, "Calculo Diferencial", 3, 140, 2);
        Materia etica = new Materia(15, "Ética", 3, 80, 3);
        Materia algebraLin = new Materia(10, "Álgebra Lineal", 3, 120, 1);
        Materia calc1Var = new Materia(5, "Cálculo de una variable", 3, 150, 1);
        Materia logic = new Materia(78, "Lógica", 3, 75, 1);
        Materia comunica = new Materia(99, "Comunicación", 3, 50, 1);
        
        compu.addMateria(calculoDife);
        compu.addMateria(algebraLin);
        telemat.addMateria(etica);
        telemat.addMateria(comunica);
        mecatro.addMateria(calc1Var);
        mecatro.addMateria(logic);
        
        Profesor gaLeo = new Profesor("Ingeniero en computación", 950, "Profesor", 12, "Gabriel León", "0705462151", "0982465125", "Desconocido", "gl@hotmail.com");
        gaLeo.setSede(sedeCuenca);
        Profesor anPla = new Profesor("Ingeniera en Computación", 980, "Profesor", 254, "Andrea Plaza", "0705468751", "0983859494", "Confidencial", "apla@gmail.com");
        anPla.setSede(sedeCuenca);
        
        Estudiante joRa = new Estudiante(19989, "José Ramírez", "0706740610", "0982432751", "Empresa eléctrica", "jramirezc9@est.ups.edu.ec");
        joRa.setSede(sedeCuenca);
        Estudiante jhoChi = new Estudiante(19984, "John Chiqui", "0706548512", "0954657825", "El Juri", "jchiquic@est.ups.edu.ec");
        jhoChi.setSede(sedeCuenca);
        Estudiante floPe = new Estudiante(19987, "Carlos Peralta", "0702132654", "0978451232", "El matadero", "cperaltab@est.ups.edu.ec");
        floPe.setSede(sedeCuenca);
        Estudiante juBa = new Estudiante(19978, "Juan Barrera", "0705432879", "0954565852", "Victoria Secret", "jbarrerab@est.ups.edu.ec");
        juBa.setSede(sedeCuenca);
        
        joRa.setCarrera(compu);
        jhoChi.setCarrera(mecatro);
        floPe.setCarrera(telemat);
        juBa.setCarrera(mecatro);
        
        Grupo g1 = new Grupo(1, "Grupo 1", 20);
        Grupo g2 = new Grupo(2, "Grupo 2", 18);
        
        algebraLin.setProfesor(gaLeo);
        algebraLin.setGrupo(g2);
        calc1Var.setProfesor(anPla);
        calc1Var.setGrupo(g1);
        
        HistorialCalificacionEstudiante caliEst1 = new HistorialCalificacionEstudiante(30, 20, 28, 18);
        caliEst1.setEstudiante(juBa);
        caliEst1.setMateria(calc1Var);
        
        HistorialCalificacionEstudiante caliEst2 = new HistorialCalificacionEstudiante(25, 15, 29, 19);
        caliEst2.setEstudiante(floPe);
        caliEst2.setMateria(etica);
        
        HistorialCalificacionEstudiante caliEst3 = new HistorialCalificacionEstudiante(20, 20, 27, 20);
        caliEst3.setEstudiante(joRa);
        caliEst3.setMateria(calculoDife);
        
        HistorialCalificacionEstudiante caliEst4 = new HistorialCalificacionEstudiante(24, 14, 26, 17);
        caliEst4.setEstudiante(jhoChi);
        caliEst4.setMateria(logic);
        
        System.out.println(caliEst1);

        //crear 2 profes, 4 estudiantes, 2 grupos
        /*Estudiante est = new Estudiante();
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
        
        System.out.println(est);*/
    }
}
