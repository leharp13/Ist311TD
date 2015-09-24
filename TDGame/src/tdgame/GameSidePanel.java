/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author jakesemple
 */
 class GameSidePanel extends JPanel {
    
    
    private JButton nextWaveButton = new JButton("Next");
    private JButton homeWorkButton = new JButton(" HW ");
    private JButton eraserButton = new JButton("ERASER");
    private JButton footballButton = new JButton("FOOTBALL");
    private JLabel playerName = new JLabel("Name");
    private JLabel playerHealth = new JLabel("Health");
    private JLabel playerScore = new JLabel("Score");
    private JLabel playerMoney = new JLabel("Money");
    private JLabel difficulty = new JLabel("Difficulty");
    private JLabel stageLabel = new JLabel("Stage");
    private JLabel hwTitle = new JLabel("Homework Tosser");
    private JLabel hwStats = new JLabel("Homework Tosser Stats");
    private JLabel eraseTitle = new JLabel("Eraser Cannon");
    private JLabel eraseStats = new JLabel("Eraser Cannon Stats");
    private JLabel footballTitle = new JLabel("FootBall Cannon");
    private JLabel footballStats = new JLabel("FootBall Cannon Stats");
    
    
    
    JPanel gamePanel = new JPanel();

        GameSidePanel(){
            
            
            
            JPanel gameSidePanel = new JPanel();
            JPanel topPanel = new JPanel();
            
            this.setSize(200, myJFrame.HEIGHT);

            gameSidePanel.add(nextWaveButton);
            gameSidePanel.add(homeWorkButton);
            gameSidePanel.add(eraserButton);
            gameSidePanel.add(footballButton);
            gameSidePanel.add(playerName);
            gameSidePanel.add(playerHealth);
            gameSidePanel.add(playerScore);
            gameSidePanel.add(playerMoney);
            gameSidePanel.add(difficulty);
            gameSidePanel.add(stageLabel);
            gameSidePanel.add(hwTitle);
            gameSidePanel.add(hwStats);
            gameSidePanel.add(eraseTitle);
            gameSidePanel.add(eraseStats);
            gameSidePanel.add(footballTitle);
            gameSidePanel.add(footballStats);
            
            
            this.add(gameSidePanel);
            
        }
       
        
}
