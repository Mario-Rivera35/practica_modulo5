
package herencias;

//ahora crearemos las clases hijos heredadas de la clase padre
public class Circulo extends Formas {
    private  String Radio;
    private String color;
    
    //constructor clase estudiante 
     public Circulo( String color, String Radio){
         this.color=color;
         this.Radio=Radio;
         
         establecerdibujar("Circulo");
         establecercalculararea("area sombreada/15cm");
         
     }

   
   
    // luego declarasmos los datos que deseamos imprimir 
     public void imprimirinformacion(){
         System.out.println("Color:"+color);
         System.out.println("Radio:"+Radio);//con esto indicamos la linea a mostrar con los datos
         System.out.println("Dibujar:"+dibujar);
         System.out.println("Radio a Calcular:"+calcularRadio);

        
    }
}

