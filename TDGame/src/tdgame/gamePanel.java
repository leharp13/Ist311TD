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
            
         public void paintComponent(Graphics g)
         {
             super.paintComponent(g);
             Image myImage = Toolkit.getDefaultToolkit().getImage("bg.png");
             g.drawImage(myImage, 0, 0, this);
             
             
         }
        int towerPlacement [][]={{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},{0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},{0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},{0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},{0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},{0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},{0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},};
      int X= 5,Y = 6;
      public void  checkplacement(int X, int Y) //X,Y are the possition in which the user clicks to place a tower 

      {
          try
          {
          for(int x=0; x<10;x++)
          {
              for(int y=0; y<10;y++)
              {
                  if(towerPlacement [x][y] ==0) 
                  {

                      towerPlacement[x][y] =2;

                  }
                  else if (towerPlacement [x][y] ==1 || towerPlacement [x][y] == 2)
                  {
                      
                      throw new Exception();
                      }
                  }
              }
          }
          catch(Exception e)
          {
              System.out.println("you can not place a tower there");
              JOptionPane.showMessageDialog(null, "you can not place a tower in this location", "improper location",JOptionPane.WARNING_MESSAGE); 
          }
      }
       

    public gamePanel() {
    }

 }

           

