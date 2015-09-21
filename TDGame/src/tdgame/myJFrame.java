/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

//jake semple
//Consider removing difficulty labels, labeled on buttons

public final class myJFrame extends JFrame{
    private JButton easy = new JButton("Easy");
    private JButton medium = new JButton("Medium");
    private JButton hard = new JButton("Hard");
    private JTextField input = new JTextField(10);
    private JLabel scoreLabel = new JLabel("Scores");
    private JTextArea scores = new JTextArea();
    private JLabel instructions = new JLabel("Instructions");
    private JTextArea instructionArea = new JTextArea();
    private JLabel enterName = new JLabel("Enter Your name: ");
    private JLabel easyL = new JLabel("Easy");
    private JLabel mediumL = new JLabel("Medium");
    private JLabel hardL = new JLabel("Hard");
    private JLabel enterL = new JLabel("Enter");
    
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    
    myJFrame(){
        JPanel thePanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(2,2));
        JPanel namePanel = new JPanel();

        thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.Y_AXIS));
        thePanel.setBackground(Color.lightGray);
        
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        
        buttonPanel.setBackground(Color.lightGray);
        namePanel.setBackground(Color.lightGray);
        
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTextArea();
        thePanel.add(instructions);
        thePanel.add(instructionArea);
        thePanel.add(scoreLabel);
        thePanel.add(scores);
//        buttonPanel.add(easyL);
        buttonPanel.add(easy);
//        buttonPanel.add(mediumL);
        buttonPanel.add(medium);
//        buttonPanel.add(hardL);
        buttonPanel.add(hard);
        namePanel.add(enterName);
        namePanel.add(input);

        thePanel.add(namePanel);
        thePanel.add(buttonPanel);
        this.add(thePanel);

    }
    public void createTextArea(){
        instructionArea.setEditable(false);
        instructionArea.setSize(5, 5);
        instructionArea.setText("Welcome, \nSelect a level of difficulty to begin. \n"
                + "Remaining instructions go here");
        
        scores.setEditable(false);
        scores.setSize(5, 5);
        scores.setText("High Scores will go here");
    }
    
    public String getName(){
        return enterName.getText();
    }
    
    public void easyGameListener(ActionListener listener){
        easy.addActionListener(listener);
    }
    public void mediumGameListener(ActionListener listener){
        medium.addActionListener(listener);
    }
    public void hardGameListener(ActionListener listener){
        hard.addActionListener(listener);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
