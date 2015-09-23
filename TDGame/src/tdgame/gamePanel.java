/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jakesemple
 */
 class gamePanel extends JPanel  {
             
    private JButton tile = new JButton();
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();

        gamePanel(){
            
            
            
            JPanel gameSidePanel = new JPanel();
            
            this.setSize(WIDTH, HEIGHT);

            
            
            //gamePanel.add(enemies);
            //gamePanel.add(towers);
            
            
            
            this.add(gamePanel);
            this.add(gameSidePanel);
            
        }
       
        
}
