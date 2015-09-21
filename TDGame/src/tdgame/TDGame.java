/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

/**
 *
 * @author lehar
 */
public class TDGame {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       myJFrame menu = new myJFrame();
       menu theMenu = new menu();
       menuController cont = new menuController(menu, theMenu);
       menu.setVisible(true);
       
//       gameView game = new gameView();
//       game.setVisible(true);
       
      
    }
    
}
