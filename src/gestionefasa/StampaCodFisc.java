/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import controlli.Controlli;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Fabio
 */
public class StampaCodFisc extends javax.swing.JFrame {

    private static ArrayList vetPersonale;
    private static ArrayList vetBanca;
    private static Personale p;
    private static int i;
    private static File users= new File("personale.dat");
    private static File banca= new File("banca.dat");
    
    public StampaCodFisc() {
        initComponents();
    }
    public StampaCodFisc(ArrayList vetPersonale, ArrayList vetBanca) {
        initComponents();
        this.vetPersonale = vetPersonale;
        this.vetBanca=vetBanca;
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jjlabel12 = new javax.swing.JLabel();
        via = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        specializzazione = new javax.swing.JTextField();
        sesso = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        codfisc = new javax.swing.JTextField();
        cognome = new javax.swing.JTextField();
        residenza = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ncivico = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        InsCodFisc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cerca = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Licenzia = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Inserisci codice fiscale : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cognome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Codice Fiscale:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sesso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Data di Nascita:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Residenza:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Via:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("N. civico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jjlabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jjlabel12.setText("Fid:");
        jPanel1.add(jjlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        via.setEditable(false);
        via.setBackground(new java.awt.Color(255, 255, 255));
        via.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        via.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(via, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 184, -1));

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(255, 255, 255));
        fid.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        fid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 184, -1));

        specializzazione.setEditable(false);
        specializzazione.setBackground(new java.awt.Color(255, 255, 255));
        specializzazione.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        specializzazione.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(specializzazione, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 184, -1));

        sesso.setEditable(false);
        sesso.setBackground(new java.awt.Color(255, 255, 255));
        sesso.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        sesso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(sesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 184, -1));

        data.setEditable(false);
        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 184, -1));

        codfisc.setEditable(false);
        codfisc.setBackground(new java.awt.Color(255, 255, 255));
        codfisc.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        codfisc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(codfisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 184, -1));

        cognome.setEditable(false);
        cognome.setBackground(new java.awt.Color(255, 255, 255));
        cognome.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cognome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(cognome, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 184, -1));

        residenza.setEditable(false);
        residenza.setBackground(new java.awt.Color(255, 255, 255));
        residenza.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        residenza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(residenza, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 184, -1));

        nome.setEditable(false);
        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 184, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionefasa/avatar.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 195, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Specializzazione:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        ncivico.setEditable(false);
        ncivico.setBackground(new java.awt.Color(255, 255, 255));
        ncivico.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ncivico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(ncivico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 184, -1));

        home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(0, 153, 204));
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 70, 30));

        InsCodFisc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(InsCodFisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ricerca tramite Codice Fiscale");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        cerca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerca.setForeground(new java.awt.Color(255, 0, 0));
        cerca.setText("Cerca");
        cerca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaActionPerformed(evt);
            }
        });
        jPanel1.add(cerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("PERSONALE FASA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        Licenzia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Licenzia.setForeground(new java.awt.Color(0, 153, 204));
        Licenzia.setText("Licenzia");
        Licenzia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Licenzia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicenziaActionPerformed(evt);
            }
        });
        jPanel1.add(Licenzia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Password : ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 184, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        GestionePersonale g = new GestionePersonale();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void cercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaActionPerformed
        String cf;
        int l;
        boolean trovato=false;
        boolean vuoto=false;
        l = vetPersonale.size();
        cf = convCodFisc();
        if(Controlli.controllacodice(cf)){
            vuoto=true;
        }
        if(!vuoto){
            for(i=0; i<l && !trovato;i++){
                p= (Personale) vetPersonale.get(i);
                if(cf.equals(p.codfisc)){
                    nome.setText(p.nome);
                    cognome.setText(p.cognome);
                    codfisc.setText(p.codfisc);
                    data.setText(p.data);
                    sesso.setText(p.s);
                    residenza.setText(p.residenza);
                    via.setText(p.via);
                    ncivico.setText(p.numerocivico);
                    specializzazione.setText(p.special);
                    fid.setText(p.FId);
                    password.setText(p.pass);
                    trovato=true;
                }
            }
        }
        i=i-1;
        if(!trovato){
            JOptionPane.showMessageDialog(this, "Utente non trovato", "Attenzione", JOptionPane.WARNING_MESSAGE);
            nome.setText("");
            cognome.setText("");
            codfisc.setText("");
            data.setText("");
            sesso.setText("");
            residenza.setText("");
            via.setText("");
            ncivico.setText("");
            specializzazione.setText("");
            fid.setText("");
            password.setText("");
        }
        InsCodFisc.setText("");
    }//GEN-LAST:event_cercaActionPerformed

    private void LicenziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicenziaActionPerformed
        vetPersonale.remove(i);
        vetBanca.remove(i);
        nome.setText("");
        cognome.setText("");
        codfisc.setText("");
        data.setText("");
        sesso.setText("");
        residenza.setText("");
        via.setText("");
        ncivico.setText("");
        specializzazione.setText("");
        fid.setText("");
        password.setText("");
        InsCodFisc.setText("");
    }//GEN-LAST:event_LicenziaActionPerformed

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
    
    public String convCodFisc(){
        String cf = InsCodFisc.getText().toUpperCase();
        return cf;

     }
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
            java.util.logging.Logger.getLogger(StampaCodFisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StampaCodFisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StampaCodFisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StampaCodFisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StampaCodFisc(vetPersonale, vetBanca).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InsCodFisc;
    private javax.swing.JButton Licenzia;
    private javax.swing.JButton cerca;
    private javax.swing.JTextField codfisc;
    private javax.swing.JTextField cognome;
    private javax.swing.JTextField data;
    private javax.swing.JTextField fid;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jjlabel12;
    private javax.swing.JTextField ncivico;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField password;
    private javax.swing.JTextField residenza;
    private javax.swing.JTextField sesso;
    private javax.swing.JTextField specializzazione;
    private javax.swing.JTextField via;
    // End of variables declaration//GEN-END:variables
}
