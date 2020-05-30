package tela;

import dao.SaudeUsuarioDAO;
import dao.UsuarioDAO;
import entidade.SaudeUsuario;
import entidade.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import util.Formatacao;
import util.Validacao;
import util.Verificacoes;

public class IfrPerfil extends javax.swing.JInternalFrame {

    SaudeUsuario s = new SaudeUsuario();
    Verificacoes v = new Verificacoes();

    public IfrPerfil() {
        initComponents();
        preencheUsuario();
        preencheSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPerfil = new javax.swing.JPanel();
        lblPerfil = new javax.swing.JLabel();
        tbDados = new javax.swing.JTabbedPane();
        pnDadosCadastrais = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        tffDataNasc = new javax.swing.JFormattedTextField();
        tffCPF = new javax.swing.JFormattedTextField();
        tfEmail = new javax.swing.JTextField();
        tfLogin = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        tfPais = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pnDadosSaude = new javax.swing.JPanel();
        cbMetabolismo = new javax.swing.JComboBox<>();
        tfAltura = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        tfIMC = new javax.swing.JTextField();
        tfIntolerancia1 = new javax.swing.JTextField();
        tfIntolerancia2 = new javax.swing.JTextField();
        tfAlergia1 = new javax.swing.JTextField();
        tfAlergia2 = new javax.swing.JTextField();
        tfStatusImc = new javax.swing.JTextField();
        btnFecharSaude = new javax.swing.JToggleButton();
        tfCintura = new javax.swing.JTextField();
        tfQuadril = new javax.swing.JTextField();
        tfRCQ = new javax.swing.JTextField();
        tfBusto = new javax.swing.JTextField();
        tfCoxas = new javax.swing.JTextField();
        btnSalvarSaude = new javax.swing.JToggleButton();
        tffIDUser = new javax.swing.JFormattedTextField();

        setTitle("Perfil");

        pnPerfil.setBackground(new java.awt.Color(255, 255, 255));

        lblPerfil.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Usuario32x32.png"))); // NOI18N
        lblPerfil.setText("Perfil");

        pnDadosCadastrais.setBackground(new java.awt.Color(255, 255, 255));

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        tfCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCidadeKeyTyped(evt);
            }
        });

        tfSobrenome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobrenome", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSobrenomeKeyTyped(evt);
            }
        });

        tffDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffDataNasc.setText(" ");
        tffDataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffDataNascFocusLost(evt);
            }
        });
        tffDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffDataNascKeyTyped(evt);
            }
        });

        tffCPF.setEditable(false);
        tffCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCPF.setText(" ");
        tffCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCPFFocusLost(evt);
            }
        });

        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        pfSenha.setEditable(false);
        pfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfPais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "País", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPaisKeyTyped(evt);
            }
        });

        tfEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEstadoKeyTyped(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.MatteBorder(null));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setBorder(new javax.swing.border.MatteBorder(null));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Prefiro não responder" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        jLabel1.setText("TrocarSenha");

        javax.swing.GroupLayout pnDadosCadastraisLayout = new javax.swing.GroupLayout(pnDadosCadastrais);
        pnDadosCadastrais.setLayout(pnDadosCadastraisLayout);
        pnDadosCadastraisLayout.setHorizontalGroup(
            pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        pnDadosCadastraisLayout.setVerticalGroup(
            pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(106, 106, 106)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tbDados.addTab("Dados Cadastrais", pnDadosCadastrais);

        pnDadosSaude.setBackground(new java.awt.Color(255, 255, 255));

        cbMetabolismo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Lento", "Normal", "Rápido", " " }));
        cbMetabolismo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metabolismo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Altura (cm)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAlturaFocusLost(evt);
            }
        });
        tfAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAlturaKeyTyped(evt);
            }
        });

        tfPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso (kg)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesoFocusLost(evt);
            }
        });
        tfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesoKeyTyped(evt);
            }
        });

        tfIMC.setEditable(false);
        tfIMC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfIntolerancia1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intolerancia 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfIntolerancia2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intolerancia 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlergia1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alergia 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfAlergia2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alergia 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfStatusImc.setEditable(false);
        tfStatusImc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        btnFecharSaude.setText("Fechar");
        btnFecharSaude.setBorder(new javax.swing.border.MatteBorder(null));
        btnFecharSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSaudeActionPerformed(evt);
            }
        });

        tfCintura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cintura (cm)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfCintura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCinturaFocusLost(evt);
            }
        });
        tfCintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCinturaKeyTyped(evt);
            }
        });

        tfQuadril.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quadril (cm)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfQuadril.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQuadrilFocusLost(evt);
            }
        });
        tfQuadril.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuadrilKeyTyped(evt);
            }
        });

        tfRCQ.setEditable(false);
        tfRCQ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Risco Cintura-Quadril", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N

        tfBusto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busto (cm)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfBusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBustoKeyTyped(evt);
            }
        });

        tfCoxas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coxa (cm)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfCoxas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCoxasKeyTyped(evt);
            }
        });

        btnSalvarSaude.setText("Salvar");
        btnSalvarSaude.setBorder(new javax.swing.border.MatteBorder(null));
        btnSalvarSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSaudeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDadosSaudeLayout = new javax.swing.GroupLayout(pnDadosSaude);
        pnDadosSaude.setLayout(pnDadosSaudeLayout);
        pnDadosSaudeLayout.setHorizontalGroup(
            pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                        .addComponent(tfBusto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCoxas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                        .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlergia1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIntolerancia1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                                .addComponent(tfAlergia2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfStatusImc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                                .addComponent(tfIntolerancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cbMetabolismo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                            .addComponent(btnFecharSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalvarSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                            .addComponent(tfCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfRCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnDadosSaudeLayout.setVerticalGroup(
            pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tfIntolerancia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosSaudeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIntolerancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMetabolismo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlergia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlergia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStatusImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCoxas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosSaudeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFecharSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
        );

        tbDados.addTab("Dados de Saúde", pnDadosSaude);

        tffIDUser.setEditable(false);
        tffIDUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffIDUser.setText(" ");

        javax.swing.GroupLayout pnPerfilLayout = new javax.swing.GroupLayout(pnPerfil);
        pnPerfil.setLayout(pnPerfilLayout);
        pnPerfilLayout.setHorizontalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbDados, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tffIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        pnPerfilLayout.setVerticalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerfilLayout.createSequentialGroup()
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPerfil)
                    .addComponent(tffIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbDados))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!(verificaDiferencaUsuario())) {
            atualizaDiferencaUsuario();
            JOptionPane.showMessageDialog(rootPane, "Os dados foram atualizados!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não foi feita nenhuma alteração. Verifique se você alterou algum campo.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tffCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCPFFocusLost
        if (tffCPF.getText().trim().length() == 14) {
            if (Validacao.validarCPF(Formatacao.removerFormatacao(tffCPF.getText()))) {
                tffCPF.setForeground(Color.BLUE);
            } else {
                tffCPF.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_tffCPFFocusLost

    private void tffDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataNascFocusLost
        if (tffDataNasc.getText().trim().length() == 10) {
            if (Validacao.validarDataFormatada(tffDataNasc.getText())) {
                tffDataNasc.setForeground(Color.BLUE);
            } else {
                tffDataNasc.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_tffDataNascFocusLost

    private void tfPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesoFocusLost
        calculaIMC();
    }//GEN-LAST:event_tfPesoFocusLost

    private void tfAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAlturaFocusLost
        calculaIMC();
    }//GEN-LAST:event_tfAlturaFocusLost

    private void btnSalvarSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaudeActionPerformed
        if (!(verificaDiferencaSaude())) {
            atualizaDiferencaSaude();
            JOptionPane.showMessageDialog(rootPane, "Os dados foram atualizados!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não foi feita nenhuma alteração. Verifique se você alterou algum campo.");
        }
    }//GEN-LAST:event_btnSalvarSaudeActionPerformed

    private void btnFecharSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSaudeActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharSaudeActionPerformed

    private void tfCinturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCinturaFocusLost
        calculaRQC();
    }//GEN-LAST:event_tfCinturaFocusLost

    private void tfQuadrilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQuadrilFocusLost
        calculaRQC();
    }//GEN-LAST:event_tfQuadrilFocusLost

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        v.verificaLetras(evt);
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfSobrenomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSobrenomeKeyTyped
        v.verificaLetras(evt);
    }//GEN-LAST:event_tfSobrenomeKeyTyped

    private void tfPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPaisKeyTyped
        v.verificaLetras(evt);
    }//GEN-LAST:event_tfPaisKeyTyped

    private void tfEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEstadoKeyTyped
        v.verificaLetras(evt);
    }//GEN-LAST:event_tfEstadoKeyTyped

    private void tfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyTyped
        v.verificaLetras(evt);
    }//GEN-LAST:event_tfCidadeKeyTyped

    private void tffDataNascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataNascKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tffDataNascKeyTyped

    private void tfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesoKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfPesoKeyTyped

    private void tfAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAlturaKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfAlturaKeyTyped

    private void tfCinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCinturaKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfCinturaKeyTyped

    private void tfQuadrilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuadrilKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfQuadrilKeyTyped

    private void tfBustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBustoKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfBustoKeyTyped

    private void tfCoxasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoxasKeyTyped
        v.verificaNumeros(evt);
    }//GEN-LAST:event_tfCoxasKeyTyped

    /**
     * calcula o RCQ (Risco Cintura Quadril) e imprime no campo "tfRCQ" o
     * resultado do risco
     */
    void calculaRQC() {
        if ((!tfCintura.getText().isEmpty()) && (!tfQuadril.getText().isEmpty())) {
            double rqc = 0;
            int cint = Integer.parseInt(tfCintura.getText());
            int quad = Integer.parseInt(tfQuadril.getText());
            rqc = cint / quad;
            if (cbSexo.getSelectedItem() == "Masculino") { //se for homem
                if (rqc < 0.95) {
                    tr("Risco Baixo", 0);
                } else if (rqc > 0.96 && rqc < 1) {
                    tr("Risco Moderado", 1);
                } else if (rqc > 1) {
                    tr("Risco Alto", 2);
                }
            } else if (cbSexo.getSelectedItem() == "Feminino") { //se for mulher
                if (rqc <= 0.8) {
                    tr("Risco Baixo", 0);
                } else if (rqc >= 0.81 && rqc <= 0.85) {
                    tr("Risco Moderado", 1);
                } else if (rqc >= 0.86) {
                    tr("Risco Alto", 2);
                }
            }
        }
    }

    /**
     * calcula o IMC, preenche IMC e Status IMC
     */
    void calculaIMC() {
        if ((!tfAltura.getText().isEmpty()) && (!tfPeso.getText().isEmpty())) {
            double imc = 0;
            int alt = Integer.parseInt(tfAltura.getText());
            int peso = Integer.parseInt(tfPeso.getText());
            imc = peso / (alt * alt);
            tfIMC.setText(String.valueOf(imc));
            if (imc < 17) {
                ts("Muito abaixo do peso", 2);
                return;
            } else if (imc >= 17 && imc < 18.49) {
                ts("Abaixo do peso", 1);
                return;
            } else if (imc > 18.5 && imc < 24.99) {
                ts("Peso Normal", 0);
                return;
            } else if (imc > 25 && imc < 29.99) {
                ts("Acima do peso", 1);
                return;
            } else if (imc > 30 && imc < 34.99) {
                ts("Obesidade", 2);
                return;
            } else if (imc > 35 && imc < 39.99) {
                ts("Obesidade Severa", 3);
                return;
            } else if (imc > 40) {
                ts("Obesidade Mórbida", 4);
                return;
            }
        }
    }

    /**
     * Faz a troca do texto do componente "tfStatusImc" e pinta o texto conforme
     * perigo
     *
     * @param texto
     * @param perigo
     */
    void ts(String texto, int perigo) {
        Color cor = null;
        switch (perigo) {
            case 0:
                cor = Color.GREEN;
                return;
            case 1:
                cor = Color.RED.darker().darker();
                return;
            case 2:
                cor = Color.RED.darker();
                return;
            case 3:
                cor = Color.RED;
                return;
            case 4:
                cor = Color.RED.brighter();
                return;
            default:
                break;
        }
        tfStatusImc.setText(texto);
        tfStatusImc.setForeground(cor);
    }

    /**
     * Faz a troca do texto do componente "tfRCQ" e pinta o texto conforme
     * perigo
     *
     * @param texto
     * @param perigo
     */
    void tr(String texto, int perigo) {
        Color cor = null;
        switch (perigo) {
            case 0:
                cor = Color.GREEN;
                return;
            case 1:
                cor = Color.RED.darker();
                return;
            case 2:
                cor = Color.RED;
                return;
            default:
                break;
        }
        tfRCQ.setText(texto);
        tfRCQ.setForeground(cor);
    }

    private void preencheUsuario() {
        Integer id = FrmJP.usuario.id;
        pT(tffIDUser, id.toString());
        pT(tfNome, FrmJP.usuario.nome);
        pT(tfSobrenome, FrmJP.usuario.sobrenome);
        cbSexo.setSelectedItem(FrmJP.usuario.sexo);
        pT(tffCPF, FrmJP.usuario.cpf);
        pT(tfEmail, FrmJP.usuario.email);
        pT(tffDataNasc, FrmJP.usuario.dataNasc.toString());
        pT(tfPais, FrmJP.usuario.pais);
        pT(tfEstado, FrmJP.usuario.estado);
        pT(tfCidade, FrmJP.usuario.cidade);
        pT(tfLogin, FrmJP.usuario.login);
        pT(pfSenha, FrmJP.usuario.senha);
    }

    /**
     * Coloca todos valores do Usuario da tela em um array
     *
     * @return
     */
    private ArrayList getUsuarioPreenchido() {
        ArrayList z = new ArrayList();
        z.add(tfNome.getText());
        z.add(tfSobrenome.getText());
        z.add(cbSexo.getSelectedItem());
        z.add(tfEmail.getText());
        z.add(tffDataNasc.getText());
        z.add(tfPais.getText());
        z.add(tfEstado.getText());
        z.add(tfCidade.getText());
        z.add(tfLogin.getText());
        return z;
    }

    /**
     * Coloca todos valores do Usuario do Banco de Dados em um array
     *
     * @return
     */
    private ArrayList getUsuarioBD() {
        ArrayList z = new ArrayList();
        z.add(FrmJP.usuario.nome);//1
        z.add(FrmJP.usuario.sobrenome);//2
        z.add(FrmJP.usuario.sexo);//3
        z.add(FrmJP.usuario.email);//4
        z.add(FrmJP.usuario.dataNasc);//5
        z.add(FrmJP.usuario.pais);//6
        z.add(FrmJP.usuario.estado);//7
        z.add(FrmJP.usuario.cidade);//8
        z.add(FrmJP.usuario.login);//9
        return z;
    }

    /**
     * Verifica a diferença entre os dois arraylists
     *
     * @param a
     * @param b
     */
    /*nome//1
        sobrenome//2
        sexo//3
        email//4
        dataNasc//5
        pais//6
        estado//7
        cidad;//8
        login//9*/
    private boolean verificaDiferencaUsuario() {
        ArrayList a = getUsuarioBD();
        ArrayList b = getUsuarioPreenchido();
        boolean ok = true;
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i).equals(b.get(i)))) {
                ok = false;
                return false;
            }
        }
        return ok;
    }

    /**
     * Atualiza os dados com o banco de dados
     */
    private void atualizaDiferencaUsuario() {
        ArrayList b = getUsuarioPreenchido();
        UsuarioDAO user = new UsuarioDAO();
        int id = FrmJP.usuario.id;
        for (int i = 0; i < b.size(); i++) {
            switch (i) {
                case 1:
                    user.atualizarParam(id, "nome", (String) b.get(i));
                    break;
                case 2:
                    user.atualizarParam(id, "sobrenome", (String) b.get(i));
                    break;
                case 3:
                    user.atualizarParam(id, "sexo", (String) b.get(i));
                    break;
                case 4:
                    user.atualizarParam(id, "email", (String) b.get(i));
                    break;
                case 5:
                    user.atualizarParam(id, "dataNasc", (String) b.get(i));
                    break;
                case 6:
                    user.atualizarParam(id, "pais", (String) b.get(i));
                    break;
                case 7:
                    user.atualizarParam(id, "estado", (String) b.get(i));
                    break;
                case 8:
                    user.atualizarParam(id, "cidade", (String) b.get(i));
                    break;
                case 9:
                    user.atualizarParam(id, "login", (String) b.get(i));
                    break;
            }
        }
    }

    private void preencheSaude() {
        pT(tfIntolerancia1, s.intolerancia);//1
        pT(tfIntolerancia2, s.intolerancia1);//2
        cbMetabolismo.setSelectedItem(s.metabolismo);//3
        pT(tfAlergia1, s.alergia);//4
        pT(tfAlergia2, s.alergia1);//5
        pT(tfStatusImc, s.statusimc);//6
        pT(tfPeso, s.peso);//7
        pT(tfAltura, s.altura);//8
        pT(tfIMC, s.imc);//9
        pT(tfCintura, s.cintura);//10
        pT(tfQuadril, s.quadril);//11
        pT(tfRCQ, s.statusrcq);//12
        pT(tfBusto, s.busto);//13
        pT(tfCoxas, s.coxa);//14
    }

    private ArrayList getSaudePreenchida() {
        ArrayList z = new ArrayList();
        z.add(tfIntolerancia1.getText());//1
        z.add(tfIntolerancia2.getText());//2
        z.add(cbMetabolismo.getSelectedItem());//3
        z.add(tfAlergia1.getText());//4
        z.add(tfAlergia2.getText());//5
        z.add(tfStatusImc.getText());//6
        z.add(tfPeso.getText());//7
        z.add(tfAltura.getText());//8
        z.add(tfIMC.getText());//9
        z.add(tfCintura.getText());//10
        z.add(tfQuadril.getText());//11
        z.add(tfRCQ.getText());//12
        z.add(tfBusto.getText());//13
        z.add(tfCoxas.getText());//14
        return z;
    }

    private ArrayList getSaudeBD() {
        ArrayList z = new ArrayList();
        z.add(s.intolerancia);//1
        z.add(s.intolerancia1);//2
        z.add(s.metabolismo);//3
        z.add(s.alergia);//4
        z.add(s.alergia1);//5
        z.add(s.statusimc);//6
        z.add(s.peso);//7
        z.add(s.altura);//8
        z.add(s.imc);//9
        z.add(s.cintura);//10
        z.add(s.quadril);//11
        z.add(s.statusrcq);//12
        z.add(s.busto);//13
        z.add(s.coxa);//14
        return z;
    }

    /**
     * Verifica a diferença entre os dois arraylists
     *
     * @param a
     * @param b
     */
    /*intolerancia//1
        intolerancia1//2
        metabolismo//3
        alergia//4
        alergia1//5
        statusimc//6
        peso//7
        altura//8
        imc//9
        cintura//10
        quadril//11
        statusrcq//12
        busto//13
        coxa//14*/
    private boolean verificaDiferencaSaude() {
        ArrayList a = getSaudeBD();
        ArrayList b = getSaudePreenchida();
        boolean ok = true;
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i).equals(b.get(i)))) {
                ok = false;
                return false;
            }
        }
        return ok;
    }

    /**
     * Atualiza os dados com o banco de dados
     */
    private void atualizaDiferencaSaude() {
        ArrayList b = getSaudePreenchida();
        SaudeUsuarioDAO saude = new SaudeUsuarioDAO();
        int id = FrmJP.usuario.id;
        for (int i = 0; i < b.size(); i++) {
            switch (i) {
                case 1:
                    saude.atualizarParam(id, "intolerancia", (String) b.get(i));
                    break;
                case 2:
                    saude.atualizarParam(id, "intolerancia1", (String) b.get(i));
                    break;
                case 3:
                    saude.atualizarParam(id, "metabolismo", (String) b.get(i));
                    break;
                case 4:
                    saude.atualizarParam(id, "alergia", (String) b.get(i));
                    break;
                case 5:
                    saude.atualizarParam(id, "alergia1", (String) b.get(i));
                    break;
                case 6:
                    saude.atualizarParam(id, "statusimc", (String) b.get(i));
                    break;
                case 7:
                    saude.atualizarParam(id, "peso", (String) b.get(i));
                    break;
                case 8:
                    saude.atualizarParam(id, "altura", (String) b.get(i));
                    break;
                case 9:
                    saude.atualizarParam(id, "imc", (String) b.get(i));
                    break;
                case 10:
                    saude.atualizarParam(id, "cintura", (String) b.get(i));
                    break;
                case 11:
                    saude.atualizarParam(id, "quadril", (String) b.get(i));
                    break;
                case 12:
                    saude.atualizarParam(id, "statusrcq", (String) b.get(i));
                    break;
                case 13:
                    saude.atualizarParam(id, "busto", (String) b.get(i));
                    break;
                case 14:
                    saude.atualizarParam(id, "coxa", (String) b.get(i));
                    break;
            }
        }
    }

    /**
     * Preenche um JTextField com um TXT
     *
     * @param a
     * @param txt
     */
    private void pT(JTextField tfCampo, String txt) {
        tfCampo.setText(txt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JToggleButton btnFecharSaude;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JToggleButton btnSalvarSaude;
    private javax.swing.JComboBox<String> cbMetabolismo;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnDadosCadastrais;
    private javax.swing.JPanel pnDadosSaude;
    private javax.swing.JPanel pnPerfil;
    private javax.swing.JTabbedPane tbDados;
    private javax.swing.JTextField tfAlergia1;
    private javax.swing.JTextField tfAlergia2;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfBusto;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCintura;
    private javax.swing.JTextField tfCoxas;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfIntolerancia1;
    private javax.swing.JTextField tfIntolerancia2;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfQuadril;
    private javax.swing.JTextField tfRCQ;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfStatusImc;
    private javax.swing.JFormattedTextField tffCPF;
    private javax.swing.JFormattedTextField tffDataNasc;
    private javax.swing.JFormattedTextField tffIDUser;
    // End of variables declaration//GEN-END:variables
}
