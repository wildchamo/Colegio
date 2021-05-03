/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wild.chamo
 */
public class Gender {
    
    
    public Gender() {
    }

    private int idGender;
    private String nameG;

    public Gender(String nameG, int idGender) {
        this.nameG = nameG;
        this.idGender = idGender;
    }
    

    public Gender(String nameG) {
        this.nameG = nameG;
    }

    /**
     * Get the value of nameG
     *
     * @return the value of nameG
     */
    public String getNameG() {
        return nameG;
    }

    /**
     * Set the value of nameG
     *
     * @param nameG new value of nameG
     */
    public void setNameG(String nameG) {
        this.nameG = nameG;
    }

    /**
     * Get the value of idGender
     *
     * @return the value of idGender
     */
    public int getIdGender() {
        return idGender;
    }

    /**
     * Set the value of idGender
     *
     * @param idGender new value of idGender
     */
    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    @Override
    public String toString() {
        return "Gender{" + "nameG=" + nameG + ", idGender=" + idGender + '}';
    }

}
