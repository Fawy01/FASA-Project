/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabio
 */
public class StampaCognome extends javax.swing.JFrame {

    private static ArrayList vetPersonale;
    private static ArrayList vetBanca;
    private static Personale p;
    private static int i;
    private static File users= new File("personale.dat");
    private static File banca= new File("banca.dat");
    private static boolean controllo = false;
        public StampaCognome() {
        initComponents();
    }
    public StampaCognome(ArrayList vetPersonale, ArrayList vetBanca) {
        initComponents();
        Licenzia.setVisible(false);
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
        jLabel10 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        InsCogn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cerca = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Licenzia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabella = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

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
        jLabel9.setText("Inserisci Cognome :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionefasa/avatar.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(0, 153, 204));
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 70, 30));

        InsCogn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        InsCogn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsCognMouseClicked(evt);
            }
        });
        InsCogn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsCognActionPerformed(evt);
            }
        });
        jPanel1.add(InsCogn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ricerca tramite Cognome");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        cerca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerca.setForeground(new java.awt.Color(255, 0, 0));
        cerca.setText("Cerca");
        cerca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaActionPerformed(evt);
            }
        });
        jPanel1.add(cerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("PERSONALE FASA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

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

        tabella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tabella.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cognome", "Nome", "Data di Nascita", "Codice Fiscale", "Sesso", "Residenza", "Via", "N. Civico", "Specializzazione", "Fid", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabella.setColumnSelectionAllowed(true);
        tabella.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabellaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabellaFocusLost(evt);
            }
        });
        tabella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabella);
        tabella.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 780, 400));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 280, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        GestionePersonale g = new GestionePersonale();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void cercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaActionPerformed
        cerca();
    }//GEN-LAST:event_cercaActionPerformed

    private void LicenziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicenziaActionPerformed
        //if(controllo){
            vetPersonale.remove(i);
            vetBanca.remove(i);
            cerca();
            Licenzia.setVisible(false);
        //}else{
            //JOptionPane.showMessageDialog(this, "Non hai selezionato nessun dipendente", "Errore", JOptionPane.ERROR_MESSAGE);
        //}
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

    private void tabellaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabellaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellaFocusGained

    private void tabellaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabellaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellaFocusLost

    private void tabellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaMouseClicked
        String cf;
        int l=vetPersonale.size();
        boolean trovato = false;
        int row= tabella.getSelectedRow();
        cf = (tabella.getValueAt(row, 3).toString());
        for(i=0; i<l && !trovato;i++){
                p= (Personale) vetPersonale.get(i);
                if(cf.equals(p.codfisc)){
                    trovato=true;
                    //controllo=true;
                }
            }
        Licenzia.setVisible(true);
        i=i-1;
    }//GEN-LAST:event_tabellaMouseClicked

    private void InsCognActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsCognActionPerformed

    }//GEN-LAST:event_InsCognActionPerformed

    private void InsCognMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsCognMouseClicked
        Licenzia.setVisible(false);
    }//GEN-LAST:event_InsCognMouseClicked
    public void cerca(){
        tabella.setModel(new DefaultTableModel(null, new String[]{"Cognome", "Nome", "Data di Nascita", "Codice Fiscale", "Sesso", "Residenza", "Via", "N. Civico", "Specializzazione", "Fid", "Password"}));
        int l=vetPersonale.size();
        String Cogn;
        boolean trovato=false;
        Cogn = InsCogn.getText();
        DefaultTableModel model=(DefaultTableModel) tabella.getModel();
        Object rowData[]=new Object[12];
        for(i=0; i<l;i++){
            p=(Personale) vetPersonale.get(i);
            if(Cogn.equals(p.cognome)){
                rowData[0]=p.cognome;
                rowData[1]=p.nome;
                rowData[2]=p.data;
                rowData[3]=p.codfisc;
                rowData[5] = p.s;
                rowData[6]=p.residenza;
                rowData[7]=p.via;
                rowData[8]=p.numerocivico;
                rowData[9]=p.special;
                rowData[10]=p.FId;
                rowData[11]=p.pass;
                model.addRow(rowData);
                trovato=true;
            }
        }
        if(!trovato){
            JOptionPane.showMessageDialog(this, "Utenti non trovati", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(StampaCognome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StampaCognome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StampaCognome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StampaCognome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StampaCognome(vetPersonale, vetBanca).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InsCogn;
    private javax.swing.JButton Licenzia;
    private javax.swing.JButton cerca;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabella;
    // End of variables declaration//GEN-END:variables
}
