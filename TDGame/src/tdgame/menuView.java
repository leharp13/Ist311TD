/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgame;

import javax.swing.*;

//jake semple

public class menuView extends JFrame{
    private JButton easy = new JButton("Easy");
    private JButton medium = new JButton("Medium");
    private JButton hard = new JButton("Hard");
    private JTextField input = new JTextField(10);
    private JLabel scores = new JLabel();
    private JLabel instructions = new JLabel();
    private JLabel enterName = new JLabel();
    private JLabel easyL = new JLabel();
    private JLabel mediumL = new JLabel();
    private JLabel hardL = new JLabel();
    private JLabel enterL = new JLabel();
    
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    
    menuView(){
        JPanel thePanel = new JPanel();
        
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        thePanel.add(easy);
        thePanel.add(medium);
        thePanel.add(hard);
        thePanel.add(input);
        thePanel.add(scores);
        thePanel.add(instructions);
        thePanel.add(enterName);
        thePanel.add(easyL);
        thePanel.add(mediumL);
        thePanel.add(hardL);
        thePanel.add(enterL);
        
        this.add(thePanel);
    }
}
