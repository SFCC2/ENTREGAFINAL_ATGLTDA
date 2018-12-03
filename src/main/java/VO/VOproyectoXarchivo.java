/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Sulay2016
 */
public class VOproyectoXarchivo {
   private int idProAR;
   private int cedula;
   private int idProyecto;

    public VOproyectoXarchivo(int idProAR, int cedula, int idProyecto) {
        this.idProAR = idProAR;
        this.cedula = cedula;
        this.idProyecto = idProyecto;
    }

    public int getIdProAR() {
        return idProAR;
    }

    public void setIdProAR(int idProAR) {
        this.idProAR = idProAR;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
   
   
   public  VOproyectoXarchivo cast(Object t) {
        VOproyectoXarchivo mobj = VOproyectoXarchivo.class.cast(t);
        return mobj;
     }
}
