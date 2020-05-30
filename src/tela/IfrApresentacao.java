package tela;

import dao.ApresentacaoDAO;
import entidade.Apresentacao;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;

public class IfrApresentacao extends javax.swing.JInternalFrame {

    int id = 0;

    public IfrApresentacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jpnAtualizacoes = new javax.swing.JPanel();
        PainelDeRolagem = new javax.swing.JScrollPane();
        tblResumo = new javax.swing.JTable();
        lblBusca = new javax.swing.JLabel();
        tfBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblUltimasAtualizacoes = new javax.swing.JLabel();
        tfSaldo = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        tbbAcessoRapido = new javax.swing.JTabbedPane();
        jpnRegistrar = new javax.swing.JPanel();
        btnRegExer = new javax.swing.JButton();
        btnRegAli = new javax.swing.JButton();
        btnRegCom = new javax.swing.JButton();
        jpnCadastrar = new javax.swing.JPanel();
        btnNewAlimento = new javax.swing.JToggleButton();
        btnNewExercicio = new javax.swing.JToggleButton();
        btnNewReacao = new javax.swing.JToggleButton();
        jpnGrafico = new javax.swing.JPanel();
        lblConsumo = new javax.swing.JLabel();
        lblGasto = new javax.swing.JLabel();
        tfGasto = new javax.swing.JTextField();
        tfConsumo = new javax.swing.JTextField();
        lblMensagem = new javax.swing.JLabel();
        tbbRelatorios = new javax.swing.JTabbedPane();
        jpnRelatorios = new javax.swing.JPanel();

        setTitle("Cadastro: Apresentação");
        setToolTipText("");

