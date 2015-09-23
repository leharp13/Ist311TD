package tdgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jakesemple
 */


class mainJPanel extends JPanel{
    public JButton easy = new JButton("Easy");
    public JButton medium = new JButton("Medium");
    public JButton hard = new JButton("Hard");
    private JTextField input = new JTextField("Default Name...", 10);
    private JLabel scoreLabel = new JLabel("Scores");
    private JTextArea scores = new JTextArea();
    private JLabel instructions = new JLabel("Instructions");
    private JTextArea instructionArea = new JTextArea();
    private JLabel enterName = new JLabel("Enter Your name: ");
    private JLabel easyL = new JLabel("Easy");
    private JLabel mediumL = new JLabel("Medium");
    private JLabel hardL = new JLabel("Hard");
    private JLabel enterL = new JLabel("Enter");
    
    
    mainJPanel(){
        setPreferredSize(new Dimension(800,600));
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.lightGray);
        
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        
        bottomPanel.setBackground(Color.lightGray);
        bottomPanel.setBackground(Color.lightGray);

       
        createTextArea();
        add(instructions);
        add(instructionArea);
        add(scoreLabel);
        add(scores);
        
//        buttonPanel.add(easyL);
        bottomPanel.add(easy);
//        buttonPanel.add(mediumL);
        bottomPanel.add(medium);
//        buttonPanel.add(hardL);
        bottomPanel.add(hard);
        bottomPanel.add(enterName);
        bottomPanel.add(input);

//        topPanel.add(namePanel);
        topPanel.add(bottomPanel);
        this.add(topPanel);

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
    public void easyGameMListener(MouseListener listener){
        easy.addMouseListener(listener);
    }
    public void mediumGameMListener(ActionListener listener){
        medium.addActionListener(listener);
    }
    public void hardGameMListener(ActionListener listener){
        hard.addActionListener(listener);
    }
   
    
    
}


