/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author wild.chamo
 */
public class BaseDatos {
    Connection conexion;
    Statement st;

    public BaseDatos() {

    }


    public Connection getConexion() {
        return conexion;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
    
    public boolean crearConexion(){
       boolean t=false;
       String url="jdbc:mysql://localhost:3306/colegio";
       String user="admincolegio";
       String password="123456";
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
           try {
               conexion=DriverManager.getConnection(url,user,password);
               st=conexion.createStatement();
               t=true;
           } catch (SQLException ex) {
               Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
           }    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    public boolean ejecutarSQL(String sql) {
    boolean t=false;
    
    if(crearConexion()){
        try {   
            st=conexion.createStatement();
            st.executeUpdate(sql);
            t=true;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    return t;
    }
    
}
