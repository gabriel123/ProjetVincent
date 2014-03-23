/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2l_impot;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DeuxiemeFenetreLucrative extends javax.swing.JPanel {

    private ImpotEngine engine;

    /**
     * Creates new form DeuxiemeFenetre
     */
    public DeuxiemeFenetreLucrative() {
        initComponents();
    }

    public DeuxiemeFenetreLucrative(ImpotEngine engine) {
        this.engine = engine;
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
        jLabel1 = new javax.swing.JLabel();
        chiffreAffaireTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        beneficeTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();

        jLabel1.setText("Quel a été votre chiffre d'affaire ?");
        jLabel1.setName("question1"); // NOI18N

        chiffreAffaireTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiffreAffaireTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Quels ont été vos bénéfices ?");

        beneficeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beneficeTextFieldActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chiffreAffaireTextField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beneficeTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(okButton)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chiffreAffaireTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(beneficeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(okButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chiffreAffaireTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiffreAffaireTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chiffreAffaireTextFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            double chiffreAffaire = Double.parseDouble(chiffreAffaireTextField.getText());
            // On récupère l'association de l'impotEngine.
            // Sauf que cet association est une interface Association et non la classe AssociationLucrative
            // Du coup, il faut "caster" Association en AssociationLucrative
            ((AssociationLucrative) engine.getAssociation()).setChiffreAffaires(chiffreAffaire);

            double benefice = Double.parseDouble(beneficeTextField.getText());
            // On récupère l'association de l'impotEngine.
            // Sauf que cet association est une interface Association et non la classe AssociationLucrative
            // Du coup, il faut "caster" Association en AssociationLucrative
            ((AssociationLucrative) engine.getAssociation()).setBenefices(benefice);

            Impot impot = new Impot();
            impot.setImpot(engine.getAssociation().getImpot());
            engine.getConnexion().addImpotToDb(impot);
            JOptionPane.showMessageDialog(null, "Impots à payer : " + engine.getAssociation().getImpot() + " €");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrez un nombre valide");
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void beneficeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beneficeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beneficeTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beneficeTextField;
    private javax.swing.JTextField chiffreAffaireTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    void setEngine(ImpotEngine engine) {
        this.engine = engine;
    }
}
