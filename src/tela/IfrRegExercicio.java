package tela;

import dao.ExercicioDAO;
import dao.TipoExercicioDAO;
import entidade.Exercicio;
import entidade.ReacaoCorporal;
import entidade.TipoExercicio;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import util.Validacao;
import java.sql.Time;
import javax.swing.JFormattedTextField;
import util.Formatacao;
import util.Verificacoes;
public class IfrRegExercicio extends javax.swing.JInternalFrame {

    int id = 0;
    Verificacoes v = new Verificacoes();
    public IfrRegExercicio() {
        initComponents();
        Formatacao.formatarData((JFormattedTextField) tffData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        tbPainel = new javax.swing.JTabbedPane();
        pnRegExer = new javax.swing.JPanel();
        lblTituloRegExer = new javax.swing.JLabel();
        tfTipoExercicio = new javax.swing.JTextField();
        cbTempoHoras = new javax.swing.JComboBox<>();
        cbTempoMinutos = new javax.swing.JComboBox<>();
        lblDoisPontos = new javax.swing.JLabel();
        cbIntensidade = new javax.swing.JComboBox<>();
        tfReacaoCorporal = new javax.swing.JTextField();
        tffCodTipoExer = new javax.swing.JFormattedTextField();
        tffCodReacaoCorpo = new javax.swing.JFormattedTextField();
        tffData = new javax.swing.JFormattedTextField();
        tfKcalExer = new javax.swing.JTextField();
        tfKcalTotal = new javax.swing.JTextField();
        lblReacaoCorporal = new javax.swing.JLabel();
        lblPesqTipoExer = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();
        pnPesqExer = new javax.swing.JPanel();
        lblTituloPesqExer = new javax.swing.JLabel();
        pnPesqExerTBL = new javax.swing.JPanel();
        spPesqExer = new javax.swing.JScrollPane();
        tblResumo = new javax.swing.JTable();
        lblBusca = new javax.swing.JLabel();
        tfBusca = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        pnRegTipoExer = new javax.swing.JPanel();
        lblTituloRegTipoExer = new javax.swing.JLabel();
        tfNomeExercicio = new javax.swing.JTextField();
        tfSubCategoria = new javax.swing.JTextField();
        tfKcalHora = new javax.swing.JTextField();
        btnFecharRegTipoExer = new javax.swing.JToggleButton();
        btnSalvarRegTipoExer = new javax.swing.JToggleButton();
        pnPesqTipoExer = new javax.swing.JPanel();
        lblTituloTipoNovo = new javax.swing.JLabel();
        pnExerciciosNovo = new javax.swing.JPanel();
        PainelDeRolagemNovo = new javax.swing.JScrollPane();
        tblResumoNovo = new javax.swing.JTable();
        lblBuscaNovo = new javax.swing.JLabel();
        tfBuscaNovo = new javax.swing.JTextField();
        btnPesquisarNovo = new javax.swing.JButton();
        btnEditarNovo = new javax.swing.JButton();
        btnExcluirNovo = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pnRegExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloRegExer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloRegExer.setText("Registro de Exercício");

        tfTipoExercicio.setEditable(false);
        tfTipoExercicio.setText(" ");
        tfTipoExercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qual exercício você praticou?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        cbTempoHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cbTempoHoras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Duração (Horas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        cbTempoMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));
        cbTempoMinutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minutos*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        lblDoisPontos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDoisPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoisPontos.setText(":");

        cbIntensidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Leve", "Moderada", "Intensa" }));
        cbIntensidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qual foi a intensidade?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfReacaoCorporal.setEditable(false);
        tfReacaoCorporal.setText(" ");
        tfReacaoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teve alguma reação corporal?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffCodTipoExer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffCodReacaoCorpo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
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

        tfKcalExer.setEditable(false);
        tfKcalExer.setText(" ");
        tfKcalExer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal do Exercício*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfKcalTotal.setEditable(false);
        tfKcalTotal.setText(" ");
        tfKcalTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal Consumido*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        lblReacaoCorporal.setText("icon");

        lblPesqTipoExer.setText("icon");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRegExerLayout = new javax.swing.GroupLayout(pnRegExer);
        pnRegExer.setLayout(pnRegExerLayout);
        pnRegExerLayout.setHorizontalGroup(
            pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegExerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnRegExerLayout.createSequentialGroup()
                                .addComponent(cbTempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbIntensidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnRegExerLayout.createSequentialGroup()
                                .addComponent(tfKcalExer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tffCodReacaoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTipoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesqTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegExerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegExerLayout.createSequentialGroup()
                        .addComponent(lblTituloRegExer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegExerLayout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnRegExerLayout.setVerticalGroup(
            pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegExerLayout.createSequentialGroup()
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloRegExer)
                        .addGap(32, 32, 32)
                        .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTipoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodReacaoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblPesqTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(cbIntensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKcalExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar", pnRegExer);

        pnPesqExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloPesqExer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloPesqExer.setText("Pesquisa de Exercício");

        pnPesqExerTBL.setBackground(new java.awt.Color(255, 255, 255));

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
        spPesqExer.setViewportView(tblResumo);

        lblBusca.setText("Busca:");

        tfBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

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

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesqExerTBLLayout = new javax.swing.GroupLayout(pnPesqExerTBL);
        pnPesqExerTBL.setLayout(pnPesqExerTBLLayout);
        pnPesqExerTBLLayout.setHorizontalGroup(
            pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqExerTBLLayout.createSequentialGroup()
                .addGroup(pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPesqExerTBLLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spPesqExer, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqExerTBLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPesqExerTBLLayout.setVerticalGroup(
            pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqExerTBLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spPesqExer, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnPesqExerLayout = new javax.swing.GroupLayout(pnPesqExer);
        pnPesqExer.setLayout(pnPesqExerLayout);
        pnPesqExerLayout.setHorizontalGroup(
            pnPesqExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqExerLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblTituloPesqExer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addComponent(pnPesqExerTBL, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );
        pnPesqExerLayout.setVerticalGroup(
            pnPesqExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqExerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPesqExer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPesqExerTBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPainel.addTab("Pesquisar", pnPesqExer);

        pnRegTipoExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloRegTipoExer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloRegTipoExer.setText("Registro de Tipo de Exercício");

        tfNomeExercicio.setText(" ");
        tfNomeExercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Exercício/Atividade(ex: natação)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfSubCategoria.setText(" ");
        tfSubCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub-Categoria(ex: nado peito/borboleta)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfKcalHora.setText(" ");
        tfKcalHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal gasta por hora (Kcal/hora)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        btnFecharRegTipoExer.setText("Fechar");
        btnFecharRegTipoExer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharRegTipoExerActionPerformed(evt);
            }
        });

        btnSalvarRegTipoExer.setText("Salvar");
        btnSalvarRegTipoExer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarRegTipoExerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRegTipoExerLayout = new javax.swing.GroupLayout(pnRegTipoExer);
        pnRegTipoExer.setLayout(pnRegTipoExerLayout);
        pnRegTipoExerLayout.setHorizontalGroup(
            pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegTipoExerLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKcalHora, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegTipoExerLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegTipoExerLayout.createSequentialGroup()
                        .addComponent(lblTituloRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegTipoExerLayout.createSequentialGroup()
                        .addComponent(btnFecharRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSalvarRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        pnRegTipoExerLayout.setVerticalGroup(
            pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegTipoExerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRegTipoExer)
                .addGap(36, 36, 36)
                .addComponent(tfNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfKcalHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addGroup(pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar Exercício", pnRegTipoExer);

        pnPesqTipoExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloTipoNovo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloTipoNovo.setText("Tipos de Exercícios Registrados");

        pnExerciciosNovo.setBackground(new java.awt.Color(255, 255, 255));

        tblResumoNovo.setModel(new javax.swing.table.DefaultTableModel(
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
        PainelDeRolagemNovo.setViewportView(tblResumoNovo);

        lblBuscaNovo.setText("Busca:");

        tfBuscaNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        btnPesquisarNovo.setText("Pesquisar");
        btnPesquisarNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNovoActionPerformed(evt);
            }
        });

        btnEditarNovo.setText("Editar");
        btnEditarNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarNovoActionPerformed(evt);
            }
        });

        btnExcluirNovo.setText("Excluir");
        btnExcluirNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExcluirNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnExerciciosNovoLayout = new javax.swing.GroupLayout(pnExerciciosNovo);
        pnExerciciosNovo.setLayout(pnExerciciosNovoLayout);
        pnExerciciosNovoLayout.setHorizontalGroup(
            pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                        .addComponent(lblBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                        .addComponent(btnExcluirNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(PainelDeRolagemNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnExerciciosNovoLayout.setVerticalGroup(
            pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnExerciciosNovoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDeRolagemNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnPesqTipoExerLayout = new javax.swing.GroupLayout(pnPesqTipoExer);
        pnPesqTipoExer.setLayout(pnPesqTipoExerLayout);
        pnPesqTipoExerLayout.setHorizontalGroup(
            pnPesqTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnExerciciosNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnPesqTipoExerLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblTituloTipoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPesqTipoExerLayout.setVerticalGroup(
            pnPesqTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqTipoExerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTituloTipoNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnExerciciosNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPainel.addTab("Pesquisar Exercício", pnPesqTipoExer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tbPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tbPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!(tffData.getText().isEmpty()
                || tfTipoExercicio.getText().isEmpty()
                || tfReacaoCorporal.getText().isEmpty()
                || cbTempoHoras.getSelectedIndex() == 0
                || cbTempoMinutos.getSelectedIndex() == 0
                || cbIntensidade.getSelectedIndex() == 0
                || tfKcalExer.getText().isEmpty()
                || tfKcalTotal.getText().isEmpty())) {
            
            Exercicio e = new Exercicio();
            TipoExercicio t = new TipoExercicio();
            ReacaoCorporal r = new ReacaoCorporal();
            e.data = tffData.getText();
            t.descricao = tfTipoExercicio.getText();
            r.descricao = tfReacaoCorporal.getText();
            e.tempo = converteHora(cbTempoHoras, cbTempoMinutos).toString();
            e.intensidade = cbIntensidade.getSelectedItem().toString();
            t.kcal = tfKcalExer.getText();
            e.kcalTotal = tfKcalTotal.getText();

            if (new ExercicioDAO().salvar(e)) {
                System.out.println("Funfou");
                dispose();
            } else {
                System.out.println("Deu erro!");
            }
        } else {
            JOptionPane.showInputDialog("Preencha todos os campos obrigatórios!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharRegTipoExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharRegTipoExerActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharRegTipoExerActionPerformed

    private void btnSalvarRegTipoExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRegTipoExerActionPerformed
        if(!(tfNomeExercicio.getText().isEmpty()||tfSubCategoria.getText().isEmpty()||tfKcalHora.getText().isEmpty())){
            TipoExercicio t = new TipoExercicio();
            t.descricao = tfNomeExercicio.getText();
            t.subDescricao = tfSubCategoria.getText();
            t.kcal = tfKcalHora.getText();

            if (new TipoExercicioDAO().salvar(t)) {
                JOptionPane.showInputDialog(rootPane, "Sucesso", "O registro foi salvo com sucesso!");
                dispose();
            } else {
                JOptionPane.showInputDialog(rootPane, "Aviso", "Ocorreu um erro ao salvar o registro!");
            }
        } else {
            JOptionPane.showMessageDialog(pnRegTipoExer, "Preencha todos os campos obrigatórios!");
        }
    }//GEN-LAST:event_btnSalvarRegTipoExerActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new ExercicioDAO().popularTabela(tblResumo, tfBusca.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        ExercicioDAO exeDAO = new ExercicioDAO();

        Exercicio exercicio = exeDAO.consultar(id);

        if (exercicio != null) {
            // define os valores do obj nos campos da tela
            tffData.setText(exercicio.data);
            tfTipoExercicio.setText(exercicio.tipoExercicio);
            tfReacaoCorporal.setText(exercicio.reacaoCorporal);
            //String[] time = new Time((Time.valueOf(exercicio.tempo.split(":"));
            //cbTempoHoras.setSelectedItem(exercicio.tempo.split(":"));
            //cbTempoMinutos.setSelectedItem(exercicio.tempo.split(":"));
            cbIntensidade.setSelectedItem(exercicio.intensidade);
            tfKcalExer.setText(exercicio.kcalTipoExercicio);
            tfKcalTotal.setText(exercicio.kcalTotal);
            
            // mudar de aba
            tbPainel.setSelectedIndex(0);

            // definir o foco
            tffData.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            ExercicioDAO exeDAO = new ExercicioDAO();

            if (exeDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                exeDAO.popularTabela(tblResumo, tfBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNovoActionPerformed
        new TipoExercicioDAO().popularTabela(tblResumoNovo, tfBuscaNovo.getText());
    }//GEN-LAST:event_btnPesquisarNovoActionPerformed

    private void btnEditarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNovoActionPerformed
        String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        TipoExercicioDAO tipoDAO = new TipoExercicioDAO();

        TipoExercicio tipoExe = tipoDAO.consultar(id);

        if (tipoExe != null) {
            // define os valores do obj nos campos da tela
            tfNomeExercicio.setText(tipoExe.descricao);
            tfSubCategoria.setText(tipoExe.subDescricao);
            tfKcalHora.setText(tipoExe.kcal);
            
            // mudar de aba
            tbPainel.setSelectedIndex(2);

            // definir o foco
            tfNomeExercicio.requestFocus();
        }
    }//GEN-LAST:event_btnEditarNovoActionPerformed

    private void btnExcluirNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirNovoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            TipoExercicioDAO tipoExeDAO = new TipoExercicioDAO();

            if (tipoExeDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                tipoExeDAO.popularTabela(tblResumo, tfBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirNovoActionPerformed

    private void tffDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataFocusLost
        if (tffData.getText().trim().length() == 10) {
            if (Validacao.validarDataFormatada(tffData.getText())) {
                tffData.setForeground(Color.BLUE);
            } else {
                tffData.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_tffDataFocusLost

    private void tffDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tffDataKeyTyped
    private Time converteHora(JComboBox hora, JComboBox min){ 
        String[] time = new Time(Calendar.getInstance().getTime().getTime()).toString().split(":");

        String h = (String) hora.getSelectedItem();
        String m = (String) min.getSelectedItem();

        return Time.valueOf(String.join(":", h, m, "00"));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PainelDeRolagemNovo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarNovo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirNovo;
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JToggleButton btnFecharRegTipoExer;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarNovo;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JToggleButton btnSalvarRegTipoExer;
    private javax.swing.JComboBox<String> cbIntensidade;
    private javax.swing.JComboBox<String> cbTempoHoras;
    private javax.swing.JComboBox<String> cbTempoMinutos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblBuscaNovo;
    private javax.swing.JLabel lblDoisPontos;
    private javax.swing.JLabel lblPesqTipoExer;
    private javax.swing.JLabel lblReacaoCorporal;
    private javax.swing.JLabel lblTituloPesqExer;
    private javax.swing.JLabel lblTituloRegExer;
    private javax.swing.JLabel lblTituloRegTipoExer;
    private javax.swing.JLabel lblTituloTipoNovo;
    private javax.swing.JPanel pnExerciciosNovo;
    private javax.swing.JPanel pnPesqExer;
    private javax.swing.JPanel pnPesqExerTBL;
    private javax.swing.JPanel pnPesqTipoExer;
    private javax.swing.JPanel pnRegExer;
    private javax.swing.JPanel pnRegTipoExer;
    private javax.swing.JScrollPane spPesqExer;
    private javax.swing.JTabbedPane tbPainel;
    private javax.swing.JTable tblResumo;
    private javax.swing.JTable tblResumoNovo;
    private javax.swing.JTextField tfBusca;
    private javax.swing.JTextField tfBuscaNovo;
    private javax.swing.JTextField tfKcalExer;
    private javax.swing.JTextField tfKcalHora;
    private javax.swing.JTextField tfKcalTotal;
    private javax.swing.JTextField tfNomeExercicio;
    private javax.swing.JTextField tfReacaoCorporal;
    private javax.swing.JTextField tfSubCategoria;
    private javax.swing.JTextField tfTipoExercicio;
    private javax.swing.JFormattedTextField tffCodReacaoCorpo;
    private javax.swing.JFormattedTextField tffCodTipoExer;
    private javax.swing.JFormattedTextField tffData;
    // End of variables declaration//GEN-END:variables
}
