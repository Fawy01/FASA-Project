/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Login extends javax.swing.JFrame {

    private static ArrayList vetPersonale;
    private static ArrayList vetBanca;
    private static int i;
    private static Personale p=null;
    private static boolean ac;
    private static File users= new File("personale.dat");
    private static File banca= new File("banca.dat");
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    public Login(ArrayList vetPersonale, ArrayList vetBanca, int i, boolean ac) {
        this.vetPersonale = vetPersonale;
        this.vetBanca = vetBanca;
        this.i=i;
        this.ac = ac;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MostraPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        conferma = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostraPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionefasa/eye.png"))); // NOI18N
        MostraPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostraPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MostraPassMouseReleased(evt);
            }
        });
        jPanel1.add(MostraPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 40, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 40, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        txt_user.setBorder(null);
        txt_user.setPreferredSize(new java.awt.Dimension(127, 22));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 90, 130, 20));

        conferma.setBackground(new java.awt.Color(255, 255, 255));
        conferma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conferma.setText("Login");
        conferma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        conferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaActionPerformed(evt);
            }
        });
        jPanel1.add(conferma, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 70, 30));

        indietro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        indietro.setText("Back");
        indietro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        jPanel1.add(indietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 60, 20));

        txt_password.setBorder(null);
        txt_password.setPreferredSize(new java.awt.Dimension(127, 22));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 150, 130, 20));

        jLabel4.setBackground(new java.awt.Color(26, 26, 26));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionefasa/image41.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(610, 341));
        jLabel4.setMinimumSize(new java.awt.Dimension(610, 341));
        jLabel4.setPreferredSize(new java.awt.Dimension(610, 341));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaActionPerformed
        String us, pass;
        boolean controllo = true;
        boolean trovato=false;
        us = "admin";
        pass = "admin";
        for(i=0; i<vetPersonale.size() && !trovato; i++){
            p=(Personale) vetPersonale.get(i);
            if((txt_user.getText().equals(p.FId)) && (txt_password.getText().equals(p.pass))){
                trovato=true;
            }else{
                p=null;
            }
        }
        i=i-1;
        if(p==null){
            i=-1;
            if (!((us.equals(txt_user.getText())) && (pass.equals(txt_password.getText())))) {
                controllo = false;
            }
        }
        if (txt_user.getText().isEmpty() || txt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mancano alcune informazioni", "Errore", JOptionPane.ERROR_MESSAGE);
            controllo = false;
        }
        if (controllo) {
            ac=true;
            Menu m = new Menu(vetPersonale, vetBanca, i,ac);
            m.setVisible(true);
            this.dispose();
        } else {
            txt_user.setText(null);
            txt_password.setText(null);
        }
    }//GEN-LAST:event_confermaActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        ac=false;
        Menu m = new Menu(vetPersonale, vetBanca,i,ac);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_indietroActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void MostraPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostraPassMousePressed
        txt_password.setEchoChar((char)0);
    }//GEN-LAST:event_MostraPassMousePressed

    private void MostraPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostraPassMouseReleased
        txt_password.setEchoChar('*');
    }//GEN-LAST:event_MostraPassMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int d;
        int l=vetPersonale.size();
        if(users.exists() && banca.exists()){
            users.delete();
            banca.delete();
        }
        try{
            FileOutputStream f = new FileOutputStream("personale.dat");
            ObjectOutputStream o = new ObjectOutputStream(f);
            FileOutputStream b = new FileOutputStream("banca.dat");
            ObjectOutputStream a = new ObjectOutputStream(b);
            for(d=0; d<l; d++){
               o.writeObject((Personale)vetPersonale.get(d));
               o.flush();
               a.writeObject((Banca)vetBanca.get(d));
               a.flush();
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Errore"+e.getMessage(), "Errore scrittura file", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(vetPersonale,vetBanca,i,ac).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostraPass;
    private javax.swing.JButton conferma;
    private javax.swing.JButton indietro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
