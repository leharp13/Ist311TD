/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.*;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import javax.swing.*;
import java.io.*;


 

//int towerPlacement [][]={{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
 class gamePanel extends JPanel {
    
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
    JPanel gamePanel = new JPanel();
         public static Image[] tileset_ground = new Image[100];
         public void paintComponent(Graphics g)
         {
             super.paintComponent(g);
             Image myImage = Toolkit.getDefaultToolkit().getImage("");
             g.drawImage(myImage, 0, 0, this);  
             room.draw(g);
         }
         
         public static Room room;
         public static Save save;
         
         public void define() {
             room = new Room();
             save = new Save();
             
             for(int i = 0; i<tileset_ground.length;i++){
                 tileset_ground[i] = new ImageIcon("res/tileset_ground.png").getImage();
//                 tileset_ground[i] = createImage(new FilteredImageSource(tileset_ground[i].getSource(), new CropImageFilter(0, 26*i, 26, 26)));
             }
             save.loadSave(new File("save/maplayout.txt"));
         }
         
         public gamePanel() {
         
           define();
           
    }  
         
        int towerPlacement [][]={{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
                                {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},};
     
      public void  checkplacement(int X, int Y) //X,Y are the possition in which the user clicks to place a tower 

      {
          try
          {
          for(int x=0; x<20;x++)
          {
              for(int y=0; y<24;y++)
              {
                  if(towerPlacement [X][Y] ==0) 
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
       



    

 }
 

           

