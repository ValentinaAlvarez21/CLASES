/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author sena
 */
public class Docente extends Trabajador{
    private pregrado pregrado1;
    public void setpregrado (pregrado pregrado1Para) {
    this.pregrado1=pregrado1Para;
    }
    public pregrado getpregrado(){
    return pregrado1;
    }
    private String num_max_proyec;
    private String categoria;
}
