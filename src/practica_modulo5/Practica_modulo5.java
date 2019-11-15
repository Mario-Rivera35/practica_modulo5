 
package practica_modulo5;

import herencias.Circulo;
import herencias.Cuadrado;
import herencias.Lineas;
import herencias.Triangulo;


public class Practica_modulo5 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo","25cm");
        Lineas lineas = new Lineas("Verde","125mts");
        Cuadrado cuadrado = new Cuadrado("Morado","158pul");
        Triangulo triangulo= new Triangulo("Azul","90 grados");
        
        System.out.println("Formas1");
        //con esto hacemos el llamado a cada una de las instancias 
        //heredas y nos mostrara lo informacion que pedimos que nos muestre la clase padre
        circulo.imprimirinformacion();
        System.out.print("***********************************");
        lineas.imprimirinformacion();
        System.out.print("***********************************");
        cuadrado.imprimirinformacion();
        System.out.print("***********************************");
        triangulo.imprimirinformacion();
        System.out.print("***********************************");
    }
    
}
