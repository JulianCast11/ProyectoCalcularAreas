/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.RegistrarCirculo;
import DAO.RegistrarRectangulo;
import DAO.RegistrarTriangulo;
import Model.Circulo;
import Model.Rectangulo;
import Model.Triangulo;
import Servicios.Conexion;
import java.sql.Date;

/**
 *
 * @author RYZEN 5
 */
public class Control {

    private RegistrarCirculo cir = new RegistrarCirculo();
    private RegistrarRectangulo rec = new RegistrarRectangulo();
    private RegistrarTriangulo tri = new RegistrarTriangulo();

    public void registrar(Circulo c, Rectangulo r, Triangulo t) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();

            cir.registrar(Conexion.obtener(), c);
            rec.registrar(Conexion.obtener(), r);
            tri.registrar(Conexion.obtener(), t);
        } catch (Exception e) {

        }

    }

    public void actualizarA(Integer idAlumno, String nombre, String apellido, String email, String genero) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            cir.actualizar(Conexion.obtener(), idAlumno, nombre, apellido, email, genero);
        } catch (Exception e) {

        }
    }
    
    public void actualizarM(Integer idMateria,String nombre,String profesor,String creditos) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            rec.actualizar(Conexion.obtener(), idMateria, nombre, profesor, creditos);
        } catch (Exception e) {

        }
    }
    
    public void actualizarMt(Integer idMatricula,Integer idAlumno,Integer idMateria ,Date fechaMatricula) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            tri.actualizar(Conexion.obtener(), idMatricula, idAlumno, idMateria, fechaMatricula);
        } catch (Exception e) {

        }
    }

    public Circulo buscarAlumno(Integer idAlumno) {
        try {
            return cir.buscar(Conexion.obtener(), idAlumno);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Rectangulo buscarMateria(Integer idMateria) {
        try {
            return rec.buscar(Conexion.obtener(), idMateria);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Triangulo buscarMatricula(Integer idMatricula) {
        try {
            return tri.buscar(Conexion.obtener(), idMatricula);
        } catch (Exception e) {

        }
        return null;
    }
    
    public void eliminar(Integer idAlumno, Integer idMateria, Integer idMatricula){
        try{
            //RegistrarProducto rp=new RegistrarProducto();
            cir.eliminar(Conexion.obtener(), idAlumno);
            rec.eliminar(Conexion.obtener(), idMateria);
            tri.eliminar(Conexion.obtener(), idMatricula);
        }catch(Exception e){
            
        }
    }

}

