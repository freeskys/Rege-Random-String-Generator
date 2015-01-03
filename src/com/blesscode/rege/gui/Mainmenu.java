package com.blesscode.rege.gui;

import javax.swing.JOptionPane;

public class Mainmenu extends javax.swing.JFrame {

    public Mainmenu() {
        initComponents();
    }
    
    public String generate(int length) {
        String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                          "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                          "w", "x", "y", "z",
                          "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                          "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                          "W", "X", "Y", "Z"};
        String result = "";
        for (int i=0; i<length; i++) {
            int randomNumber = (int)(Math.random() * 51);
            System.out.println(randomNumber);
            result += words[randomNumber];
        }
        return result;
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        btnProcess = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        lblCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rege (Random String Generator) | v1.0");
        setResizable(false);

        lblLength.setText("Length:");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);

        lblCopyright.setText("Created by Harditya Rahmat Ramadhan on April 2012 | @freeskys");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLength)
                        .addGap(18, 18, 18)
                        .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtResult)
                    .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLength)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCopyright)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(423, 141));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        if (txtLength.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please input length.", "Alert",
                                          JOptionPane.ERROR_MESSAGE);
            txtLength.requestFocus();
        } else {
            try {
                int length = Integer.parseInt(txtLength.getText());
                txtResult.setText(generate(length));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please input length using number only.", 
                                              "Alert", JOptionPane.ERROR_MESSAGE);
                txtLength.requestFocus();
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblLength;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
