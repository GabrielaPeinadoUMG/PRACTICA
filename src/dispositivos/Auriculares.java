/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dispositivos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Auriculares extends Crear_Dispo {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir){
        
            System.out.println("************CREACION DE NUEVOS AURICULARES***********");
            System.out.println("Listado de Dispositivos");   
                 
        
            try{   
            
            System.out.println("Seleccione un numero para Ejecutar:"); 
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Seleccionaste Crear Dispositivo");
                    break;
               
                default:
                    System.out.println("");
                }    

            }catch(InputMismatchException e){  
                System.out.println("");
                sn.next();
            }
            
        }    
            
        System.out.println("");
    }
}
