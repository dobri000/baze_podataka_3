/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forms.radniNalog.detaljno;

import database.DBBRadniNalog;
import domain.RadniNalogDetaljno;
import forms.radniNalog.RadniNalogForma;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author dobri
 */
public class AzurirajRadniNalogDetaljnoForma extends javax.swing.JDialog {

    private RadniNalogDetaljno nalog;
    /**
     * Creates new form AzurirajRadniNalogDetaljnoForma
     */
    public AzurirajRadniNalogDetaljnoForma(java.awt.Dialog parent, boolean modal, RadniNalogDetaljno nalog) {
        super(parent, modal);
        initComponents();
        this.nalog = nalog;
        initFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtGrad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBrojRadnogNaloga = new javax.swing.JTextField();
        txtRokZaRealizaciju = new javax.swing.JTextField();
        txtOpisSistema = new javax.swing.JTextField();
        txtObavljenRad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDatumObavljanjaKontrole = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSifraKontakta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("opisSistema:");

        jLabel4.setText("obavljenRad:");

        jButton1.setText("Azuriraj RadniNalogDetaljno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("datumObavljanjaKontrole:");

        jLabel6.setText("sifraKontakta:");

        jLabel7.setText("grad:");

        txtBrojRadnogNaloga.setEnabled(false);

        jLabel1.setText("brojRadnogNaloga:");

        jLabel2.setText("rokZaRealizaciju:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBrojRadnogNaloga)
                            .addComponent(txtRokZaRealizaciju, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtOpisSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtObavljenRad, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtDatumObavljanjaKontrole, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtSifraKontakta, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtGrad, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBrojRadnogNaloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRokZaRealizaciju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOpisSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtObavljenRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDatumObavljanjaKontrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSifraKontakta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LocalDate rokZaRealizaciju = LocalDate.parse(txtRokZaRealizaciju.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String opisSistema = txtOpisSistema.getText();
        String obavljenRad = txtObavljenRad.getText();
        LocalDate datumObavljanjaKontrole = LocalDate.parse(txtDatumObavljanjaKontrole.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int sifraKontakta = Integer.parseInt(txtSifraKontakta.getText());
        int sifraGrada = Integer.parseInt(txtGrad.getText());
        nalog.setDatumObavljanjaKontrole(datumObavljanjaKontrole);
        nalog.setRokZaRealizaciju(rokZaRealizaciju);
        nalog.setOpisSistema(opisSistema);
        nalog.setObavljenRad(obavljenRad);
        nalog.setSifraKontakta(sifraKontakta);
        nalog.setSifraGrada(sifraGrada);
        try {
            DBBRadniNalog.azurirajRadniNalogDetaljno(nalog);
            RadniNalogForma forma = (RadniNalogForma) getParent();
            forma.initTables();
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void initFields() {
        txtBrojRadnogNaloga.setText(String.valueOf(nalog.getBrojRadnogNaloga()));
        txtRokZaRealizaciju.setText(nalog.getRokZaRealizaciju().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtOpisSistema.setText(nalog.getOpisSistema());
        txtObavljenRad.setText(nalog.getObavljenRad());
        txtDatumObavljanjaKontrole.setText(nalog.getDatumObavljanjaKontrole().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        txtSifraKontakta.setText(String.valueOf(nalog.getSifraKontakta()));
        txtGrad.setText(String.valueOf(nalog.getSifraGrada()));
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBrojRadnogNaloga;
    private javax.swing.JTextField txtDatumObavljanjaKontrole;
    private javax.swing.JTextField txtGrad;
    private javax.swing.JTextField txtObavljenRad;
    private javax.swing.JTextField txtOpisSistema;
    private javax.swing.JTextField txtRokZaRealizaciju;
    private javax.swing.JTextField txtSifraKontakta;
    // End of variables declaration//GEN-END:variables
}
