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
 class GameSidePanel extends JPanel implements Runnable{
    
    
    private final JButton nextWaveButton = new JButton("Next Wave");
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
    private JLabel eraseTitle = new JLabel("Eraser Cannon");
    private JLabel footballTitle = new JLabel("Paper FB");
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JPanel jPanel2 = new JPanel();
    private JPanel jPanel1 = new JPanel();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JTextArea jTextArea2 = new JTextArea();
    private JPanel jPanel3 = new JPanel();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JTextArea jTextArea3 = new JTextArea();
    private JPanel jPanel4 = new JPanel();
    private JPanel jPanel5 = new JPanel();
    private JScrollPane jScrollPane4 = new JScrollPane();
    private JTextArea jTextArea4 = new JTextArea();
    private JPanel jPanel6 = new JPanel();
    private JPanel jPanel7 = new JPanel();
//        nextWaveButton = newButton();
    private JTextArea jTextArea5 = new JTextArea();
    


        GameSidePanel(){

            initComponents();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

  

        
        



        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Player Stats"
                + "\nHealth:"
                + "\nMoney:"
                + "\nScore");
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        



        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Paper football stats. ");
        jTextArea2.setEditable(false);
        jScrollPane2.setViewportView(jTextArea2);
//      footballButton.setIcon(null);
//      Icon will replace text

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(footballTitle)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(footballButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(footballTitle)
                    .addComponent(footballButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerName)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerName)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        hwTitle.setText("HomeWork");

//        homeWorkButton.setIcon(null);
//        Icon will replace text

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("HomeWork tosser stats:"
                + "\nDamage:"
                + "\nRange:");
        jTextArea3.setEditable(false);
        jScrollPane3.setViewportView(jTextArea3);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hwTitle)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeWorkButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hwTitle)
                    .addComponent(homeWorkButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        eraseTitle.setText("Eraser Cannon");


//        eraserButton.setIcon(null);
//        Icon will replace text

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Eraser cannon stats");
        jTextArea4.setEditable(false);
        jScrollPane4.setViewportView(jTextArea4);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(eraseTitle)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eraserButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(eraseTitle)
                    .addComponent(eraserButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        hwTitle.setText("HomeWork");



        jTextArea5.setColumns(10);
        jTextArea5.setRows(5);
        jTextArea5.setText("HomeWork Tosser.");
        jTextArea5.setEditable(false);
//        jScrollPane5.setViewportView(jTextArea5);

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(hwTitle)
                            
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextWaveButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(hwTitle)
                    .addComponent(nextWaveButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea5)
                .addContainerGap())
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     









                 

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}