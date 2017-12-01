/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

import java.util.Scanner;
/**
 *
 * @author JECA-MATI
 */
public class mnclass {
    
    Scanner num=new Scanner(System.in);
    int numero1,numero2;
    String msje="";
    
    
   public void IngreseDatos(){
        System.out.print(" ingrese el primer numero :");
        numero1=num.nextInt();
        System.out.print(" ingrese el segundo numero :");
        numero2=num.nextInt();
    }
   
   public void Calcula(){
       if(numero1>numero2)
       {msje=" el numero mayor es :"+numero1;}
       else{msje=" el numero mayor es :"+numero2;}
   }
   public String MuestraDatos(){
       return ("\n\n"+msje+"\n\n");
       
   }
}
