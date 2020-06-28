package tela;

import dao.ExercicioDAO;
import dao.ReacaoCorporalDAO;
import dao.TipoExercicioDAO;
import entidade.Exercicio;
import entidade.ReacaoCorporal;
import entidade.TipoExercicio;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import util.Formatacao;
import static util.Formatacao.converteHora;
import static util.Formatacao.ajustaDataDMA;
import static util.Verificacoes.isVazioTF;
import static util.Verificacoes.isVazioCB;
import util.TableDataModel;
import static util.Verificacoes.isDataValida;
import static util.Verificacoes.isDataVazia;
import static util.Verificacoes.verificaNumeros;

public class IfrExercicio extends javax.swing.JInternalFrame {

    int id = 0;
    ReacaoCorporal rcPadrao = null;
    ReacaoCorporalDAO daoRC = new ReacaoCorporalDAO();
    TipoExercicio tipoExePadrao = null;
    TipoExercicioDAO daoTE = new TipoExercicioDAO();
    Exercicio exePadrao = null;
    ExercicioDAO daoE = new ExercicioDAO();
    String filtro;

    public IfrExercicio() {
        filtro = "";
        initComponents();
        Formatacao.formatarData((JFormattedTextField) tffData);
        colocaIcone(lblPesqReacaoCorporal, "pesq");
        colocaIcone(lblPesqTipoExer, "pesq");
        /*tblResumoNovo.setModel(new TableDataModel<TipoExercicio>() {
            @Override
            public List<TipoExercicio> getData() {
                ArrayList<TipoExercicio> tipoExer;
                if (!filtro.isEmpty()) {
                    tipoExer = new TipoExercicioDAO().consultar(filtro);
                } else {
                    tipoExer = new TipoExercicioDAO().consultarTodos();
                }
                if (tipoExer == null) {
                    tipoExer = new ArrayList<>();
                }
                return tipoExer;
            }

            @Override
            public String[] getHeader() {
                return new String[]{"Código", "Descrição", "Sub-Descrição", "Kcal"};
            }

            @Override
            public Object[] toTableRow(TipoExercicio t) {
                return new Object[]{t.id, t.descricao, t.subDescricao, t.kcal};
            }
        });
        tblResumo.setModel(new TableDataModel<Exercicio>() {
            @Override
            public List<Exercicio> getData() {
                ArrayList<Exercicio> exer;
                if (!filtro.isEmpty()) {
                    exer = new ExercicioDAO().consultar(filtro);
                } else {
                    exer = new ExercicioDAO().consultarTodos();
                }
                if (exer == null) {
                    exer = new ArrayList<>();
                }
                return exer;
            }

            @Override
            public String[] getHeader() {
                return new String[]{"Código", "Exercicio", "Intensidade", "Tempo", "Kcal Consumido"};
            }

            @Override
            public Object[] toTableRow(Exercicio t) {
                return new Object[]{t.id, t.tipoExercicio, t.intensidade, t.tempo, t.kcalTotal};
            }
        });*/
        //filtro = tfBusca.getText().trim();
        updateExe();
        updateTipoExe();
    }

    /*public final void updateTipoExe() {
        ((TableDataModel<TipoExercicio>) tblResumoNovo.getModel()).update();
    }
    
    public final void updateExe() {
        ((TableDataModel<Exercicio>) tblResumo.getModel()).update();
    }

    public TipoExercicio getValueAtTipoExe(int row) {
        return ((TableDataModel<TipoExercicio>) tblResumoNovo.getModel()).getValueAt(row);
    }

    public Exercicio getValueAtExe(int row) {
        return ((TableDataModel<Exercicio>) tblResumo.getModel()).getValueAt(row);
    }*/
    
