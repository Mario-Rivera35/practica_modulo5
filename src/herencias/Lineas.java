
package herencias;


public class Lineas extends Formas {
    
    private String Largo;
    private String color;
    
    // metodo constructor de lineas con este se  hace el llamado 
    // a la clase padre para que nos muestra la informacion que queremos visualizar
     public Lineas( String Color, String Largo){
         this.color=color;
         this.Largo=Largo;
         establecerdibujar("Linea/100cm");
         
     }

   
     public void imprimirinformacion(){
         System.out.println("color:"+color);
         System.out.println("Largo:"+Largo);
         System.out.println("Dibujar:"+dibujar);
     }
}
