/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Eduardo Miranda
 */
public class Triangulo extends Formas {
    private String Angulo;
    private String color;
    
    public Triangulo( String color, String Angulo){
        this.color=color;
        this.Angulo=Angulo;
        establecerdibujar("Triangulo");
        establecercalculararea("Perimetro/56cm");
        
    }
    public void imprimirinformacion(){
        System.out.println("Color:"+color);
         System.out.println("Angulo:"+calcularangulo);
         System.out.println("Dibujar:"+dibujar);
         System.out.println("Area a Calcular:"+calculararea);
        
    }
}