        btnFechar.setText("Fechar");
        btnFechar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jpnAtualizacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblResumo.setModel(new javax.swing.table.DefaultTableModel(
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
        PainelDeRolagem.setViewportView(tblResumo);

        lblBusca.setText("Busca:");

        tfBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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

        lblUltimasAtualizacoes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUltimasAtualizacoes.setText("Últimas Atualizações");

        tfSaldo.setEditable(false);
        tfSaldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        lblSaldo.setText("Saldo:");

        javax.swing.GroupLayout jpnAtualizacoesLayout = new javax.swing.GroupLayout(jpnAtualizacoes);
        jpnAtualizacoes.setLayout(jpnAtualizacoesLayout);
        jpnAtualizacoesLayout.setHorizontalGroup(
            jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblUltimasAtualizacoes)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PainelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                            .addComponent(lblBusca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                            .addComponent(lblSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpnAtualizacoesLayout.setVerticalGroup(
            jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAtualizacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUltimasAtualizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnRegExer.setText("Exercicio");
        btnRegExer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegExer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegExerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegExerMouseExited(evt);
            }
        });
        btnRegExer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegExerActionPerformed(evt);
            }
        });

        btnRegAli.setText("Alimentação");
        btnRegAli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAliActionPerformed(evt);
            }
        });

        btnRegCom.setText("Compra");
        btnRegCom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRegistrarLayout = new javax.swing.GroupLayout(jpnRegistrar);
        jpnRegistrar.setLayout(jpnRegistrarLayout);
        jpnRegistrarLayout.setHorizontalGroup(
            jpnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegistrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegAli, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnRegExer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jpnRegistrarLayout.setVerticalGroup(
            jpnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegExer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegCom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        tbbAcessoRapido.addTab("Registrar", jpnRegistrar);

        btnNewAlimento.setText("Novo Alimento");
        btnNewAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAlimentoActionPerformed(evt);
            }
        });

        btnNewExercicio.setText("Novo Exercício");
        btnNewExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewExercicioActionPerformed(evt);
            }
        });

        btnNewReacao.setText("Nova Reação Corporal");
        btnNewReacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnCadastrarLayout = new javax.swing.GroupLayout(jpnCadastrar);
        jpnCadastrar.setLayout(jpnCadastrarLayout);
        jpnCadastrarLayout.setHorizontalGroup(
            jpnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewReacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jpnCadastrarLayout.setVerticalGroup(
            jpnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnNewAlimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewExercicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewReacao)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbbAcessoRapido.addTab("Cadastrar", jpnCadastrar);

        jpnGrafico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblConsumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblConsumo.setForeground(new java.awt.Color(204, 0, 0));
        lblConsumo.setText("Consumo (Alimento)");

        lblGasto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGasto.setForeground(new java.awt.Color(51, 153, 0));
        lblGasto.setText("Gasto (Exercícios)");

        tfGasto.setBackground(new java.awt.Color(0, 153, 0));
        tfGasto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfGasto.setForeground(new java.awt.Color(204, 0, 0));
        tfGasto.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        tfConsumo.setBackground(new java.awt.Color(255, 0, 0));
        tfConsumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfConsumo.setForeground(new java.awt.Color(0, 153, 0));

        lblMensagem.setText("Mensagem");
        lblMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnGraficoLayout = new javax.swing.GroupLayout(jpnGrafico);
        jpnGrafico.setLayout(jpnGraficoLayout);
        jpnGraficoLayout.setHorizontalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGraficoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGraficoLayout.createSequentialGroup()
                        .addComponent(lblConsumo)
                        .addGap(18, 18, 18)))
                .addGap(8, 8, 8)
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnGraficoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblGasto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGraficoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnGraficoLayout.setVerticalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGraficoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsumo)
                    .addComponent(lblGasto))
                .addGap(28, 28, 28)
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jpnRelatorios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnRelatoriosLayout = new javax.swing.GroupLayout(jpnRelatorios);
        jpnRelatorios.setLayout(jpnRelatoriosLayout);
        jpnRelatoriosLayout.setHorizontalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        jpnRelatoriosLayout.setVerticalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        tbbRelatorios.addTab("Relatório Consumo/Gasto", jpnRelatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbbAcessoRapido)
                        .addGap(36, 36, 36)
                        .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jpnAtualizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbbAcessoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnAtualizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            ApresentacaoDAO apDAO = new ApresentacaoDAO();

            if (apDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                apDAO.popularTabela(tblResumo, tfBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ApresentacaoDAO apDAO = new ApresentacaoDAO();

        Apresentacao apresentacao = apDAO.consultar(id);

        if (apresentacao != null) {
            // define os valores do obj nos campos da tela
            //tfdId.setText(String.valueOf(apresentacao.getId()));
            //tfdDescricao.setText(apresentacao.getDescricao());

            // mudar de aba
            tbbRelatorios.setSelectedIndex(0);

            // definir o foco
            //tfdDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new ApresentacaoDAO().popularTabela(tblResumo, tfBusca.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnRegExerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegExerMouseExited
        btnRegExer.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnRegExerMouseExited

    private void btnRegExerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegExerMouseEntered
        btnRegExer.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED, Color.lightGray, Color.lightGray), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
    }//GEN-LAST:event_btnRegExerMouseEntered

    private void btnRegExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegExerActionPerformed

        IfrExercicio regexer = new IfrExercicio();
        //FrmJanelaPrincipal.class..add(regexer);
    }//GEN-LAST:event_btnRegExerActionPerformed

    private void btnRegAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAliActionPerformed
        IfrAlimento regali = new IfrAlimento();
        regali.setVisible(true);
    }//GEN-LAST:event_btnRegAliActionPerformed

    private void btnRegComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegComActionPerformed
        IfrCompra regcom = new IfrCompra();
        regcom.setVisible(true);
    }//GEN-LAST:event_btnRegComActionPerformed

    private void btnNewAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewAlimentoActionPerformed

    private void btnNewExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewExercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewExercicioActionPerformed

    private void btnNewReacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewReacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelDeRolagem;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JToggleButton btnNewAlimento;
    private javax.swing.JToggleButton btnNewExercicio;
    private javax.swing.JToggleButton btnNewReacao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegAli;
    private javax.swing.JButton btnRegCom;
    private javax.swing.JButton btnRegExer;
    private javax.swing.JPanel jpnAtualizacoes;
    private javax.swing.JPanel jpnCadastrar;
    private javax.swing.JPanel jpnGrafico;
    private javax.swing.JPanel jpnRegistrar;
    private javax.swing.JPanel jpnRelatorios;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblUltimasAtualizacoes;
    private javax.swing.JTabbedPane tbbAcessoRapido;
    private javax.swing.JTabbedPane tbbRelatorios;
    private javax.swing.JTable tblResumo;
    private javax.swing.JTextField tfBusca;
    private javax.swing.JTextField tfConsumo;
    private javax.swing.JTextField tfGasto;
    private javax.swing.JTextField tfSaldo;
    // End of variables declaration//GEN-END:variables
}
