/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.io.*;
/**
 *
 * @author USER
 */
public class PokemonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i ;
      Pokemon Charecter = new Pokemon() ;
      System.out.println(" Welcome To Pokemon Center");
      Charecter.setName();
      Charecter.showStatus();
      Charecter.startGame();
    }
    
}
