/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.BaseDatos;
import modelo.Gender;

/**
 *
 * @author wild.chamo
 */
public class ControladorGender {

    public boolean insertGender(Gender objg) {
    boolean t= false;
    String sql="insert into genders(nameG) value('"+objg.getNameG()+"');";
    BaseDatos objd=new BaseDatos();
    t=objd.ejecutarSQL(sql);
    
    return t;
    }
}
