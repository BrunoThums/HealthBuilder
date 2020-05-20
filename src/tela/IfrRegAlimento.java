package tela;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import util.CombosDAO;
import util.Formatacao;
import util.Validacao;

public class IfrRegAlimento extends javax.swing.JInternalFrame {

    public IfrRegAlimento() {
        initComponents();
        Formatacao.formatarData((JFormattedTextField) tffData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPainel = new javax.swing.JTabbedPane();
        pnRegCons = new javax.swing.JPanel();
        lblConsumoDeAlimento = new javax.swing.JLabel();
        tfAlimentoConsumido = new javax.swing.JTextField();
        lblIconAli = new javax.swing.JLabel();
        cbTipoAlimentacao = new javax.swing.JComboBox<>();
        btnFecharCons = new javax.swing.JToggleButton();
        btnSalvarCons = new javax.swing.JToggleButton();
        tffData = new javax.swing.JFormattedTextField();
        tffReacaoCorporal = new javax.swing.JFormattedTextField();
        tffHorario = new javax.swing.JFormattedTextField();
        tffKcalAli = new javax.swing.JFormattedTextField();
        tffKcalTotal = new javax.swing.JFormattedTextField();
        tffPorcaoAli = new javax.swing.JFormattedTextField();
        cbPorcaoAli = new javax.swing.JComboBox<>();
        tffCodigoAli = new javax.swing.JFormattedTextField();
        tffCodigoRC = new javax.swing.JFormattedTextField();
        tffQuantidade = new javax.swing.JFormattedTextField();
        lblIconRC = new javax.swing.JLabel();
        pnPesqCons = new javax.swing.JPanel();
        lblPesquisaConsumo = new javax.swing.JLabel();
        pnBuscaCons = new javax.swing.JPanel();
        PainelDeRolagemPesqCons = new javax.swing.JScrollPane();
        tblResumo2 = new javax.swing.JTable();
        lblBuscaPesqCons = new javax.swing.JLabel();
        tfBuscaPesqCons = new javax.swing.JTextField();
        btnPesquisarPesqCons = new javax.swing.JButton();
        btnExcluirPesqCons = new javax.swing.JButton();
        btnEditarPesqCons = new javax.swing.JButton();
        pnRegAli = new javax.swing.JPanel();
        lblRegistrarAlimento = new javax.swing.JLabel();
        tfAlimentoConsumido1 = new javax.swing.JTextField();
        tfAlimentoConsumido2 = new javax.swing.JTextField();
        tfAlimentoConsumido3 = new javax.swing.JTextField();
        tfAlimentoConsumido4 = new javax.swing.JTextField();
        tfAlimentoConsumido5 = new javax.swing.JTextField();
        tfAlimentoConsumido6 = new javax.swing.JTextField();
        tfAlimentoConsumido7 = new javax.swing.JTextField();
        tfAlimentoConsumido8 = new javax.swing.JTextField();
        btnFecharAli = new javax.swing.JToggleButton();
        btnSalvarAli = new javax.swing.JToggleButton();
        pnPesqAli = new javax.swing.JPanel();
        lblPesqAli = new javax.swing.JLabel();
        pnPesquisa = new javax.swing.JPanel();
        PainelDeRolagemPesqAli = new javax.swing.JScrollPane();
        tblResumoPesqAli = new javax.swing.JTable();
        lblBuscaPesqAli = new javax.swing.JLabel();
        tfBuscaPesqAli = new javax.swing.JTextField();
        btnPesquisarPesqAli = new javax.swing.JButton();
        btnEditarPesqAli = new javax.swing.JButton();
        btnExcluirPesqAli = new javax.swing.JButton();

        setTitle("Consumo");

        tbPainel.setBackground(new java.awt.Color(255, 255, 255));

        pnRegCons.setBackground(new java.awt.Color(255, 255, 255));

        lblConsumoDeAlimento.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblConsumoDeAlimento.setText("Consumo de Alimento");

        tfAlimentoConsumido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "O que você comeu?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        lblIconAli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAli.setText("ver");
        lblIconAli.setBorder(new javax.swing.border.MatteBorder(null));

        cbTipoAlimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Café da Manhã", "Almoço", "Lanche da Tarde", "Janta", "Lanche Noturno" }));
        cbTipoAlimentacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faz parte de qual refeição?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        btnFecharCons.setText("Fechar");
        btnFecharCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharConsActionPerformed(evt);
            }
        });

        btnSalvarCons.setText("Salvar");

        tffData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffData.setText(" ");
        tffData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffDataFocusLost(evt);
            }
        });

        tffReacaoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reação Corporal*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffReacaoCorporal.setText(" ");
        tffReacaoCorporal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffReacaoCorporalFocusLost(evt);
            }
        });

        tffHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horário*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffHorario.setText(" ");
        tffHorario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffHorarioFocusLost(evt);
            }
        });

        tffKcalAli.setEditable(false);
        tffKcalAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal Padrão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffKcalAli.setText(" ");
        tffKcalAli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffKcalAliFocusLost(evt);
            }
        });

        tffKcalTotal.setEditable(false);
        tffKcalTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffKcalTotal.setText(" ");
        tffKcalTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffKcalTotalFocusLost(evt);
            }
        });

        tffPorcaoAli.setEditable(false);
        tffPorcaoAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção Padrão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffPorcaoAli.setText(" ");
        tffPorcaoAli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffPorcaoAliFocusLost(evt);
            }
        });

        cbPorcaoAli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%", "110%", "120%", "130%", "140%", "150%" }));
        cbPorcaoAli.setToolTipText("Quantidade da porção em relação a porção padrão");
        cbPorcaoAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção Alimento*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffCodigoAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodigoAli.setText(" ");
        tffCodigoAli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodigoAliFocusLost(evt);
            }
        });

        tffCodigoRC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodigoRC.setText(" ");
        tffCodigoRC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodigoRCFocusLost(evt);
            }
        });

        tffQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffQuantidade.setText(" ");
        tffQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffQuantidadeFocusLost(evt);
            }
        });

        lblIconRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconRC.setText("ver");
        lblIconRC.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout pnRegConsLayout = new javax.swing.GroupLayout(pnRegCons);
        pnRegCons.setLayout(pnRegConsLayout);
        pnRegConsLayout.setHorizontalGroup(
            pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegConsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegConsLayout.createSequentialGroup()
                        .addComponent(tffCodigoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegConsLayout.createSequentialGroup()
                                .addComponent(btnFecharCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRegConsLayout.createSequentialGroup()
                                .addComponent(lblConsumoDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))))
                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnRegConsLayout.createSequentialGroup()
                            .addComponent(tffCodigoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tffReacaoCorporal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIconRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegConsLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(tfAlimentoConsumido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIconAli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegConsLayout.createSequentialGroup()
                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnRegConsLayout.createSequentialGroup()
                                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tffPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tffData)
                                        .addComponent(tffKcalAli, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(cbTipoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tffQuantidade)
                                .addComponent(tffHorario)
                                .addComponent(tffKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnRegConsLayout.setVerticalGroup(
            pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegConsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblConsumoDeAlimento)
                .addGap(18, 18, 18)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegConsLayout.createSequentialGroup()
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlimentoConsumido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodigoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegConsLayout.createSequentialGroup()
                        .addComponent(lblIconAli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffKcalAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegConsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodigoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnRegConsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIconRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar", pnRegCons);

        pnPesqCons.setBackground(new java.awt.Color(255, 255, 255));

        lblPesquisaConsumo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblPesquisaConsumo.setText("Pesquisa de Consumo");

        pnBuscaCons.setBackground(new java.awt.Color(255, 255, 255));

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
        PainelDeRolagemPesqCons.setViewportView(tblResumo2);

        lblBuscaPesqCons.setText("Busca:");

        tfBuscaPesqCons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        btnPesquisarPesqCons.setText("Pesquisar");
        btnPesquisarPesqCons.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisarPesqCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPesqConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBuscaConsLayout = new javax.swing.GroupLayout(pnBuscaCons);
        pnBuscaCons.setLayout(pnBuscaConsLayout);
        pnBuscaConsLayout.setHorizontalGroup(
            pnBuscaConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeRolagemPesqCons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnBuscaConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaPesqCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfBuscaPesqCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnBuscaConsLayout.setVerticalGroup(
            pnBuscaConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscaConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBuscaConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscaPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDeRolagemPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnExcluirPesqCons.setText("Excluir");
        btnExcluirPesqCons.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExcluirPesqCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPesqConsActionPerformed(evt);
            }
        });

        btnEditarPesqCons.setText("Editar");
        btnEditarPesqCons.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditarPesqCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPesqConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesqConsLayout = new javax.swing.GroupLayout(pnPesqCons);
        pnPesqCons.setLayout(pnPesqConsLayout);
        pnPesqConsLayout.setHorizontalGroup(
            pnPesqConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBuscaCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqConsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnPesqConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqConsLayout.createSequentialGroup()
                        .addComponent(lblPesquisaConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqConsLayout.createSequentialGroup()
                        .addComponent(btnExcluirPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditarPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnPesqConsLayout.setVerticalGroup(
            pnPesqConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqConsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPesquisaConsumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBuscaCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnPesqConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPesqCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Pesquisar Consumo", pnPesqCons);

        pnRegAli.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistrarAlimento.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblRegistrarAlimento.setText("Registrar Alimento");

        tfAlimentoConsumido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Energético (Kcal)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proteina*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sódio*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Açúcares*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gordura Trans*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlimentoConsumido8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gordura Saturada*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        btnFecharAli.setText("Fechar");
        btnFecharAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAliActionPerformed(evt);
            }
        });

        btnSalvarAli.setText("Salvar");

        javax.swing.GroupLayout pnRegAliLayout = new javax.swing.GroupLayout(pnRegAli);
        pnRegAli.setLayout(pnRegAliLayout);
        pnRegAliLayout.setHorizontalGroup(
            pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegAliLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnRegAliLayout.createSequentialGroup()
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlimentoConsumido1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAlimentoConsumido2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlimentoConsumido7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAlimentoConsumido6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnRegAliLayout.createSequentialGroup()
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlimentoConsumido3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAlimentoConsumido4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlimentoConsumido5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAlimentoConsumido8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegAliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegAliLayout.createSequentialGroup()
                        .addComponent(lblRegistrarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegAliLayout.createSequentialGroup()
                        .addComponent(btnFecharAli, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarAli, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnRegAliLayout.setVerticalGroup(
            pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegAliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRegistrarAlimento)
                .addGap(18, 18, 18)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlimentoConsumido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlimentoConsumido6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlimentoConsumido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlimentoConsumido7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlimentoConsumido8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlimentoConsumido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlimentoConsumido5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlimentoConsumido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar Alimento", pnRegAli);

        pnPesqAli.setBackground(new java.awt.Color(255, 255, 255));

        lblPesqAli.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblPesqAli.setText("Pesquisa de Alimento");

        pnPesquisa.setBackground(new java.awt.Color(255, 255, 255));

        tblResumoPesqAli.setModel(new javax.swing.table.DefaultTableModel(
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
        PainelDeRolagemPesqAli.setViewportView(tblResumoPesqAli);

        lblBuscaPesqAli.setText("Busca:");

        tfBuscaPesqAli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        btnPesquisarPesqAli.setText("Pesquisar");
        btnPesquisarPesqAli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisarPesqAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPesqAliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeRolagemPesqAli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaPesqAli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfBuscaPesqAli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscaPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDeRolagemPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEditarPesqAli.setText("Editar");
        btnEditarPesqAli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditarPesqAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPesqAliActionPerformed(evt);
            }
        });

        btnExcluirPesqAli.setText("Excluir");
        btnExcluirPesqAli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExcluirPesqAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPesqAliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesqAliLayout = new javax.swing.GroupLayout(pnPesqAli);
        pnPesqAli.setLayout(pnPesqAliLayout);
        pnPesqAliLayout.setHorizontalGroup(
            pnPesqAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqAliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnPesqAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqAliLayout.createSequentialGroup()
                        .addComponent(lblPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqAliLayout.createSequentialGroup()
                        .addComponent(btnExcluirPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnPesqAliLayout.setVerticalGroup(
            pnPesqAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqAliLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPesqAli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPesqAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPesqAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Pesquisar Alimento", pnPesqAli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbPainel)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarPesqConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPesqConsActionPerformed
    }//GEN-LAST:event_btnPesquisarPesqConsActionPerformed

    private void btnEditarPesqConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesqConsActionPerformed
    }//GEN-LAST:event_btnEditarPesqConsActionPerformed

    private void btnExcluirPesqConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPesqConsActionPerformed

    }//GEN-LAST:event_btnExcluirPesqConsActionPerformed

    private void tffDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataFocusLost
        if (tffData.getText().trim().length() == 10) {
            if (Validacao.validarDataFormatada(tffData.getText())) {
                tffData.setForeground(Color.BLUE);
            } else {
                tffData.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_tffDataFocusLost

    private void tffReacaoCorporalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffReacaoCorporalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffReacaoCorporalFocusLost

    private void btnPesquisarPesqAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPesqAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarPesqAliActionPerformed

    private void btnEditarPesqAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesqAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPesqAliActionPerformed

    private void btnExcluirPesqAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPesqAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirPesqAliActionPerformed

    private void tffHorarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffHorarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffHorarioFocusLost

    private void tffKcalAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffKcalAliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffKcalAliFocusLost

    private void tffKcalTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffKcalTotalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffKcalTotalFocusLost

    private void tffPorcaoAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffPorcaoAliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffPorcaoAliFocusLost

    private void tffCodigoAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodigoAliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffCodigoAliFocusLost

    private void tffCodigoRCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodigoRCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffCodigoRCFocusLost

    private void tffQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffQuantidadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffQuantidadeFocusLost

    private void btnFecharConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharConsActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharConsActionPerformed

    private void btnFecharAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAliActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharAliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelDeRolagemPesqAli;
    private javax.swing.JScrollPane PainelDeRolagemPesqCons;
    private javax.swing.JButton btnEditarPesqAli;
    private javax.swing.JButton btnEditarPesqCons;
    private javax.swing.JButton btnExcluirPesqAli;
    private javax.swing.JButton btnExcluirPesqCons;
    private javax.swing.JToggleButton btnFecharAli;
    private javax.swing.JToggleButton btnFecharCons;
    private javax.swing.JButton btnPesquisarPesqAli;
    private javax.swing.JButton btnPesquisarPesqCons;
    private javax.swing.JToggleButton btnSalvarAli;
    private javax.swing.JToggleButton btnSalvarCons;
    private javax.swing.JComboBox<String> cbPorcaoAli;
    private javax.swing.JComboBox<String> cbTipoAlimentacao;
    private javax.swing.JLabel lblBuscaPesqAli;
    private javax.swing.JLabel lblBuscaPesqCons;
    private javax.swing.JLabel lblConsumoDeAlimento;
    private javax.swing.JLabel lblIconAli;
    private javax.swing.JLabel lblIconRC;
    private javax.swing.JLabel lblPesqAli;
    private javax.swing.JLabel lblPesquisaConsumo;
    private javax.swing.JLabel lblRegistrarAlimento;
    private javax.swing.JPanel pnBuscaCons;
    private javax.swing.JPanel pnPesqAli;
    private javax.swing.JPanel pnPesqCons;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnRegAli;
    private javax.swing.JPanel pnRegCons;
    private javax.swing.JTabbedPane tbPainel;
    private javax.swing.JTable tblResumo2;
    private javax.swing.JTable tblResumoPesqAli;
    private javax.swing.JTextField tfAlimentoConsumido;
    private javax.swing.JTextField tfAlimentoConsumido1;
    private javax.swing.JTextField tfAlimentoConsumido2;
    private javax.swing.JTextField tfAlimentoConsumido3;
    private javax.swing.JTextField tfAlimentoConsumido4;
    private javax.swing.JTextField tfAlimentoConsumido5;
    private javax.swing.JTextField tfAlimentoConsumido6;
    private javax.swing.JTextField tfAlimentoConsumido7;
    private javax.swing.JTextField tfAlimentoConsumido8;
    private javax.swing.JTextField tfBuscaPesqAli;
    private javax.swing.JTextField tfBuscaPesqCons;
    private javax.swing.JFormattedTextField tffCodigoAli;
    private javax.swing.JFormattedTextField tffCodigoRC;
    private javax.swing.JFormattedTextField tffData;
    private javax.swing.JFormattedTextField tffHorario;
    private javax.swing.JFormattedTextField tffKcalAli;
    private javax.swing.JFormattedTextField tffKcalTotal;
    private javax.swing.JFormattedTextField tffPorcaoAli;
    private javax.swing.JFormattedTextField tffQuantidade;
    private javax.swing.JFormattedTextField tffReacaoCorporal;
    // End of variables declaration//GEN-END:variables
}
