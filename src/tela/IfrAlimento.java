package tela;

import dao.AlimentoDAO;
import dao.ReacaoCorporalDAO;
import dao.ConsumoDAO;
import entidade.Alimento;
import entidade.ReacaoCorporal;
import entidade.Consumo;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import util.Formatacao;
import static util.Formatacao.ajustaDataDMA;
import util.Validacao;
import util.TableDataModel;
import static util.Verificacoes.isDataVazia;
import static util.Verificacoes.isHoraVazia;
import static util.Verificacoes.isVazioCB;
import static util.Verificacoes.isVazioTF;
import static util.Verificacoes.verificaNumeros;

public class IfrAlimento extends javax.swing.JInternalFrame {

    int id = 0;
    Alimento alimentoPadrao = new Alimento();
    AlimentoDAO daoAli = new AlimentoDAO();

    Consumo consumoPadrao = new Consumo();
    ConsumoDAO daoCons = new ConsumoDAO();

    ReacaoCorporal reacaoCorporalPadrao = new ReacaoCorporal();
    ReacaoCorporalDAO daoRC = new ReacaoCorporalDAO();

    public IfrAlimento() {
        initComponents();
        Formatacao.formatarData((JFormattedTextField) tffData);
        Formatacao.formatarHora(tffHorario);
        colocaIcone(lblAli, "pesq");
        colocaIcone(lblRC, "pesq");
        updateAli();
        updateCons();
    }

