/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.*;
import javax.swing.*;


 

//int towerPlacement [][]={{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
 class gamePanel extends JPanel {
             
    private JButton tile = new JButton("test");
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();


//            timer t1;
            
 int towerPlacement [][]={{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
      
      public void  checkplacement()
      {
          
      }

    public gamePanel() {
    }

 }

           

