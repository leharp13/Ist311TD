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
 class gamePanel extends JPanel {
             
    private JButton tile = new JButton("test");
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();


//            timer t1;
            
            

    public gamePanel() {
       

       
    }

 }
            
           
//for(int x = 0; x<10;x++)
//{
//    for(int y = 0; y<10; y++){
//    g.drawRect(50 + (y* 50) , 50 + (y *50) , 50,50);
//    }
//}
//    
//            
//            
//            gamePanel.add(enemies);
//            gamePanel.add(towers);
//            
//            
//            
//            this.add(gamePanel);
//            
//            
//        }
//        public void run(){
//            
//        }
//       
//        
//}
