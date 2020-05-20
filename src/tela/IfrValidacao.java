package tela;

import util.ComboItem;
import util.CombosDAO;
import util.Formatacao;
import util.Validacao;
import java.awt.Color;

public class IfrValidacao extends javax.swing.JInternalFrame {

    public IfrValidacao() {
        initComponents();

        // aplica mascaras
        Formatacao.formatarData(tffData);
        Formatacao.formatarCpf(tffCPF);

        // popula Combo
        new CombosDAO().popularCombo("apresentacao", cmbApresentacao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tffData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        tffCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbApresentacao = new javax.swing.JComboBox<>();
        btnValidarData = new javax.swing.JButton();
        btnValidarCPF = new javax.swing.JButton();
        lblStatusData = new javax.swing.JLabel();
        lblStatusCPF = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdValorCombo = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfdIdComboItem = new javax.swing.JTextField();

        setTitle("Exemplo: Validação, Formatação e ComboBox");

        jLabel1.setText("Data");

        jLabel2.setText("CPF");

        jLabel3.setText("Combo");

        cmbApresentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnValidarData.setText("Validar");
        btnValidarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarDataActionPerformed(evt);
            }
        });

        btnValidarCPF.setText("Validar");
        btnValidarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarCPFActionPerformed(evt);
            }
        });

        lblStatusData.setText("Status data...");

        lblStatusCPF.setText("Status CPF...");

        jButton3.setText("Capturar valor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor Combo");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel4.setText("Id Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCPF)
                    .addComponent(cmbApresentacao, 0, 174, Short.MAX_VALUE)
                    .addComponent(tfdValorCombo)
                    .addComponent(tfdIdComboItem))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnValidarData)
                            .addComponent(btnValidarCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusCPF)
                            .addComponent(lblStatusData))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnValidarData)
                                .addComponent(lblStatusData)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValidarCPF)
                            .addComponent(lblStatusCPF)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfdValorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdIdComboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnValidarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarDataActionPerformed
        if (tffData.getText().trim().length() == 10) {
            if (Validacao.validarDataFormatada(tffData.getText())) {
                lblStatusData.setText("Data Ok");
                lblStatusData.setForeground(Color.BLUE);
            } else {
                lblStatusData.setText("Erro na data");
                lblStatusData.setForeground(Color.RED);
            }
        } else {
            lblStatusData.setText("Preencha adequadamente");
        }
    }//GEN-LAST:event_btnValidarDataActionPerformed

    private void btnValidarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarCPFActionPerformed
        if (tffCPF.getText().trim().length() == 14) {
            if (Validacao.validarCPF(Formatacao.removerFormatacao(tffCPF.getText()))) {
                lblStatusCPF.setText("CPF OK");
                lblStatusCPF.setForeground(Color.BLUE);
            } else {
                lblStatusCPF.setText("CPF Inválido");
                lblStatusCPF.setForeground(Color.RED);
            }
        } else {
            lblStatusCPF.setText("Preencha adequadamente");
        }
    }//GEN-LAST:event_btnValidarCPFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // captura item selecionado na combo e converte para um obj ComboItem
        ComboItem ci = (ComboItem) cmbApresentacao.getSelectedItem();

        // consulta descficao do obj e atribui valor ao TextField
        tfdValorCombo.setText(ci.getDescricao());
        tfdIdComboItem.setText(String.valueOf(ci.getCodigo()));
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnValidarCPF;
    private javax.swing.JButton btnValidarData;
    private javax.swing.JComboBox<String> cmbApresentacao;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblStatusCPF;
    private javax.swing.JLabel lblStatusData;
    private javax.swing.JTextField tfdIdComboItem;
    private javax.swing.JTextField tfdValorCombo;
    private javax.swing.JFormattedTextField tffCPF;
    private javax.swing.JFormattedTextField tffData;
    // End of variables declaration//GEN-END:variables
}
