/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import javax.swing.*;

/**
 *
 * @author jakesemple
 */
public class gameView extends JFrame{
    private JButton title = new JButton();
    private JButton takenTile = new JButton();
    private Enemy enemies = new Enemy();
    private Towers towers = new Towers();
    
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
    
    private final int WIDTH = 800;
    private final int HEIGHT = 800;

        gameView(){
            JPanel gamePanel = new JPanel();
            JPanel gameSidePanel = new JPanel();
            
            this.setSize(WIDTH, HEIGHT);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            gamePanel.add(title);
            gamePanel.add(takenTile);
            //gamePanel.add(enemies);
            //gamePanel.add(towers);
            
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
            
            this.add(gamePanel);
            this.add(gameSidePanel);
        }
}
