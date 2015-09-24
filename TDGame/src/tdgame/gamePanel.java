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
 class gamePanel extends JPanel implements Runnable {
             
    private JButton tile = new JButton("test");
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();

        gamePanel(){
            
            
            
            
            
            this.setSize(WIDTH, HEIGHT);

            add(tile);
            
            //gamePanel.add(enemies);
            //gamePanel.add(towers);
            
            
            
            this.add(gamePanel);
            
            
        }
        public void run(){
            
        }
       
        
}