    public final void colocaIcone(JLabel a, String file) {
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/" + file + ".png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPainel = new javax.swing.JTabbedPane();
        pnRegCons = new javax.swing.JPanel();
        lblConsumoDeAlimento = new javax.swing.JLabel();
        tfAlimentoConsumido = new javax.swing.JTextField();
        cbTipoAlimentacao = new javax.swing.JComboBox<>();
        btnFecharCons = new javax.swing.JToggleButton();
        btnSalvarCons = new javax.swing.JToggleButton();
        tffData = new javax.swing.JFormattedTextField();
        tffReacaoCorporal = new javax.swing.JFormattedTextField();
        tffHorario = new javax.swing.JFormattedTextField();
        tffKcalAli = new javax.swing.JFormattedTextField();
        tffKcalTotal = new javax.swing.JFormattedTextField();
        tffPorcaoPadrao = new javax.swing.JFormattedTextField();
        tffCodigoAli = new javax.swing.JFormattedTextField();
        tffCodigoRC = new javax.swing.JFormattedTextField();
        tffQuantidade = new javax.swing.JFormattedTextField();
        lblAli = new javax.swing.JLabel();
        lblRC = new javax.swing.JLabel();
        tffPorcaoAli = new javax.swing.JFormattedTextField();
        pnPesqCons = new javax.swing.JPanel();
        lblPesquisaConsumo = new javax.swing.JLabel();
        pnBuscaCons = new javax.swing.JPanel();
        PainelDeRolagemPesqCons = new javax.swing.JScrollPane();
        tblResumoConsumo = new javax.swing.JTable();
        lblBuscaPesqCons = new javax.swing.JLabel();
        tfBuscaPesqCons = new javax.swing.JTextField();
        btnPesquisarPesqCons = new javax.swing.JButton();
        btnExcluirPesqCons = new javax.swing.JButton();
        btnEditarPesqCons = new javax.swing.JButton();
        pnRegAli = new javax.swing.JPanel();
        lblRegistrarAlimento = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        tfPorcao = new javax.swing.JTextField();
        tfKcal = new javax.swing.JTextField();
        tfProteina = new javax.swing.JTextField();
        tfSodio = new javax.swing.JTextField();
        tfAcucares = new javax.swing.JTextField();
        tfGordTrans = new javax.swing.JTextField();
        tfGordSatur = new javax.swing.JTextField();
        btnFecharAli = new javax.swing.JToggleButton();
        btnSalvarAli = new javax.swing.JToggleButton();
        pnPesqAli = new javax.swing.JPanel();
        lblPesqAli = new javax.swing.JLabel();
        pnPesquisa = new javax.swing.JPanel();
        PainelDeRolagemPesqAli = new javax.swing.JScrollPane();
        tblResumoAlimento = new javax.swing.JTable();
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

        tfAlimentoConsumido.setEditable(false);
        tfAlimentoConsumido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "O que você comeu?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        cbTipoAlimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Café da Manhã", "Almoço", "Lanche da Tarde", "Janta", "Lanche Noturno" }));
        cbTipoAlimentacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faz parte de qual refeição?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        btnFecharCons.setText("Fechar");
        btnFecharCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharConsActionPerformed(evt);
            }
        });

        btnSalvarCons.setText("Salvar");
        btnSalvarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConsActionPerformed(evt);
            }
        });

        tffData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffDataFocusLost(evt);
            }
        });

        tffReacaoCorporal.setEditable(false);
        tffReacaoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reação Corporal*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffReacaoCorporal.setText(" ");
        tffReacaoCorporal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffReacaoCorporalFocusLost(evt);
            }
        });

        tffHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horário*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffHorario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffHorarioFocusLost(evt);
            }
        });
        tffHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffHorarioKeyTyped(evt);
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
        tffKcalTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tffKcalTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffKcalTotalFocusLost(evt);
            }
        });

        tffPorcaoPadrao.setEditable(false);
        tffPorcaoPadrao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção Padrão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffPorcaoPadrao.setText(" ");
        tffPorcaoPadrao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffPorcaoPadraoFocusLost(evt);
            }
        });

        tffCodigoAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodigoAli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodigoAliFocusLost(evt);
            }
        });
        tffCodigoAli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffCodigoAliKeyTyped(evt);
            }
        });

        tffCodigoRC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodigoRC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodigoRCFocusLost(evt);
            }
        });
        tffCodigoRC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffCodigoRCKeyTyped(evt);
            }
        });

        tffQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade(Un.)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffQuantidadeFocusLost(evt);
            }
        });
        tffQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffQuantidadeKeyTyped(evt);
            }
        });

        lblAli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAliMouseClicked(evt);
            }
        });

        lblRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRCMouseClicked(evt);
            }
        });

        tffPorcaoAli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção Alimento*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffPorcaoAli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffPorcaoAliFocusLost(evt);
            }
        });
        tffPorcaoAli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffPorcaoAliKeyTyped(evt);
            }
        });

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
                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnRegConsLayout.createSequentialGroup()
                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnRegConsLayout.createSequentialGroup()
                                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnRegConsLayout.createSequentialGroup()
                                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tffPorcaoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tffPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tffData)
                                                .addComponent(tffKcalAli, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(cbTipoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tffQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tffHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tfAlimentoConsumido, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegConsLayout.createSequentialGroup()
                            .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tffKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnRegConsLayout.createSequentialGroup()
                                    .addComponent(tffCodigoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tffReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(15, 15, 15)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffPorcaoAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffKcalAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffPorcaoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegConsLayout.createSequentialGroup()
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodigoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(pnRegConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFecharCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblRC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbPainel.addTab("Registrar Consumo", pnRegCons);

        pnPesqCons.setBackground(new java.awt.Color(255, 255, 255));

        lblPesquisaConsumo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblPesquisaConsumo.setText("Pesquisa de Consumo");

        pnBuscaCons.setBackground(new java.awt.Color(255, 255, 255));

        tblResumoConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        PainelDeRolagemPesqCons.setViewportView(tblResumoConsumo);

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

        tfDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfPorcao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porção (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfPorcao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPorcaoKeyTyped(evt);
            }
        });

        tfKcal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Energético (Kcal)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfKcal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfKcalKeyTyped(evt);
            }
        });

        tfProteina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proteína (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfProteina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfProteinaKeyTyped(evt);
            }
        });

        tfSodio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sódio (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfSodio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSodioKeyTyped(evt);
            }
        });

        tfAcucares.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Açúcares (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfAcucares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAcucaresKeyTyped(evt);
            }
        });

        tfGordTrans.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gordura Trans (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfGordTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfGordTransKeyTyped(evt);
            }
        });

        tfGordSatur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gordura Saturada (gramas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfGordSatur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfGordSaturKeyTyped(evt);
            }
        });

        btnFecharAli.setText("Fechar");
        btnFecharAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAliActionPerformed(evt);
            }
        });

        btnSalvarAli.setText("Salvar");
        btnSalvarAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRegAliLayout = new javax.swing.GroupLayout(pnRegAli);
        pnRegAli.setLayout(pnRegAliLayout);
        pnRegAliLayout.setHorizontalGroup(
            pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegAliLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnRegAliLayout.createSequentialGroup()
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGordTrans, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(tfAcucares)))
                    .addGroup(pnRegAliLayout.createSequentialGroup()
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfKcal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProteina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfGordSatur, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(tfSodio))))
                .addContainerGap(47, Short.MAX_VALUE))
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
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAcucares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGordTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGordSatur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKcal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegAliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        tblResumoAlimento.setModel(new javax.swing.table.DefaultTableModel(
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
        PainelDeRolagemPesqAli.setViewportView(tblResumoAlimento);

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
        updateCons();
    }//GEN-LAST:event_btnPesquisarPesqConsActionPerformed

    private void btnEditarPesqConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesqConsActionPerformed
        btnSalvarCons.setText("Atualizar");
        //id = getValueAtExe(tblResumo.getSelectedRow()).id;
        String idString = String.valueOf(tblResumoConsumo.getValueAt(tblResumoConsumo.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);
        consumoPadrao = daoCons.consultar(id);

        if (consumoPadrao != null) {

            tffCodigoAli.setText(String.valueOf(consumoPadrao.alimento_id));
            cbTipoAlimentacao.setSelectedItem(consumoPadrao.refeicao);
            tffQuantidade.setText(String.valueOf(consumoPadrao.quantidade));
            tffPorcaoPadrao.setText(String.valueOf(consumoPadrao.porcaoConsumida));
            tffData.setText(ajustaDataDMA(consumoPadrao.data.toString()));
            tffHorario.setText(String.valueOf(consumoPadrao.horario));
            tffCodigoRC.setText(String.valueOf(consumoPadrao.reacaoCorporal_id));

            tbPainel.setSelectedIndex(0);

            tffData.requestFocus();
        }


    }//GEN-LAST:event_btnEditarPesqConsActionPerformed

    private boolean isCamposConsumosPreenchidos() {
        if (isVazioTF(tffCodigoAli)
                || isVazioCB(cbTipoAlimentacao)
                || isVazioTF(tffQuantidade)
                || isVazioTF(tffPorcaoPadrao)
                || isVazioTF(tffPorcaoAli)
                || isDataVazia(tffData)
                || isHoraVazia(tffHorario)
                || isVazioTF(tffCodigoRC)) {
            return false;
        }
        return true;
    }

    private boolean isQNTePorcaoPreenchido() {
        if (isVazioTF(tffQuantidade)
                || isVazioTF(tffPorcaoPadrao)) {
            return false;
        }
        return true;
    }

    private void calculaKcal() {
        if (isQNTePorcaoPreenchido()) {
            int qnt = Integer.parseInt(tffQuantidade.getText().trim());
            int kcal = Integer.parseInt(tffKcalAli.getText().trim());
            int porcaoPadrao = Integer.parseInt(tffPorcaoPadrao.getText().trim());
            int porcaoEscolhida = Integer.parseInt(tffPorcaoAli.getText().trim());
            int kcalReal = ((porcaoEscolhida * kcal) / porcaoPadrao);
            //porcaopadrao - kcal
            //porcaoEscolhida - x
            //kcalEqui = (porcaoEscolhida * kcal) / porcaoPadrao 
            int total = kcalReal * qnt;
            tffKcalTotal.setText(String.valueOf(total));
        }
    }

    private void verificarAlimento() {
        Alimento t = daoAli.consultar(Integer.parseInt(tffCodigoAli.getText()));
        if (t != null) {
            consumoPadrao.alimento_id = t.id;
            tfAlimentoConsumido.setText(t.descricao);
            tffPorcaoPadrao.setText(String.valueOf(t.porcao));
            tffKcalAli.setText(String.valueOf(t.valorEner));
        }
    }

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
        updateAli();
    }//GEN-LAST:event_btnPesquisarPesqAliActionPerformed

    private void btnEditarPesqAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPesqAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPesqAliActionPerformed

    private void btnExcluirPesqAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPesqAliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirPesqAliActionPerformed

    private void tffHorarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffHorarioFocusLost
        if (tffHorario.getText().trim().length() == 5) {
            if (Validacao.validarHoraFormatada(tffHorario.getText())) {
                tffHorario.setForeground(Color.BLUE);
            } else {
                tffHorario.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_tffHorarioFocusLost

    private void tffKcalAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffKcalAliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffKcalAliFocusLost

    private void tffKcalTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffKcalTotalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffKcalTotalFocusLost

    private void tffPorcaoPadraoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffPorcaoPadraoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tffPorcaoPadraoFocusLost

    private void tffCodigoAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodigoAliFocusLost
        verificarAlimento();
    }//GEN-LAST:event_tffCodigoAliFocusLost

    private void tffCodigoRCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodigoRCFocusLost
        verificarRC();
    }//GEN-LAST:event_tffCodigoRCFocusLost

    private void verificarRC() {
        ReacaoCorporal t = daoRC.consultar(Integer.parseInt(tffCodigoRC.getText()));
        if (t != null) {
            consumoPadrao.reacaoCorporal_id = t.id;
            tffReacaoCorporal.setText(t.nome);
        }
    }

    private void tffQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffQuantidadeFocusLost
        calculaKcal();
    }//GEN-LAST:event_tffQuantidadeFocusLost

    private void btnFecharConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharConsActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharConsActionPerformed

    private void btnFecharAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAliActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharAliActionPerformed

    private void tffQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffQuantidadeKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffQuantidadeKeyTyped

    private void tffCodigoAliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffCodigoAliKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffCodigoAliKeyTyped

    private void lblAliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAliMouseClicked
        IfrConsulta<Alimento> cons = new IfrConsulta<Alimento>((Frame) getTopLevelAncestor(), "Alimento") {
            @Override
            public TableDataModel<Alimento> getDataModel() {
                return new TableDataModel<Alimento>() {
                    @Override
                    public List<Alimento> getData() {
                        ArrayList<Alimento> ali;
                        if (!filtro.isEmpty()) {
                            ali = new AlimentoDAO().consultar(filtro);
                        } else {
                            ali = new AlimentoDAO().consultarTodos();
                        }
                        if (ali == null) {
                            ali = new ArrayList<>();
                        }
                        return ali;
                    }

                    @Override
                    public String[] getHeader() {
                        return new String[]{"Código", "Descrição", "Porção", "Kcal"};
                    }

                    @Override
                    public Object[] toTableRow(Alimento t) {
                        return new Object[]{t.id, t.descricao, t.porcao, t.valorEner};
                    }
                };
            }

            @Override
            public void select(Alimento t) {
                alimentoPadrao = t;
                tffCodigoAli.setText(alimentoPadrao.id.toString());
                tfAlimentoConsumido.setText(alimentoPadrao.descricao);
                tffPorcaoPadrao.setText(String.valueOf(alimentoPadrao.porcao));
                tffKcalAli.setText(String.valueOf(alimentoPadrao.valorEner));
                dispose();
            }
        };
        cons.setVisible(true);
    }//GEN-LAST:event_lblAliMouseClicked

    private void lblRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRCMouseClicked
        IfrConsulta<ReacaoCorporal> cons = new IfrConsulta<ReacaoCorporal>((Frame) getTopLevelAncestor(), "Reação Corporal") {
            @Override
            public TableDataModel<ReacaoCorporal> getDataModel() {
                return new TableDataModel<ReacaoCorporal>() {
                    @Override
                    public List<ReacaoCorporal> getData() {
                        ArrayList<ReacaoCorporal> ali;
                        if (!filtro.isEmpty()) {
                            ali = new ReacaoCorporalDAO().consultar(filtro);
                        } else {
                            ali = new ReacaoCorporalDAO().consultarTodos();
                        }
                        if (ali == null) {
                            ali = new ArrayList<>();
                        }
                        return ali;
                    }

                    @Override
                    public String[] getHeader() {
                        return new String[]{"Código", "Descrição"};
                    }

                    @Override
                    public Object[] toTableRow(ReacaoCorporal t) {
                        return new Object[]{t.id, t.nome};
                    }
                };
            }

            @Override
            public void select(ReacaoCorporal t) {
                reacaoCorporalPadrao = t;
                tffCodigoRC.setText(reacaoCorporalPadrao.id.toString());
                tffReacaoCorporal.setText(String.valueOf(reacaoCorporalPadrao.nome));
                dispose();
            }
        };
        cons.setVisible(true);
    }//GEN-LAST:event_lblRCMouseClicked

    private void tfPorcaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPorcaoKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfPorcaoKeyTyped

    private void tfKcalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKcalKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfKcalKeyTyped

    private void tfProteinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProteinaKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfProteinaKeyTyped

    private void tfGordTransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGordTransKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfGordTransKeyTyped

    private void tfGordSaturKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGordSaturKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfGordSaturKeyTyped

    private void tfSodioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSodioKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfSodioKeyTyped

    private void tfAcucaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAcucaresKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfAcucaresKeyTyped

    private void btnSalvarAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAliActionPerformed
        if (isVazioTF(tfDescricao)
                || isVazioTF(tfPorcao)
                || isVazioTF(tfKcal)
                || isVazioTF(tfProteina)
                || isVazioTF(tfAcucares)
                || isVazioTF(tfAcucares)
                || isVazioTF(tfGordTrans)
                || isVazioTF(tfGordSatur)
                || isVazioTF(tfSodio)) {
            JOptionPane.showInternalMessageDialog(rootPane, "Preencha todos os campos obrigatórios!");
        } else {
            //cria um novo Alimento
            Alimento ali = new Alimento();
            //preeche os dados do novo Alimento
            ali.descricao = tfDescricao.getText();
            ali.porcao = Integer.parseInt(tfPorcao.getText());
            ali.valorEner = Integer.parseInt(tfKcal.getText());
            ali.proteina = Integer.parseInt(tfProteina.getText());
            ali.acucares = Integer.parseInt(tfAcucares.getText());
            ali.gordTrans = Integer.parseInt(tfGordTrans.getText());
            ali.gordSaturada = Integer.parseInt(tfGordSatur.getText());
            ali.sodio = Integer.parseInt(tfSodio.getText());
            ali.status = "ativo";
            //verifica se é um novo registro e efetua o salvamento
            if (alimentoPadrao == null) {
                Integer id = daoAli.salvar(ali);
                //se o id não for nulo, salva
                if (id != null) {
                    ali.id = id;
                    JOptionPane.showInternalMessageDialog(rootPane, "O registro foi salvo com sucesso!");
                } else {
                    JOptionPane.showInternalMessageDialog(rootPane, "Ocorreu um erro ao salvar o registro!");
                }
            } else {
                //se o id não for nulo (consulta -> atualização), atualiza
                ali.id = alimentoPadrao.id;
                if (daoAli.atualizar(ali)) {
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    btnSalvarAli.setText("Salvar");
                    alimentoPadrao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao atualizar!");
                }
            }
            cleanAli();
            updateAli();
        }
    }//GEN-LAST:event_btnSalvarAliActionPerformed

    private void btnSalvarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConsActionPerformed
        if (!isCamposConsumosPreenchidos()) {
            JOptionPane.showInternalMessageDialog(rootPane, "Preencha todos os campos obrigatórios!");
        } else {
            //cria um novo Consumo
            Consumo cons = new Consumo();
            //preeche os dados do novo Consumo
            cons.alimento_id = Integer.parseInt(tffCodigoAli.getText());
            cons.refeicao = cbTipoAlimentacao.getSelectedItem().toString();
            cons.quantidade = Integer.parseInt(tffQuantidade.getText());
            cons.porcaoConsumida = tffPorcaoPadrao.getText();
            String[] data = tffData.getText().trim().split("/"); // [dia, mes, ano]
            cons.data = java.sql.Date.valueOf(String.format("%s-%s-%s", data[2], data[1], data[0])); // ano-mes-dia
            cons.horario = java.sql.Time.valueOf(tffHorario.getText().trim() + ":00");
            cons.reacaoCorporal_id = Integer.parseInt(tffCodigoRC.getText());
            cons.status = "ativo";
            //verifica se é um novo registro e efetua o salvamento
            if (id == 0) {
                Integer id = daoCons.salvar(cons);
                //se o id não for nulo, salva
                if (id != null) {
                    cons.id = id;
                    JOptionPane.showInternalMessageDialog(rootPane, "O registro foi salvo com sucesso!");
                } else {
                    JOptionPane.showInternalMessageDialog(rootPane, "Ocorreu um erro ao salvar o registro!");
                }
            } else {
                //se o id não for nulo (consulta -> atualização), atualiza
                cons.id = id;
                if (daoCons.atualizar(cons)) {
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    btnSalvarCons.setText("Salvar");
                    id = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao atualizar!");
                }
            }
            cleanCons();
            updateCons();
        }
    }//GEN-LAST:event_btnSalvarConsActionPerformed

    private void tffPorcaoAliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffPorcaoAliFocusLost
        calculaKcal();
    }//GEN-LAST:event_tffPorcaoAliFocusLost

    private void tffPorcaoAliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffPorcaoAliKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffPorcaoAliKeyTyped

    private void tffCodigoRCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffCodigoRCKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffCodigoRCKeyTyped

    private void tffHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffHorarioKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffHorarioKeyTyped
    private void cleanCons() {
        tffCodigoAli.setText("");
        tfAlimentoConsumido.setText("");
        cbTipoAlimentacao.setSelectedIndex(0);
        tffQuantidade.setText("");
        tffPorcaoPadrao.setText("");
        tffData.setText("");
        tffHorario.setText("");
        tffPorcaoPadrao.setText("");
        tffKcalAli.setText("");
        tffKcalTotal.setText("");
        tffCodigoRC.setText("");
        tffReacaoCorporal.setText("");
    }

    private void cleanAli() {
        tfDescricao.setText("");
        tfPorcao.setText("");
        tfKcal.setText("");
        tfProteina.setText("");
        tfAcucares.setText("");
        tfGordTrans.setText("");
        tfGordSatur.setText("");
        tfSodio.setText("");
    }

    private void updateAli() {
        new AlimentoDAO().popularTabela(tblResumoAlimento, tfBuscaPesqAli.getText());
    }

    private void updateCons() {
        new ConsumoDAO().popularTabela(tblResumoConsumo, tfBuscaPesqCons.getText());
    }

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
    private javax.swing.JComboBox<String> cbTipoAlimentacao;
    private javax.swing.JLabel lblAli;
    private javax.swing.JLabel lblBuscaPesqAli;
    private javax.swing.JLabel lblBuscaPesqCons;
    private javax.swing.JLabel lblConsumoDeAlimento;
    private javax.swing.JLabel lblPesqAli;
    private javax.swing.JLabel lblPesquisaConsumo;
    private javax.swing.JLabel lblRC;
    private javax.swing.JLabel lblRegistrarAlimento;
    private javax.swing.JPanel pnBuscaCons;
    private javax.swing.JPanel pnPesqAli;
    private javax.swing.JPanel pnPesqCons;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnRegAli;
    private javax.swing.JPanel pnRegCons;
    private javax.swing.JTabbedPane tbPainel;
    private javax.swing.JTable tblResumoAlimento;
    private javax.swing.JTable tblResumoConsumo;
    private javax.swing.JTextField tfAcucares;
    private javax.swing.JTextField tfAlimentoConsumido;
    private javax.swing.JTextField tfBuscaPesqAli;
    private javax.swing.JTextField tfBuscaPesqCons;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfGordSatur;
    private javax.swing.JTextField tfGordTrans;
    private javax.swing.JTextField tfKcal;
    private javax.swing.JTextField tfPorcao;
    private javax.swing.JTextField tfProteina;
    private javax.swing.JTextField tfSodio;
    private javax.swing.JFormattedTextField tffCodigoAli;
    private javax.swing.JFormattedTextField tffCodigoRC;
    private javax.swing.JFormattedTextField tffData;
    private javax.swing.JFormattedTextField tffHorario;
    private javax.swing.JFormattedTextField tffKcalAli;
    private javax.swing.JFormattedTextField tffKcalTotal;
    private javax.swing.JFormattedTextField tffPorcaoAli;
    private javax.swing.JFormattedTextField tffPorcaoPadrao;
    private javax.swing.JFormattedTextField tffQuantidade;
    private javax.swing.JFormattedTextField tffReacaoCorporal;
    // End of variables declaration//GEN-END:variables
}
