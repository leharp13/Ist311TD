
package tdgame;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author jakesemple
 */

public class menuController {
    private myJFrame theView;
    private menu theMenu;

    
    public menuController(myJFrame theView, menu theMenu){
        this.theView = theView;
        this.theMenu = theMenu;
        
        this.theView.easyGameListener(new startGameListener("easy"));
        this.theView.mediumGameListener(new startGameListener("medium"));
        this.theView.hardGameListener(new startGameListener("hard"));
    }
    
    class startGameListener implements ActionListener{
        private String action;
        gameView new_game = new gameView();
        
            public startGameListener(String action)
            {
                this.action = action.toLowerCase();
            }
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if (action.equals("easy")){
                        theMenu.startEasy();
                        System.out.println("easy picked");
                        
                        
                        new_game.setVisible(true);
                        
                        
                    }
                    if (action.equals("medium")){
                        theMenu.startMedium();
                        System.out.println("medium picked");
                    }
                    if (action.equals("hard")){
                        theMenu.startHard();
                        System.out.println("hard picked");
                    }
                }
                catch(NumberFormatException ex){
                theView.displayErrorMessage("You have to enter your name to play. ");
            }
    }
}
    
    
}
