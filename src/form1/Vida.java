/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form1;

import javax.swing.JOptionPane;

/**
 *
 * @author CBN
 */
public class Vida extends javax.swing.JFrame {

    /**
     * Creates new form Vida
     */
    public Vida() {
        initComponents();
    }
    Form1 A1 = new Form1();
    boolean siFumador=false,siAlcoholico=false,siDrogadicto=false,siCardiaco=false;
    long ValorBase=0;
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        grFumador = new javax.swing.ButtonGroup();
        grAlcoholico = new javax.swing.ButtonGroup();
        grDrogadicto = new javax.swing.ButtonGroup();
        grCardiaco = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtValorBase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        siAlcoholicoB = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        siFumadorB = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        siDrogadictoB = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        siCardiacoB = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        aceptotermino = new javax.swing.JCheckBox();
        btcalcular = new javax.swing.JToggleButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jLabel1.setText("Ingrese el valor base");

        jLabel2.setText("¿ES usted Alcoholico?");

        grAlcoholico.add(siAlcoholicoB);
        siAlcoholicoB.setText("Si");

        grFumador.add(jRadioButton2);
        jRadioButton2.setText("No");

        jLabel3.setText("¿ES usted fumador activo?");

        grFumador.add(siFumadorB);
        siFumadorB.setText("Si");
        siFumadorB.setName("rbFumadorSi"); // NOI18N
        siFumadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siFumadorBActionPerformed(evt);
            }
        });

        grDrogadicto.add(jRadioButton4);
        jRadioButton4.setText("No");

        jLabel4.setText("¿Tiene antecedentes cardiacos?");

        grDrogadicto.add(siDrogadictoB);
        siDrogadictoB.setText("Si");

        grAlcoholico.add(jRadioButton6);
        jRadioButton6.setText("No");

        jLabel5.setText("¿Consume sustancias alucinogenas?");

        grCardiaco.add(siCardiacoB);
        siCardiacoB.setText("Si");
        siCardiacoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siCardiacoBActionPerformed(evt);
            }
        });

        grCardiaco.add(jRadioButton8);
        jRadioButton8.setText("No");

        aceptotermino.setText("Acepto los terminos y Condiciones");
        aceptotermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptoterminoActionPerformed(evt);
            }
        });

        btcalcular.setText("Calcular seguro de vida");
        btcalcular.setEnabled(false);
        btcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(siFumadorB))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(siAlcoholicoB)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siDrogadictoB)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jRadioButton2)
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton6)
                        .addGap(168, 168, 168)
                        .addComponent(jRadioButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(siCardiacoB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jRadioButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(aceptotermino, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(siFumadorB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(siAlcoholicoB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(siDrogadictoB))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton6))))
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(siCardiacoB)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton8)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(aceptotermino))
                    .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siFumadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siFumadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siFumadorBActionPerformed

    private void siCardiacoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siCardiacoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siCardiacoBActionPerformed

    private void aceptoterminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptoterminoActionPerformed
        // TODO add your handling code here:
        if(aceptotermino.isSelected()){
            btcalcular.setEnabled(true);
        }else{
            btcalcular.setEnabled(false);
        }
    }//GEN-LAST:event_aceptoterminoActionPerformed

    private void btcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularActionPerformed
        // TODO add your handling code here:
        try {
           Calcular(); 
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Faltan datos por completar","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btcalcularActionPerformed
    private void Calcular(){
        ValorBase = Long.parseLong(txtValorBase.getText());
        if(siFumadorB.isSelected()){
            siFumador=true;
        }else{
            siFumador=false;
        }
        if(siAlcoholicoB.isSelected()){
            siAlcoholico=true;
        }else{
            siAlcoholico=false;
        }
        if(siDrogadictoB.isSelected()){
            siDrogadicto=true;
        }else{
            siDrogadicto=false;
        }
        if(siCardiacoB.isSelected()){
           siCardiaco=true; 
        }else{
            siCardiaco=false;
        }
         Resultado A2 = new Resultado(Long.toString(A1.Calcular(ValorBase, siFumador, siAlcoholico, siDrogadicto, siCardiaco)));
         A2.setVisible(true);
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
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aceptotermino;
    private javax.swing.JToggleButton btcalcular;
    private javax.swing.ButtonGroup grAlcoholico;
    private javax.swing.ButtonGroup grCardiaco;
    private javax.swing.ButtonGroup grDrogadicto;
    private javax.swing.ButtonGroup grFumador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton siAlcoholicoB;
    private javax.swing.JRadioButton siCardiacoB;
    private javax.swing.JRadioButton siDrogadictoB;
    private javax.swing.JRadioButton siFumadorB;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
