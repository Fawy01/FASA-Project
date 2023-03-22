/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class GestionePersonale extends javax.swing.JFrame {

    private static ArrayList vetPersonale;
    private static ArrayList vetBanca;
    private static File users= new File("personale.dat");
    private static File banca= new File("banca.dat");
    
    public GestionePersonale() {
        initComponents();
    }
    public GestionePersonale(ArrayList vetPersonale, ArrayList vetBanca) {
        this.vetPersonale = vetPersonale;
        this.vetBanca = vetBanca;
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
        assumiPer = new javax.swing.JButton();
        ricercaID = new javax.swing.JButton();
        ricercaChiave = new javax.swing.JButton();
        retribuzione = new javax.swing.JButton();
        stampa = new javax.swing.JButton();
        indietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        assumiPer.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        assumiPer.setText("ASSUMI PERSONALE");
        assumiPer.setBorder(null);
        assumiPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assumiPerActionPerformed(evt);
            }
        });

        ricercaID.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        ricercaID.setText("RICERCA TRAMITE COGNOME");
        ricercaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricercaIDActionPerformed(evt);
            }
        });

        ricercaChiave.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        ricercaChiave.setText("RICERCA CON CODICE FISCALE");
        ricercaChiave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricercaChiaveActionPerformed(evt);
            }
        });

        retribuzione.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        retribuzione.setText("RETRIBUZIONE PERSONALE");
        retribuzione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retribuzioneActionPerformed(evt);
            }
        });

        stampa.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        stampa.setText("PERSONALE ");
        stampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stampaActionPerformed(evt);
            }
        });

        indietro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        indietro.setText("Home");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(retribuzione, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ricercaID, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ricercaChiave, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(assumiPer, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(stampa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(indietro)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(assumiPer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stampa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retribuzione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(ricercaChiave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ricercaID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indietro))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ricercaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricercaIDActionPerformed
        StampaCognome f= new StampaCognome(vetPersonale, vetBanca);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ricercaIDActionPerformed

    private void assumiPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assumiPerActionPerformed
        AssumiPersonale a = new AssumiPersonale(vetPersonale, vetBanca);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assumiPerActionPerformed

    private void ricercaChiaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricercaChiaveActionPerformed
        StampaCodFisc c= new StampaCodFisc(vetPersonale, vetBanca);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ricercaChiaveActionPerformed

    private void retribuzioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retribuzioneActionPerformed
        GestioneRetribuzione gr = new GestioneRetribuzione(vetPersonale, vetBanca);
        gr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_retribuzioneActionPerformed

    private void stampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stampaActionPerformed
        Stampa s = new Stampa(vetPersonale, vetBanca);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stampaActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        Menu m= new Menu(vetPersonale, vetBanca);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_indietroActionPerformed

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
            java.util.logging.Logger.getLogger(GestionePersonale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionePersonale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionePersonale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionePersonale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionePersonale(vetPersonale,vetBanca).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assumiPer;
    private javax.swing.JButton indietro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retribuzione;
    private javax.swing.JButton ricercaChiave;
    private javax.swing.JButton ricercaID;
    private javax.swing.JButton stampa;
    // End of variables declaration//GEN-END:variables
}
