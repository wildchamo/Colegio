/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.BaseDatos;
import modelo.Student;
/**
 *
 * @author wild.chamo
 */
public class ControladorEstudiante {
       public boolean insertEstudiante(Student objs) {
        boolean t=false;
        String sql="insert into students(name1S, name2S, surname1S, surname2S, mobileS,addressS ,stratumS ,institutionalEmailS ,custodianMobile1,custodianMobile2,userS,passwordS) value(?,?,?,?,?,?,?,?,?,?,?,?)";        
        Student objs = new Student();
        t=objs.insertStudent(sql,objs);
        return t;
        
        
    }
}
