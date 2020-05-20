package tela;

import dao.CompraDAO;
import entidade.Compra;
import java.awt.Color;
import javax.swing.JOptionPane;
import util.Validacao;

public class IfrRegCompra extends javax.swing.JInternalFrame {

    int id = 0;
    Validacao v = new Validacao();
    public IfrRegCompra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbCompra = new javax.swing.JTabbedPane();
        Painel = new javax.swing.JPanel();
        lblCompraDeAlimento = new javax.swing.JLabel();
        tfAlimentoComprado = new javax.swing.JTextField();
        lblPesquisaAlimento = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        tfQuantidade = new javax.swing.JTextField();
        tffData = new javax.swing.JFormattedTextField();
        tffData1 = new javax.swing.JFormattedTextField();
        tffData2 = new javax.swing.JFormattedTextField();
        tfQuantidade1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCompraDeAlimento1 = new javax.swing.JLabel();
        jpnAtualizacoes2 = new javax.swing.JPanel();
        PainelDeRolagem2 = new javax.swing.JScrollPane();
        tblResumo2 = new javax.swing.JTable();
        lblBusca2 = new javax.swing.JLabel();
        tfBusca2 = new javax.swing.JTextField();
        btnPesquisar2 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Compra");

        Painel.setBackground(new java.awt.Color(255, 255, 255));

        lblCompraDeAlimento.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblCompraDeAlimento.setText("Compra de Alimento");

        tfAlimentoComprado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qual alimento você comprou?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        lblPesquisaAlimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesquisaAlimento.setText("ver");
        lblPesquisaAlimento.setBorder(new javax.swing.border.MatteBorder(null));

        tfValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quanto custou ao todo?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        jToggleButton1.setText("Salvar");

        jToggleButton2.setText("Fechar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        tfQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Unitário*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffData.setText(" ");
        tffData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffDataFocusLost(evt);
            }
        });
        tffData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffDataKeyTyped(evt);
            }
        });

        tffData1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigo*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffData1.setText(" ");
        tffData1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffData1FocusLost(evt);
            }
        });
        tffData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffData1KeyTyped(evt);
            }
        });

        tffData2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horário*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffData2.setText(" ");
        tffData2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffData2FocusLost(evt);
            }
        });
        tffData2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffData2KeyTyped(evt);
            }
        });

        tfQuantidade1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblCompraDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(tffData1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfAlimentoComprado)
                            .addComponent(tfValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelLayout.createSequentialGroup()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tffData, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(tfQuantidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                                        .addComponent(tffData2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))))
                        .addGap(8, 8, 8)
                        .addComponent(lblPesquisaAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompraDeAlimento)
                .addGap(27, 27, 27)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlimentoComprado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisaAlimento)
                    .addComponent(tffData1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffData2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap())
        );

        tbCompra.addTab("Registro", Painel);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCompraDeAlimento1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblCompraDeAlimento1.setText("Pesquisa de Compra");

        jpnAtualizacoes2.setBackground(new java.awt.Color(255, 255, 255));

        tblResumo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        PainelDeRolagem2.setViewportView(tblResumo2);

        lblBusca2.setText("Busca:");

        tfBusca2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        btnPesquisar2.setText("Pesquisar");
        btnPesquisar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar2ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAtualizacoes2Layout = new javax.swing.GroupLayout(jpnAtualizacoes2);
        jpnAtualizacoes2.setLayout(jpnAtualizacoes2Layout);
        jpnAtualizacoes2Layout.setHorizontalGroup(
            jpnAtualizacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeRolagem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jpnAtualizacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAtualizacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAtualizacoes2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnAtualizacoes2Layout.createSequentialGroup()
                        .addComponent(lblBusca2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBusca2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnAtualizacoes2Layout.setVerticalGroup(
            jpnAtualizacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAtualizacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAtualizacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBusca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDeRolagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jpnAtualizacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(lblCompraDeAlimento1)
                .addGap(63, 63, 63))
            .addComponent(jpnAtualizacoes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompraDeAlimento1)
                .addGap(5, 5, 5)
                .addComponent(jpnAtualizacoes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbCompra.addTab("Pesquisa", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbCompra)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbCompra, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar2ActionPerformed
        new CompraDAO().popularTabela(tblResumo2, tfBusca2.getText());
    }//GEN-LAST:event_btnPesquisar2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idString = String.valueOf(tblResumo2.getValueAt(tblResumo2.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        CompraDAO apDAO = new CompraDAO();

        Compra apCom = apDAO.consultar(id);

        if (apCom != null) {
            // define os valores do obj nos campos da tela
            tfAlimentoComprado.setText(String.valueOf(apCom.alimento));
            tfValor.setText(apCom.valorTotal);
            tfQuantidade.setText(apCom.quantidade);

            // mudar de aba
            tbCompra.setSelectedIndex(0);

            // definir o foco
            tfAlimentoComprado.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumo2.getValueAt(tblResumo2.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            CompraDAO apDAO = new CompraDAO();

            if (apDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                apDAO.popularTabela(tblResumo2, tfBusca2.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void tffDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataFocusLost
        if (tffData.getText().trim().length() == 10) {
            if (v.validarDataFormatada(tffData.getText())) {
                tffData.setForeground(Color.BLUE);
                //limpaAviso();
            } else {
                tffData.setForeground(Color.RED);
                //avisoIncorreto("Data");
            }
        }
    }//GEN-LAST:event_tffDataFocusLost

    private void tffDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataKeyTyped
        //a.verificaNumeros(evt);
    }//GEN-LAST:event_tffDataKeyTyped

    private void tffData1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffData1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffData1FocusLost

    private void tffData1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffData1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tffData1KeyTyped

    private void tffData2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffData2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffData2FocusLost

    private void tffData2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffData2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tffData2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JScrollPane PainelDeRolagem2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel jpnAtualizacoes2;
    private javax.swing.JLabel lblBusca2;
    private javax.swing.JLabel lblCompraDeAlimento;
    private javax.swing.JLabel lblCompraDeAlimento1;
    private javax.swing.JLabel lblPesquisaAlimento;
    private javax.swing.JTabbedPane tbCompra;
    private javax.swing.JTable tblResumo2;
    private javax.swing.JTextField tfAlimentoComprado;
    private javax.swing.JTextField tfBusca2;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfQuantidade1;
    private javax.swing.JTextField tfValor;
    private javax.swing.JFormattedTextField tffData;
    private javax.swing.JFormattedTextField tffData1;
    private javax.swing.JFormattedTextField tffData2;
    // End of variables declaration//GEN-END:variables
}
