//Steven BUrns
//9/16/2015
//setting up the initial class for the menu

package tdgame;

import java.awt.BorderLayout;

public class menu {
    public String easy = "easy";
    public String medium = "medium";
    public String hard = "Hard";
    public String getinstr = "instructions";
    public String getname = "name";
    public String getHigh = "high score";
    gameView new_game = new gameView();
    
    
    public void startEasy()
    {
        System.out.println("easy game starts");
        
    }
    
    public void startMedium()
    {
        System.out.println("medium game starts");
    }
    public void startHard()
    {
        System.out.println("hard game starts");
    }         
            
          
}
