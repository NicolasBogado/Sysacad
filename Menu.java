
package sysacad;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);   
        
    int opcion = 0;
    
    String menu [] = new String [] {"1-Materias del plan","2-Estado académico","3-Exámenes","4-Correlatividad para cursar",
                    "5-Correlatividad para rendir","6-Avisos","7-Salir"};   
    
    System.out.println("\nIngrese una Opción: ");
        for(int i = 0;i < 7;i++){
            System.out.println(" "+menu[i]);
        }
    
    opcion = Integer.parseInt(entrada.nextLine());
    if(opcion == 1){
        System.out.println(menu[0]);
    }
    else if(opcion == 2){      
        System.out.println(menu[1]);
    }
    else if(opcion == 3){
        System.out.println(menu[2]);
    }
    else if(opcion == 4){
        System.out.println(menu[3]);
    }
    else if(opcion == 5){
        System.out.println(menu[4]);
    }    
    else if(opcion == 6){
        System.out.println(menu[5]);
    }    
    else if(opcion == 7){
        System.out.println(menu[6]);
    }
    else if(opcion == 8){
        System.out.println(menu[7]);
    }
  }       
    
}
