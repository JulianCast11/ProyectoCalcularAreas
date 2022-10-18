/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RYZEN 5
 */
public class Circulo extends FiguraGeometrica{
    
    private Integer radio;

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    
    public Double area(){
        return Math.PI*Math.pow(radio,2);
        
    }
    
}
