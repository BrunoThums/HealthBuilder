package tela;

import dao.ReacaoCorporalDAO;
import entidade.ReacaoCorporal;
import io.github.wesauis.gastei.view.component.TableDataModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class IfrReacaoCorporal extends javax.swing.JInternalFrame {

    int id = 0;
    
    String filtro;

    public IfrReacaoCorporal() {
        filtro = "";
        initComponents();
        tblResumo.setModel(new TableDataModel<ReacaoCorporal>() {
            @Override
            public List<ReacaoCorporal> getData() {
                ArrayList<ReacaoCorporal> reacoes;
                if (!filtro.isEmpty()) {
                    reacoes = new ReacaoCorporalDAO().consultar(filtro);
                } else {
                    reacoes = new ReacaoCorporalDAO().consultarTodos();
                }
                if (reacoes == null) {
                    reacoes = new ArrayList<>();
                }
                return reacoes;
            }

            @Override
            public String[] getHeader() {
                return new String[]{"Código", "Nome"};
            }

            @Override
            public Object[] toTableRow(ReacaoCorporal t) {
                return new Object[]{t.id, t.nome};
            }
        });
    }

    public void update() {
        ((TableDataModel<ReacaoCorporal>) tblResumo.getModel()).update();
    }

    public ReacaoCorporal getValueAt(int row) {
        return ((TableDataModel<ReacaoCorporal>) tblResumo.getModel()).getValueAt(row);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPainel = new javax.swing.JTabbedPane();
        pnRegRC = new javax.swing.JPanel();
        lblTituloRegRC = new javax.swing.JLabel();
        btnSalvarRegRC = new javax.swing.JToggleButton();
        btnFecharRegRC = new javax.swing.JToggleButton();
        tfReacaoCorporal = new javax.swing.JTextField();
        pnPesqRC = new javax.swing.JPanel();
        lblTituloPesqRC = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        PainelDeRolagem = new javax.swing.JScrollPane();
        tblResumo = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblBusca = new javax.swing.JLabel();
        tfBusca = new javax.swing.JTextField();

        setTitle("Reação Corporal");

        tbPainel.setBackground(new java.awt.Color(255, 255, 255));

        pnRegRC.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloRegRC.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloRegRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegRC.setText("Registro de Reação Corporal");

        btnSalvarRegRC.setText("Salvar");
        btnSalvarRegRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarRegRCActionPerformed(evt);
            }
        });

        btnFecharRegRC.setText("Fechar");
        btnFecharRegRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharRegRCActionPerformed(evt);
            }
        });

        tfReacaoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Reação (ex: enjoo, dor corporal, enxaqueca)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        javax.swing.GroupLayout pnRegRCLayout = new javax.swing.GroupLayout(pnRegRC);
        pnRegRC.setLayout(pnRegRCLayout);
        pnRegRCLayout.setHorizontalGroup(
            pnRegRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegRCLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnRegRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegRCLayout.createSequentialGroup()
                        .addComponent(btnFecharRegRC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarRegRC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegRCLayout.createSequentialGroup()
                        .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(pnRegRCLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTituloRegRC, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnRegRCLayout.setVerticalGroup(
            pnRegRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegRCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRegRC)
                .addGap(41, 41, 41)
                .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(pnRegRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarRegRC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharRegRC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar", pnRegRC);

        pnPesqRC.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloPesqRC.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloPesqRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPesqRC.setText("Pesquisa de Reação Corporal");

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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
        tblResumo.setColumnSelectionAllowed(true);
        PainelDeRolagem.setViewportView(tblResumo);

        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblBusca.setText("Busca:");

        tfBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        javax.swing.GroupLayout pnPesqRCLayout = new javax.swing.GroupLayout(pnPesqRC);
        pnPesqRC.setLayout(pnPesqRCLayout);
        pnPesqRCLayout.setHorizontalGroup(
            pnPesqRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqRCLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTituloPesqRC, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqRCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPesqRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqRCLayout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPesqRCLayout.createSequentialGroup()
                        .addComponent(lblBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBusca)
                        .addGap(12, 12, 12)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(PainelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnPesqRCLayout.setVerticalGroup(
            pnPesqRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqRCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPesqRC)
                .addGap(21, 21, 21)
                .addGroup(pnPesqRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(pnPesqRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Pesquisa", pnPesqRC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        filtro = tfBusca.getText().trim();
        update();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        id = getValueAt(tblResumo.getSelectedRow()).id;

        ReacaoCorporalDAO rcDAO = new ReacaoCorporalDAO();

        ReacaoCorporal rc = rcDAO.consultar(id);

        if (rc != null) {
            tfReacaoCorporal.setText(rc.nome);

            // mudar de aba
            tbPainel.setSelectedIndex(0);

            // definir o foco
            tfReacaoCorporal.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            int idExclusao = getValueAt(tblResumo.getSelectedRow()).id;

            ReacaoCorporalDAO rcDAO = new ReacaoCorporalDAO();

            if (rcDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                update();

            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharRegRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharRegRCActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharRegRCActionPerformed

    private void btnSalvarRegRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRegRCActionPerformed
        if (tfReacaoCorporal.getText().isEmpty()) {
            JOptionPane.showInputDialog("Preencha todos os campos obrigatórios!");
        } else {
            ReacaoCorporal c = new ReacaoCorporal();
            c.nome = tfReacaoCorporal.getText();

            if (new ReacaoCorporalDAO().salvar(c)) {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                tfReacaoCorporal.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao cadastrar!");
            }

        }
    }//GEN-LAST:event_btnSalvarRegRCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelDeRolagem;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JToggleButton btnFecharRegRC;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JToggleButton btnSalvarRegRC;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblTituloPesqRC;
    private javax.swing.JLabel lblTituloRegRC;
    private javax.swing.JPanel pnPesqRC;
    private javax.swing.JPanel pnRegRC;
    private javax.swing.JTabbedPane tbPainel;
    private javax.swing.JTable tblResumo;
    private javax.swing.JTextField tfBusca;
    private javax.swing.JTextField tfReacaoCorporal;
    // End of variables declaration//GEN-END:variables
}
