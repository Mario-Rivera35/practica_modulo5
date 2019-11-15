
package herencias;

import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;


public class Formas {
   //atributos;
    private String color;
    // el protected se colaca por cunado se declara la variable
    // al imprimir nos genera un error por el la variable es de instancia
    // privada y no nos permite hacer referencia con la variable.
    // esto por que estamos heredando de la clase padre y con el protectd
    //nos da como un permiso que ese dato estara protegido siempre.
    protected String dibujar;
    private String establecercolor;
    protected String calcularRadio;
    protected String calculararea;
     protected String calcularangulo;
    
    
    
    
    public Formas(){
       
        // ahora por los memonetos dejamos el constructor
        //forma por mientras damos los parametros.
        
        
    }
    // ahora vamos a crear los metodos establecer y crear.
     public  void establecerdibujar(String dibujar){
        this.dibujar=dibujar;    
     }
      public String obtenerdibujar(String dibujar){
          this.dibujar=dibujar;
        return null;
          
      }
      public  void establecercalcularRadio(String calcularRadio){
        this.calcularRadio= calcularRadio;  
     }
      public String obtenercalcularRadio(String calcularRadio){
        this.calcularRadio= calcularRadio;
        return null;
          
      }
       public  void establecercalculararea(String calculararea){
        this.calculararea= calculararea;  
     }
      public String obtenercalculararea(String calculararea){
        this.calculararea= calculararea;
        return null;
          
      }
      public  void establecercalcularangulo(String calcularangulo){
        this.calcularangulo= calcularangulo;  
     }
      public String obtenercalcalcularangulo(String calcularangulo){
        this.calcularangulo= calcularangulo;
        return null;
          
      }
}

 



