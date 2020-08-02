
package calculo.Area.Volumen;

import java.util.Scanner;



public class JavaApplication7 {


     public static void main(String[] args) { 
      
    
    
            Scanner Teclado =new Scanner(System.in);
        
        double radio =0;
        double area =0;
        double volumen =0;
    
    
    
    System.out.println("Diguite el valor del radio ");
    
    
        radio = Teclado.nextInt();
        
                
        area = (double)((4.0/3.0)*Math.PI)*Math.pow(radio,2));
        
        volumen =(double)((4.0/3.0))*Math.PI)*Math.pow(radio,3)));
        
      System.out.println("El área de circulo es:"+area);
      

      System.out.println("El volumen de la esfera es:"+volumen);
      
}
    }



    

        
        
    

