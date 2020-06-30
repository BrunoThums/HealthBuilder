package tela;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import util.ConexaoBD;
import static util.Formatacao.parseDMADate;
import static util.Verificacoes.isDataVazia;

public class IfrApresentacao extends javax.swing.JInternalFrame {

    int id = 0;
    private JDesktopPane pane;

    public void setPane(JDesktopPane pane) {
        this.pane = pane;
    }

    public IfrApresentacao() {
        initComponents();
        lblNome.setText(FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);
        lblLogin.setText(FrmJP.usuario.login);
        lblIMC.setText(String.valueOf(FrmJP.usuario.imc));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        pnAcessoRapido = new javax.swing.JPanel();
        btnExe = new javax.swing.JButton();
        btnAli = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblStatusImc = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        lblLogin2 = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        jpnGrafico = new javax.swing.JPanel();
        lblConsumo = new javax.swing.JLabel();
        lblGasto = new javax.swing.JLabel();
        tfGasto = new javax.swing.JTextField();
        tfConsumo = new javax.swing.JTextField();
        lblMensagem = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        tfSaldo1 = new javax.swing.JTextField();
        tfSaldo2 = new javax.swing.JTextField();
        tbbRelatorios = new javax.swing.JTabbedPane();
        jpnRelatorios = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnGerarExercicio1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGerarAlimento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnGerarConsumo = new javax.swing.JButton();
        btnGerarExercicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGerarConsumo1 = new javax.swing.JButton();
        btnGerarExercicio2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGerarConsumo2 = new javax.swing.JButton();
        btnGerarExercicio3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Cadastro: Apresentação");
        setToolTipText("");

        jpnAtualizacoes.setBackground(new java.awt.Color(255, 255, 255));
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
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
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
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                        .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PainelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnAtualizacoesLayout.createSequentialGroup()
                                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnAtualizacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnAtualizacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbbAcessoRapido.setToolTipText("");

        pnAcessoRapido.setBackground(new java.awt.Color(255, 255, 255));
        pnAcessoRapido.setToolTipText("");

        btnExe.setBackground(new java.awt.Color(255, 153, 255));
        btnExe.setText("Exercicio");
        btnExe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnExe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExeMouseExited(evt);
            }
        });
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });

        btnAli.setBackground(new java.awt.Color(255, 153, 102));
        btnAli.setText("Alimentação");
        btnAli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliActionPerformed(evt);
            }
        });

        btnRC.setBackground(new java.awt.Color(204, 204, 255));
        btnRC.setText("Reação Corporal");
        btnRC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCActionPerformed(evt);
            }
        });

        jLabel1.setText("_______________________________");

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        lblNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNomeMouseClicked(evt);
            }
        });

        lblStatusImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome1.setText("Nome:");

        lblLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin1.setText("Login:");

        lblLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin2.setText("Imc:");

        lblIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnAcessoRapidoLayout = new javax.swing.GroupLayout(pnAcessoRapido);
        pnAcessoRapido.setLayout(pnAcessoRapidoLayout);
        pnAcessoRapidoLayout.setHorizontalGroup(
            pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStatusImc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnAcessoRapidoLayout.createSequentialGroup()
                .addGroup(pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAcessoRapidoLayout.createSequentialGroup()
                        .addGroup(pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLogin2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLogin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnAcessoRapidoLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExe, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(btnRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAcessoRapidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnAcessoRapidoLayout.setVerticalGroup(
            pnAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoRapidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblStatusImc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbbAcessoRapido.addTab("Acesso Rápido", pnAcessoRapido);

        jpnGrafico.setBackground(new java.awt.Color(255, 255, 255));
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

        lblSaldo1.setText("Saldo:");

        tfSaldo1.setEditable(false);
        tfSaldo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        tfSaldo2.setEditable(false);
        tfSaldo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout jpnGraficoLayout = new javax.swing.GroupLayout(jpnGrafico);
        jpnGrafico.setLayout(jpnGraficoLayout);
        jpnGraficoLayout.setHorizontalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGraficoLayout.createSequentialGroup()
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGraficoLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnGraficoLayout.createSequentialGroup()
                        .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(lblGasto))))
                            .addGroup(jpnGraficoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSaldo1)
                                .addGap(32, 32, 32)
                                .addComponent(tfSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(tfSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(tfGasto))
                .addGap(18, 18, 18)
                .addGroup(jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        jpnRelatorios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnRelatorios.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), null));

        btnGerarExercicio1.setBackground(new java.awt.Color(102, 153, 255));
        btnGerarExercicio1.setText("Tipos Exercícios");
        btnGerarExercicio1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarExercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarExercicio1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listagem");

        btnGerarAlimento.setBackground(new java.awt.Color(102, 153, 255));
        btnGerarAlimento.setText("Alimentos");
        btnGerarAlimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarAlimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnGerarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGerarExercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarExercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));

        btnGerarConsumo.setBackground(new java.awt.Color(0, 255, 255));
        btnGerarConsumo.setText("Consumo");
        btnGerarConsumo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarConsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarConsumoActionPerformed(evt);
            }
        });

        btnGerarExercicio.setBackground(new java.awt.Color(0, 255, 255));
        btnGerarExercicio.setText("Exercícios");
        btnGerarExercicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarExercicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarExercicioActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Relatório - Sem Parâmetros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGerarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 102), null));

        btnGerarConsumo1.setBackground(new java.awt.Color(255, 102, 102));
        btnGerarConsumo1.setText("Consumo");
        btnGerarConsumo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarConsumo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarConsumo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarConsumo1ActionPerformed(evt);
            }
        });

        btnGerarExercicio2.setBackground(new java.awt.Color(255, 102, 102));
        btnGerarExercicio2.setText("Exercícios");
        btnGerarExercicio2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarExercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarExercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarExercicio2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Relatório - Com Parâmetro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerarConsumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGerarExercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarConsumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarExercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));

        btnGerarConsumo2.setBackground(new java.awt.Color(102, 255, 102));
        btnGerarConsumo2.setText("Consumo");
        btnGerarConsumo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarConsumo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarConsumo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarConsumo2ActionPerformed(evt);
            }
        });

        btnGerarExercicio3.setBackground(new java.awt.Color(102, 255, 102));
        btnGerarExercicio3.setText("Exercícios");
        btnGerarExercicio3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        btnGerarExercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarExercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarExercicio3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Relatório - 15 dias");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerarConsumo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGerarExercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarConsumo2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarExercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        btnFechar.setText("Fechar");
        btnFechar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRelatoriosLayout = new javax.swing.GroupLayout(jpnRelatorios);
        jpnRelatorios.setLayout(jpnRelatoriosLayout);
        jpnRelatoriosLayout.setHorizontalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRelatoriosLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnRelatoriosLayout.setVerticalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tbbRelatorios.addTab("Relatórios", jpnRelatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbbAcessoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jpnAtualizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpnAtualizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tbbAcessoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(tbbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        /*if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            if (apDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                apDAO.popularTabela(tblResumo, tfBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }*/
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        //if (apresentacao != null) {
        // define os valores do obj nos campos da tela
        //tfdId.setText(String.valueOf(apresentacao.getId()));
        //tfdDescricao.setText(apresentacao.getDescricao());
        // mudar de aba
        tbbRelatorios.setSelectedIndex(0);

        // definir o foco
        //tfdDescricao.requestFocus();
        // }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //new ApresentacaoDAO().popularTabela(tblResumo, tfBusca.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnGerarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarExercicioActionPerformed
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/list_Exercicios.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();
            parametros.put("nome_user", FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);

//            String sql = "select * "
//                    + "from tratamento "
//                    + "where "
//                    + "data_inicio >= '"+tffDataInicial.getText()+"' AND "
//                    + "data_inicio <= '"+tffDataFinal.getText()+"')";
//            
//            parametros.put("sql", sql);
            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
    }//GEN-LAST:event_btnGerarExercicioActionPerformed

    private void btnGerarExercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarExercicio1ActionPerformed
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/list_tipo_exercicio.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();
            parametros.put("nome_user", FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);

//            String sql = "select * "
//                    + "from tratamento "
//                    + "where "
//                    + "data_inicio >= '"+tffDataInicial.getText()+"' AND "
//                    + "data_inicio <= '"+tffDataFinal.getText()+"')";
//            
//            parametros.put("sql", sql);
            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
    }//GEN-LAST:event_btnGerarExercicio1ActionPerformed

    private void btnAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliActionPerformed
        iniciaTela(IfrAlimento.class);
    }//GEN-LAST:event_btnAliActionPerformed

    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        iniciaTela(IfrExercicio.class);
    }//GEN-LAST:event_btnExeActionPerformed

    private void btnExeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExeMouseExited
        btnExe.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnExeMouseExited

    private void btnExeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExeMouseEntered
        btnExe.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED, Color.lightGray, Color.lightGray), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
    }//GEN-LAST:event_btnExeMouseEntered

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
        iniciaTela(IfrReacaoCorporal.class);
    }//GEN-LAST:event_btnRCActionPerformed

    private void btnGerarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarConsumoActionPerformed
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/list_consumo.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();
            parametros.put("nome_user", FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);

