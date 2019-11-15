
package herencias;


public class Cuadrado  extends Formas{
    public String Area;
    public String color;
    
     public Cuadrado( String color,String Area){
         this.color=color;
         this.Area=Area;
        establecerdibujar("Cuadrado");
        establecercalculararea("circunferencia/3.1416");
     }
      public void imprimirinformacion(){
          System.out.println("Color:"+color);
         System.out.println("Area:"+Area);
         System.out.println("Dibujar:"+dibujar);
         System.out.println("Area a Calcular:"+calculararea);
}
}