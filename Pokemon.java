/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
 import java.io.*;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author USER
 */
public class Pokemon {
  


    //Scanner sc = new Scanner(System.in  );
    int HP  ;
    int exp  ;
    int MANA;
    String name ;
   
    public Pokemon(){
        HP = 500 ;
        MANA = 1500;
        exp = 0 ;
        
    }
    
    //Set name charecter
    public String setName(){
        System.out.println("This is pokemon name me darksoul ");
        //name = sc.nextLine();
         return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("STATUS POINT");
        System.out.println("Pokemon Trainer : "+name );
        System.out.println("HP : "+HP+"  Point");
        System.out.println("SP : "+MANA+"  Point");
        System.out.println("THE EXP : "+exp+"  Point");
        
        return "";
    }

   public String startGame(){
     int i;
     for(i=0;i<15;i++ ){
       if(i == 2){
         exp += 6;
         System.out.println(" exp cuurent :"+exp);

       }
       else if(exp >= 18){
         HP -= 15;
         MANA -=50;
         exp = 0;
         System.out.println("exp cuurent:"+exp);
         System.out.println(" hp:"+HP);
         System.out.println(" SP:"+MANA);
       }
       else if(i == 14){
         i = 0;
       }
       else if(HP <= 0){
         System.out.println("!!! I'M DIE !!!");
         break;    
       }
     }
     return "";
   }
}
    
    

    



/**
 *
 * @author OHM
 */