//            String sql = "select * "
//                    + "from tratamento "
//                    + "where "
//                    + "data_inicio >= '"+tffDataInicial.getText()+"' AND "
//                    + "data_inicio <= '"+tffDataFinal.getText()+"')";
//            
//            parametros.put("sql", sql);
            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
    }//GEN-LAST:event_btnGerarConsumoActionPerformed

    private void btnGerarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarAlimentoActionPerformed
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/list_alimentos.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();
            parametros.put("nome_user", FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);

//            String sql = "select * "
//                    + "from tratamento "
//                    + "where "
//                    + "data_inicio >= '"+tffDataInicial.getText()+"' AND "
//                    + "data_inicio <= '"+tffDataFinal.getText()+"')";
//            
//            parametros.put("sql", sql);
            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
    }//GEN-LAST:event_btnGerarAlimentoActionPerformed

    private void btnGerarConsumo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarConsumo1ActionPerformed
        IfrRelatorio a = new IfrRelatorio();
        a.btnSalvar.addActionListener(e -> {
            if (a.tffDataIni != null && !isDataVazia(a.tffDataIni) && a.tffDataFim != null && !isDataVazia(a.tffDataFim)) {
                a.isOk = true;
                a.dataini = a.tffDataIni.getText();
                a.datafim = a.tffDataFim.getText();
                try {
                    // Compila o relatorio
                    JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/list_consumo_param.jrxml"));

                    // Mapeia campos de parametros para o relatorio, mesmo que nao existam
                    Map parametros = new HashMap();
                    parametros.put("nome_user", FrmJP.usuario.nome + " " + FrmJP.usuario.sobrenome);
                    parametros.put("ativo", a.ckAtivo.isSelected()?"ativo":"inativo");
                    parametros.put("dataIni", parseDMADate(a.dataini));
                    parametros.put("dataFim", parseDMADate(a.datafim));
//            String sql = "select * "
//                    + "from tratamento "
//                    + "where "
//                    + "data_inicio >= '"+tffDataInicial.getText()+"' AND "
//                    + "data_inicio <= '"+tffDataFinal.getText()+"')";
//            
//            parametros.put("sql", sql);
                    // Executa relatoio
                    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

                    // Exibe resultado em video
                    JasperViewer.viewReport(impressao, false);

                } catch (JRException f) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
                }
                a.dispose();
            }
        });
        a.setVisible(true);
        a.setLocationRelativeTo(this);
        a.requestFocus();

        /*SELECT * FROM  consumo c,  reacaocorporal r,  alimento a 
 WHERE c.reacaocorporal_id = r.id
 AND c.alimento_id = a.id
 AND c.status = $P{ativo}
 AND c.data BETWEEN  $P{dataIni} AND $P{dataFim}*/

    }//GEN-LAST:event_btnGerarConsumo1ActionPerformed

    private void btnGerarExercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarExercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarExercicio2ActionPerformed

    private void btnGerarConsumo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarConsumo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarConsumo2ActionPerformed

    private void btnGerarExercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarExercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarExercicio3ActionPerformed

    private void lblNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeMouseClicked
        iniciaTela(IfrPerfil.class);
    }//GEN-LAST:event_lblNomeMouseClicked

    public JInternalFrame getTela(Class clazz) {
        for (int i = 0; i < pane.getComponentCount(); i++) {
            if (pane.getComponents()[i].getClass().getName().equals(clazz.getName())) {
                return (JInternalFrame) pane.getComponents()[i];
            }
        }
        return null;
    }

    public void setActive(JInternalFrame tela) {
        tela.setVisible(true);
        pane.moveToFront(tela);
        pane.setSelectedFrame(tela);
    }

    private void iniciaTela(Class clazz) {
        JInternalFrame tela = getTela(clazz);
        if (tela == null) {
            try {
                tela = (JInternalFrame) clazz.newInstance();
                pane.add(tela);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(FrmJP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setActive(tela);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelDeRolagem;
    private javax.swing.JButton btnAli;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExe;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGerarAlimento;
    private javax.swing.JButton btnGerarConsumo;
    private javax.swing.JButton btnGerarConsumo1;
    private javax.swing.JButton btnGerarConsumo2;
    private javax.swing.JButton btnGerarExercicio;
    private javax.swing.JButton btnGerarExercicio1;
    private javax.swing.JButton btnGerarExercicio2;
    private javax.swing.JButton btnGerarExercicio3;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpnAtualizacoes;
    private javax.swing.JPanel jpnGrafico;
    private javax.swing.JPanel jpnRelatorios;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblLogin2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblStatusImc;
    private javax.swing.JLabel lblUltimasAtualizacoes;
    private javax.swing.JPanel pnAcessoRapido;
    private javax.swing.JTabbedPane tbbAcessoRapido;
    private javax.swing.JTabbedPane tbbRelatorios;
    private javax.swing.JTable tblResumo;
    private javax.swing.JTextField tfBusca;
    private javax.swing.JTextField tfConsumo;
    private javax.swing.JTextField tfGasto;
    private javax.swing.JTextField tfSaldo;
    private javax.swing.JTextField tfSaldo1;
    private javax.swing.JTextField tfSaldo2;
    // End of variables declaration//GEN-END:variables
}
