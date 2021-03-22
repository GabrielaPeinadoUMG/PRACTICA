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
public class Dispositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir){
        
            System.out.println("************ECOSISTEMA DEL DISPOSITIVO***********");
            System.out.println("1. Crear Dispositivo");   
            System.out.println("2. Administrar Dispositivo");        
            System.out.println("3. Acciones con Dispositivos");        
            System.out.println("4. Acciones externas de Dispositivos");        
            System.out.println("5. Cargas Masivoas");  
            System.out.println("6. Logs");  
            System.out.println("7. Salir");        
        
            try{   
            
            System.out.println("Seleccione un numero para Ejecutar:"); 
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Seleccionaste Crear Dispositivo");
                    break;
                case 2:
                    System.out.println("Seleccionaste Administrar Dispositivo");
                    break;
                case 3:
                    System.out.println("Seleccionaste Acciones con Dispositivo");
                    break;
                case 4:
                    System.out.println("Seleccionaste Acciones externas de Dispositivos");
                    break;
                case 5:
                    System.out.println("Seleccionaste Cargas Masivas");
                    break;
                case 6:
                    System.out.println("Seleccionaste Logs");
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Validos del 1-7");
                }    

            }catch(InputMismatchException e){  
                System.out.println("Introduce un numero para ser Valido");
                sn.next();
            }
            
            
     
        }    
            
        System.out.println("Saliste!");
    }
    
}