    public final void colocaIcone(JLabel a, String file) {
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/" + file + ".png")));
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
        lblPesqReacaoCorporal = new javax.swing.JLabel();
        lblPesqTipoExer = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();
        tfSubExercicio = new javax.swing.JTextField();
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
        lblTituloRegExer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegExer.setText("Registro de Exercício");
        lblTituloRegExer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfTipoExercicio.setEditable(false);
        tfTipoExercicio.setText(" ");
        tfTipoExercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qual exercício você praticou?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        cbTempoHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbTempoHoras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Duração (Horas)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        cbTempoHoras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbTempoHorasFocusLost(evt);
            }
        });

        cbTempoMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbTempoMinutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minutos*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        cbTempoMinutos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbTempoMinutosFocusLost(evt);
            }
        });

        lblDoisPontos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDoisPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoisPontos.setText(":");

        cbIntensidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Leve", "Moderada", "Intensa" }));
        cbIntensidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qual foi a intensidade?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        cbIntensidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbIntensidadeFocusLost(evt);
            }
        });

        tfReacaoCorporal.setEditable(false);
        tfReacaoCorporal.setText(" ");
        tfReacaoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teve alguma reação corporal?*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tffCodTipoExer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodTipoExer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodTipoExerFocusLost(evt);
            }
        });
        tffCodTipoExer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffCodTipoExerKeyTyped(evt);
            }
        });

        tffCodReacaoCorpo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCodReacaoCorpo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCodReacaoCorpoFocusLost(evt);
            }
        });
        tffCodReacaoCorpo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffCodReacaoCorpoKeyTyped(evt);
            }
        });

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
        tfKcalTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfKcalTotal.setText(" ");
        tfKcalTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal Consumido*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        lblPesqReacaoCorporal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesqReacaoCorporalMouseClicked(evt);
            }
        });

        lblPesqTipoExer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesqTipoExerMouseClicked(evt);
            }
        });

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

        tfSubExercicio.setEditable(false);
        tfSubExercicio.setText(" ");
        tfSubExercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub-Categoria do Exercicio*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        javax.swing.GroupLayout pnRegExerLayout = new javax.swing.GroupLayout(pnRegExer);
        pnRegExer.setLayout(pnRegExerLayout);
        pnRegExerLayout.setHorizontalGroup(
            pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloRegExer, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(pnRegExerLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnRegExerLayout.createSequentialGroup()
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRegExerLayout.createSequentialGroup()
                                .addComponent(cbTempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbIntensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnRegExerLayout.createSequentialGroup()
                                .addComponent(tfKcalExer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tfKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addComponent(tffCodTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTipoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSubExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(lblPesqTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addComponent(tffCodReacaoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPesqReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnRegExerLayout.setVerticalGroup(
            pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegExerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRegExer)
                .addGap(35, 35, 35)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblPesqTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRegExerLayout.createSequentialGroup()
                        .addComponent(tffData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTipoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCodTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(tfSubExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tffCodReacaoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPesqReacaoCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoisPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(cbIntensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKcalExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pnRegExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbPainel.addTab("Registrar Exercício", pnRegExer);

        pnPesqExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloPesqExer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloPesqExer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addGap(51, 51, 51)
                .addGroup(pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPesqExerTBLLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spPesqExer, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesqExerTBLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
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
                .addGap(44, 44, 44)
                .addGroup(pnPesqExerTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnPesqExerLayout = new javax.swing.GroupLayout(pnPesqExer);
        pnPesqExer.setLayout(pnPesqExerLayout);
        pnPesqExerLayout.setHorizontalGroup(
            pnPesqExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPesqExerTBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnPesqExerLayout.createSequentialGroup()
                .addComponent(lblTituloPesqExer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPesqExerLayout.setVerticalGroup(
            pnPesqExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqExerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPesqExer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPesqExerTBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPainel.addTab("Pesquisar Exercício", pnPesqExer);

        pnRegTipoExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloRegTipoExer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloRegTipoExer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegTipoExer.setText("Registro de Tipo de Exercício");

        tfNomeExercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Exercício/Atividade(ex: natação)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfSubCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub-Categoria(ex: nado peito/borboleta)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfKcalHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kcal gasta por hora (Kcal/hora)*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfKcalHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfKcalHoraKeyTyped(evt);
            }
        });

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
            .addComponent(lblTituloRegTipoExer, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegTipoExerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKcalHora, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnRegTipoExerLayout.createSequentialGroup()
                        .addComponent(btnFecharRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnSalvarRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
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
                .addGap(265, 265, 265)
                .addGroup(pnRegTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharRegTipoExer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbPainel.addTab("Registrar Tipo de Exercício", pnRegTipoExer);

        pnPesqTipoExer.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloTipoNovo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTituloTipoNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBuscaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelDeRolagemNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnExerciciosNovoLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnExcluirNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnEditarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
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
                .addGap(45, 45, 45)
                .addGroup(pnExerciciosNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnPesqTipoExerLayout = new javax.swing.GroupLayout(pnPesqTipoExer);
        pnPesqTipoExer.setLayout(pnPesqTipoExerLayout);
        pnPesqTipoExerLayout.setHorizontalGroup(
            pnPesqTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnExerciciosNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTituloTipoNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPesqTipoExerLayout.setVerticalGroup(
            pnPesqTipoExerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesqTipoExerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTituloTipoNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnExerciciosNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPainel.addTab("Pesquisar Tipo de Exercício", pnPesqTipoExer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPainel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (isSameCBNull()
                || isVazioTF(tffData)
                || isVazioTF(tfTipoExercicio)
                || isVazioTF(tfReacaoCorporal)
                || isVazioCB(cbTempoHoras)
                || isVazioCB(cbTempoMinutos)
                || isVazioCB(cbIntensidade)
                || isVazioTF(tfKcalExer)
                || isVazioTF(tfKcalTotal)) {
            JOptionPane.showInternalMessageDialog(rootPane, "Preencha todos os campos obrigatórios!");
        } else {
            //cria um novo exercício
            Exercicio exe = new Exercicio();
            //preeche os dados do novo exercício
            String[] data = tffData.getText().trim().split("/"); // [dia, mes, ano]
            exe.data = java.sql.Date.valueOf(String.format("%s-%s-%s", data[2], data[1], data[0])); // ano-mes-dia
            exe.tipoExercicio = Integer.parseInt(tffCodTipoExer.getText());
            exe.reacaoCorporal = Integer.parseInt(tffCodReacaoCorpo.getText());
            exe.tempo = converteHora(cbTempoHoras, cbTempoMinutos);
            exe.intensidade = cbIntensidade.getSelectedItem().toString();
            exe.kcalTotal = Integer.parseInt(tfKcalTotal.getText());
            exe.status = "ativo";
            //verifica se é um novo registro e efetua o salvamento
            if (exePadrao == null) {
                Integer id = daoE.salvar(exe);
                //se o id não for nulo, salva
                if (id != null) {
                    exe.id = id;
                    JOptionPane.showInternalMessageDialog(rootPane, "O registro foi salvo com sucesso!");
                } else {
                    JOptionPane.showInternalMessageDialog(rootPane, "Ocorreu um erro ao salvar o registro!");
                }
            } else {
                //se o id não for nulo (consulta -> atualização), atualiza
                exe.id = exePadrao.id;
                if (daoE.atualizar(exe)) {
                    exe.id = id;
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    btnSalvar.setText("Salvar");
                    exePadrao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao atualizar!");
                }
            }
            cleanExe();
            updateExe();
        }
        //filtro = tfBusca.getText().trim();
        //updateExe();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharRegTipoExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharRegTipoExerActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharRegTipoExerActionPerformed

    private void btnSalvarRegTipoExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRegTipoExerActionPerformed
        if ((isVazioTF(tfNomeExercicio)
                || isVazioTF(tfSubCategoria)
                || isVazioTF(tfKcalHora))) {
            JOptionPane.showInternalMessageDialog(rootPane, "Preencha todos os campos obrigatórios!");
        } else {
            TipoExercicio t = new TipoExercicio();
            t.descricao = tfNomeExercicio.getText();
            t.subDescricao = tfSubCategoria.getText();
            t.kcal = Integer.parseInt(tfKcalHora.getText());
            t.status = "ativo";

            if (tipoExePadrao == null) {
                Integer id = daoTE.salvar(t);
                if (id != null) {
                    t.id = id;
                    JOptionPane.showInternalMessageDialog(rootPane, "O registro foi salvo com sucesso!");
                } else {
                    JOptionPane.showInternalMessageDialog(rootPane, "Ocorreu um erro ao salvar o registro!");
                }
            } else {
                t.id = tipoExePadrao.id;
                if (daoTE.atualizar(t)) {
                    t.id = id;
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    btnSalvarRegTipoExer.setText("Salvar");
                    tipoExePadrao = null;
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao atualizar!");
                }
            }
            cleanTipoExe();
            updateTipoExe();
        }
        //filtro = tfBuscaNovo.getText().trim();
        //updateTipoExe();
    }//GEN-LAST:event_btnSalvarRegTipoExerActionPerformed
    private void updateExe(){
        new ExercicioDAO().popularTabela(tblResumo, tfBusca.getText());
    }
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        updateExe();
        //new ExercicioDAO().popularTabela(tblResumo, tfBusca.getText());
        //filtro = tfBusca.getText().trim();
        //updateExe();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnSalvar.setText("Atualizar");
        //id = getValueAtExe(tblResumo.getSelectedRow()).id;
        String idString = String.valueOf(tblResumo.getValueAt(tblResumo.getSelectedRow(), 0));
        id = Integer.parseInt(idString);
        exePadrao = daoE.consultar(id);
        
        if (exePadrao != null) {
            tffData.setText(ajustaDataDMA(exePadrao.data.toString()));
            tffCodTipoExer.setText(String.valueOf(exePadrao.tipoExercicio));
            verificarTipoExercicio();
            tffCodReacaoCorpo.setText(String.valueOf(exePadrao.reacaoCorporal));
            verificarReacaoCorporal();
            System.out.println("");
            String[] time = exePadrao.tempo.toString().split(":");
            cbTempoHoras.setSelectedIndex(Integer.parseInt(time[0]));
            cbTempoMinutos.setSelectedIndex(Integer.parseInt(time[1]));
            cbIntensidade.setSelectedItem(exePadrao.intensidade);
            tfKcalTotal.setText(String.valueOf(exePadrao.kcalTotal));

            tbPainel.setSelectedIndex(0);

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
    private void updateTipoExe(){
        new TipoExercicioDAO().popularTabela(tblResumoNovo, tfBuscaNovo.getText());
    }
    private void btnPesquisarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNovoActionPerformed
        updateTipoExe();
        //new TipoExercicioDAO().popularTabela(tblResumoNovo, tfBuscaNovo.getText());
        //filtro = tfBusca.getText().trim();
        //updateTipoExe();
    }//GEN-LAST:event_btnPesquisarNovoActionPerformed

    private void btnEditarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNovoActionPerformed
        btnSalvarRegTipoExer.setText("Atualizar");
        //id = getValueAtTipoExe(tblResumoNovo.getSelectedRow()).id;
        String idString = String.valueOf(tblResumoNovo.getValueAt(tblResumoNovo.getSelectedRow(), 0));
        id = Integer.parseInt(idString);
        
        tipoExePadrao = daoTE.consultar(id);

        if (tipoExePadrao != null) {
            tfNomeExercicio.setText(tipoExePadrao.descricao);
            tfSubCategoria.setText(tipoExePadrao.subDescricao);
            tfKcalHora.setText(String.valueOf(tipoExePadrao.kcal));

            tbPainel.setSelectedIndex(2);

            tfNomeExercicio.requestFocus();
        }
    }//GEN-LAST:event_btnEditarNovoActionPerformed

    private void btnExcluirNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirNovoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(tblResumoNovo.getValueAt(tblResumoNovo.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            TipoExercicioDAO tipoExeDAO = new TipoExercicioDAO();

            if (tipoExeDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                updateTipoExe();
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro.");
            }
        }
    }//GEN-LAST:event_btnExcluirNovoActionPerformed

    private void tffDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataFocusLost
        if (isDataVazia(tffData)) { //VAZIO
            return;
        }
        if (!(isDataValida(tffData))) {//INVALIDO
            tffData.setForeground(Color.RED);
            return;
        } //VALIDO
        tffData.setForeground(Color.BLUE);
    }//GEN-LAST:event_tffDataFocusLost

    private void tffDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffDataKeyTyped

    private void lblPesqTipoExerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesqTipoExerMouseClicked
        IfrConsulta<TipoExercicio> cons = new IfrConsulta<TipoExercicio>((Frame) getTopLevelAncestor(), "Tipo Exercício") {
            @Override
            public TableDataModel<TipoExercicio> getDataModel() {
                return new TableDataModel<TipoExercicio>() {
                    @Override
                    public List<TipoExercicio> getData() {
                        ArrayList<TipoExercicio> tipoExer;
                        if (!filtro.isEmpty()) {
                            tipoExer = new TipoExercicioDAO().consultar(filtro);
                        } else {
                            tipoExer = new TipoExercicioDAO().consultarTodos();
                        }
                        if (tipoExer == null) {
                            tipoExer = new ArrayList<>();
                        }
                        return tipoExer;
                    }

                    @Override
                    public String[] getHeader() {
                        return new String[]{"Código", "Descrição", "Sub-Descrição", "Kcal"};
                    }

                    @Override
                    public Object[] toTableRow(TipoExercicio t) {
                        return new Object[]{t.id, t.descricao, t.subDescricao, t.kcal};
                    }
                };
            }

            @Override
            public void select(TipoExercicio t) {
                tipoExePadrao = t;
                tffCodTipoExer.setText(tipoExePadrao.id.toString());
                tfTipoExercicio.setText(tipoExePadrao.descricao);
                tfSubExercicio.setText(tipoExePadrao.subDescricao);
                tfKcalExer.setText(String.valueOf(tipoExePadrao.kcal));
                dispose();
            }
        };
        cons.setVisible(true);
    }//GEN-LAST:event_lblPesqTipoExerMouseClicked

    private void lblPesqReacaoCorporalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesqReacaoCorporalMouseClicked
        IfrConsulta<ReacaoCorporal> cons = new IfrConsulta<ReacaoCorporal>((Frame) getTopLevelAncestor(), "Reação Corporal") {
            @Override
            public TableDataModel<ReacaoCorporal> getDataModel() {
                return new TableDataModel<ReacaoCorporal>() {
                    @Override
                    public List<ReacaoCorporal> getData() {
                        ArrayList<ReacaoCorporal> rc;
                        if (!filtro.isEmpty()) {
                            rc = new ReacaoCorporalDAO().consultar(filtro);
                        } else {
                            rc = new ReacaoCorporalDAO().consultarTodos();
                        }
                        if (rc == null) {
                            rc = new ArrayList<>();
                        }
                        return rc;
                    }

                    @Override
                    public String[] getHeader() {
                        return new String[]{"Código", "Nome"};
                    }

                    @Override
                    public Object[] toTableRow(ReacaoCorporal t) {
                        return new Object[]{t.id, t.nome};
                    }
                };
            }

            @Override
            public void select(ReacaoCorporal t) {
                rcPadrao = t;
                tffCodReacaoCorpo.setText(rcPadrao.id.toString());
                tfReacaoCorporal.setText(rcPadrao.nome);
                dispose();
            }
        };
        cons.setVisible(true);
    }//GEN-LAST:event_lblPesqReacaoCorporalMouseClicked

    private void tffCodTipoExerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodTipoExerFocusLost
        verificarTipoExercicio();
    }//GEN-LAST:event_tffCodTipoExerFocusLost

    private void tffCodReacaoCorpoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCodReacaoCorpoFocusLost
        verificarReacaoCorporal();
    }//GEN-LAST:event_tffCodReacaoCorpoFocusLost
    private void verificarTipoExercicio(){
        TipoExercicio t = daoTE.consultar(Integer.parseInt(tffCodTipoExer.getText()));
        if (t != null) {
            tipoExePadrao = t;
            tfTipoExercicio.setText(t.descricao);
            tfSubExercicio.setText(t.subDescricao);
            tfKcalExer.setText(String.valueOf(t.kcal));
        }
    }
    
    private void verificarReacaoCorporal(){
        ReacaoCorporal t = daoRC.consultar(Integer.parseInt(tffCodReacaoCorpo.getText()));
        if (t != null) {
            rcPadrao = t;
            tfReacaoCorporal.setText(t.nome);
        }
    }
    private void cbTempoHorasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbTempoHorasFocusLost
        verificaPreenchidos();
    }//GEN-LAST:event_cbTempoHorasFocusLost

    private void cbTempoMinutosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbTempoMinutosFocusLost
        verificaPreenchidos();
    }//GEN-LAST:event_cbTempoMinutosFocusLost

    private void cbIntensidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbIntensidadeFocusLost
        verificaPreenchidos();
    }//GEN-LAST:event_cbIntensidadeFocusLost

    private void tfKcalHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKcalHoraKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfKcalHoraKeyTyped

    private void tffCodTipoExerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffCodTipoExerKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffCodTipoExerKeyTyped

    private void tffCodReacaoCorpoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffCodReacaoCorpoKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffCodReacaoCorpoKeyTyped
    private void cleanExe() {
        tffData.setText("");
        tffCodTipoExer.setText("");
        tffCodReacaoCorpo.setText("");
        tfTipoExercicio.setText("");
        tfSubExercicio.setText("");
        tfReacaoCorporal.setText("");
        cbTempoHoras.setSelectedIndex(0);
        cbTempoMinutos.setSelectedIndex(0);
        cbIntensidade.setSelectedIndex(0);
        tfKcalExer.setText("");
        tfKcalTotal.setText("");
    }

    private void cleanTipoExe() {
        tfNomeExercicio.setText("");
        tfSubCategoria.setText("");
        tfKcalHora.setText("");
    }

    private void verificaPreenchidos() {
        if ((!(isVazioCB(cbTempoHoras)) && !(isVazioCB(cbTempoMinutos))) && !isSameCBNull() && !(isVazioCB(cbIntensidade))) {
            calculaKcalTotal();
        }
    }

    private void calculaKcalTotal() {
        double a = (calculaValorHoras() + calculaValorMinutos()) * calculaIntensidade();
        tfKcalTotal.setText(((int) a) + "");
    }

    private Float calculaIntensidade() {
        float mtp = 0;
        int intense = cbIntensidade.getSelectedIndex();
        switch (intense) {
            case 1:
                mtp = 0.8f;
                break;
            case 2:
                mtp = 1f;
                break;
            case 3:
                mtp = 1.2f;
                break;
        }
        return mtp;
    }

    private Integer calculaValorHoras() {
        int valor = Integer.parseInt((String) cbTempoHoras.getSelectedItem());
        int kcal = Integer.parseInt(tfKcalExer.getText());
        int valorResultante = 0;
        switch (valor) {
            case 0:
                valorResultante = 0;
                break;
            case 1:
                valorResultante = kcal * 1;
                break;
            case 2:
                valorResultante = kcal * 2;
                break;
            case 3:
                valorResultante = kcal * 3;
                break;
            case 4:
                valorResultante = kcal * 4;
                break;
            case 5:
                valorResultante = kcal * 5;
                break;
            case 6:
                valorResultante = kcal * 6;
                break;
            case 7:
                valorResultante = kcal * 7;
                break;
            case 8:
                valorResultante = kcal * 8;
                break;
        }
        return valorResultante;
    }

    private Integer calculaValorMinutos() {
        int valor = Integer.parseInt((String) cbTempoMinutos.getSelectedItem());
        int kcal = Integer.parseInt(tfKcalExer.getText());
        int valorResultante = 0;
        switch (valor) {
            case 0:
                valorResultante = 0;
                break;
            case 5:
                valorResultante = (kcal / 11) * 1;
                break;
            case 10:
                valorResultante = (kcal / 11) * 2;
                break;
            case 15:
                valorResultante = (kcal / 11) * 3;
                break;
            case 20:
                valorResultante = (kcal / 11) * 4;
                break;
            case 25:
                valorResultante = (kcal / 11) * 5;
                break;
            case 35:
                valorResultante = (kcal / 11) * 6;
                break;
            case 40:
                valorResultante = (kcal / 11) * 7;
                break;
            case 45:
                valorResultante = (kcal / 11) * 8;
                break;
            case 50:
                valorResultante = (kcal / 11) * 9;
                break;
            case 55:
                valorResultante = (kcal / 11) * 10;
                break;
        }
        return valorResultante;
    }

    private boolean isSameCBNull() {
        boolean a = cbTempoHoras.getSelectedIndex() == 1;
        boolean b = cbTempoMinutos.getSelectedIndex() == 1;
        if (a == true && b == true) {
            JOptionPane.showInternalMessageDialog(rootPane, "As Horas e Minutos não podem ser ambos igual a zero!");
            return true;
        }
        return false;
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
    private javax.swing.JLabel lblPesqReacaoCorporal;
    private javax.swing.JLabel lblPesqTipoExer;
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
    private javax.swing.JTextField tfSubExercicio;
    private javax.swing.JTextField tfTipoExercicio;
    private javax.swing.JFormattedTextField tffCodReacaoCorpo;
    private javax.swing.JFormattedTextField tffCodTipoExer;
    private javax.swing.JFormattedTextField tffData;
    // End of variables declaration//GEN-END:variables
}
