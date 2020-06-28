package tela;

import dao.UsuarioDAO;
import entidade.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.ConexaoBD;
import util.Verificacoes;
import static util.Verificacoes.isDataValida;
import static util.Verificacoes.isDataVazia;
import static util.Verificacoes.isEmailValido;
import static util.Verificacoes.isVazioCB;
import static util.Verificacoes.isVazioTF;
import static util.Verificacoes.verificaLetras;
import static util.Verificacoes.verificaNomeComposto;
import static util.Verificacoes.verificaNumeros;

public class IfrPerfil extends javax.swing.JInternalFrame {

    ConexaoBD c = ConexaoBD.getInstance();
    Verificacoes v = new Verificacoes();
    int id = 0;
    Usuario user = null;
    UsuarioDAO userRC = new UsuarioDAO();
    public IfrPerfil() {
        initComponents();
        preencheUsuario();
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
        btnSalvar = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();
        cbSexo = new javax.swing.JComboBox<>();
        lblAviso = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
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
        lblAvisoSaude = new javax.swing.JLabel();
        tffIDUser = new javax.swing.JFormattedTextField();
        lblSenha = new javax.swing.JLabel();

        setTitle("Perfil");

        pnPerfil.setBackground(new java.awt.Color(255, 255, 255));

        lblPerfil.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Usuario32x32.png"))); // NOI18N
        lblPerfil.setText("Perfil");

        pnDadosCadastrais.setBackground(new java.awt.Color(255, 255, 255));

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFocusLost(evt);
            }
        });
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
        tfSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSobrenomeFocusLost(evt);
            }
        });
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

        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });

        tfLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoginFocusLost(evt);
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
        cbSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbSexoFocusLost(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 0, 0));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        cbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        cbEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbEstadoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnDadosCadastraisLayout = new javax.swing.GroupLayout(pnDadosCadastrais);
        pnDadosCadastrais.setLayout(pnDadosCadastraisLayout);
        pnDadosCadastraisLayout.setHorizontalGroup(
            pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 20, Short.MAX_VALUE))
                    .addGroup(pnDadosCadastraisLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tffDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblAvisoSaude.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        lblAvisoSaude.setForeground(new java.awt.Color(255, 0, 0));

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
                    .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                            .addComponent(lblAvisoSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(52, 52, 52)
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
                        .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosSaudeLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnDadosSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfBusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCoxas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(lblAvisoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosSaudeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(btnFecharSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosSaudeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tbDados.addTab("Dados de Saúde", pnDadosSaude);

        tffIDUser.setEditable(false);
        tffIDUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffIDUser.setText(" ");

        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass.png"))); // NOI18N
        lblSenha.setText("Trocar Senha");
        lblSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSenhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSenhaMouseExited(evt);
            }
        });

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
                .addGap(36, 36, 36)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnPerfilLayout.setVerticalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerfilLayout.createSequentialGroup()
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPerfil)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        preencheUsuario();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tffDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffDataNascFocusLost
        if (isDataVazia(tffDataNasc)) { //VAZIO
            avisoVazio("Data de Nascimento");
            return;
        }
        if (!(isDataValida(tffDataNasc))) {//INVALIDO
            tffDataNasc.setForeground(Color.RED);
            avisoIncorreto("Data");
            return;
        } //VALIDO
        tffDataNasc.setForeground(Color.BLUE);
        limpaAviso();
    }//GEN-LAST:event_tffDataNascFocusLost

    private void tfPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesoFocusLost
        calculaIMC();
    }//GEN-LAST:event_tfPesoFocusLost

    private void tfAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAlturaFocusLost
        calculaIMC();
    }//GEN-LAST:event_tfAlturaFocusLost

    private void btnSalvarSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaudeActionPerformed
        if (!(verificaDiferencaUsuario())) {
            atualizaDiferencaUsuario();
            JOptionPane.showMessageDialog(rootPane, "Os dados foram atualizados!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não foi feita nenhuma alteração. Verifique se você alterou algum campo.");
        }
        preencheUsuario();
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
        verificaLetras(evt);
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfSobrenomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSobrenomeKeyTyped
        verificaNomeComposto(evt);
    }//GEN-LAST:event_tfSobrenomeKeyTyped

    private void tfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyTyped
        verificaNomeComposto(evt);
    }//GEN-LAST:event_tfCidadeKeyTyped

    private void tffDataNascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataNascKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffDataNascKeyTyped

    private void tfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesoKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfPesoKeyTyped

    private void tfAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAlturaKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfAlturaKeyTyped

    private void tfCinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCinturaKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfCinturaKeyTyped

    private void tfQuadrilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuadrilKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfQuadrilKeyTyped

    private void tfBustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBustoKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfBustoKeyTyped

    private void tfCoxasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoxasKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tfCoxasKeyTyped

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost
        if (isVazioTF(tfNome)) {
            avisoVazio("Nome");
            return;
        }
        limpaAviso();
    }//GEN-LAST:event_tfNomeFocusLost

    private void tfSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSobrenomeFocusLost
        if (isVazioTF(tfSobrenome)) {
            avisoVazio("Sobrenome");
            return;
        }
        limpaAviso();
    }//GEN-LAST:event_tfSobrenomeFocusLost

    private void cbSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbSexoFocusLost
        if (isVazioCB(cbSexo)) {
            avisoVazio("Sexo");
            return;
        }
        limpaAviso();
    }//GEN-LAST:event_cbSexoFocusLost

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        if (isVazioTF(tfEmail)) {//VAZIO
            avisoVazio("Email");
            tfEmail.setForeground(Color.RED);
            return;
        }
        if (isEmailValido(tfEmail)) {//VALIDO
            if ((c.existeNoBancoDeDados("usuario", FrmJP.usuario.id, "id", "email", tfEmail.getText()))) {//UNICO
                tfEmail.setForeground(Color.blue);
                limpaAviso();
                return;
            } else if (!(c.existeNoBancoDeDados("usuario", "email", tfEmail.getText()))) {//UNICO
                tfEmail.setForeground(Color.blue);
                limpaAviso();
                return;
            }
            avisoIgual("Email");
            tfEmail.setForeground(Color.RED);
            return;
        }//INVALIDO
        avisoIncorreto("Email");
        tfEmail.setForeground(Color.RED);
    }//GEN-LAST:event_tfEmailFocusLost

    private void cbEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbEstadoFocusLost
        if (isVazioCB(cbEstado)) {//VAZIO
            avisoVazio("Estado");
            return;
        }
        limpaAviso();
    }//GEN-LAST:event_cbEstadoFocusLost

    private void tfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusLost
        if (isVazioTF(tfLogin)) {//VAZIO
            avisoVazio("Login");
            tfLogin.setForeground(Color.RED);
            return;
        }
        if (isEmailValido(tfLogin)) {//VALIDO
            if ((c.existeNoBancoDeDados("usuario", FrmJP.usuario.id, "id", "login", tfLogin.getText()))) {//UNICO
                tfLogin.setForeground(Color.blue);
                limpaAviso();
                return;
            } else if (!(c.existeNoBancoDeDados("usuario", "login", tfLogin.getText()))) {//UNICO
                tfLogin.setForeground(Color.blue);
                limpaAviso();
                return;
            }
            avisoIgual("Login");
            tfLogin.setForeground(Color.RED);
            return;
        }//INVALIDO
        avisoIncorreto("Login");
        tfLogin.setForeground(Color.RED);
    }//GEN-LAST:event_tfLoginFocusLost

    private void lblSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSenhaMouseEntered
        colocaIcone(lblSenha, "passChange");
    }//GEN-LAST:event_lblSenhaMouseEntered

    private void lblSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSenhaMouseExited
        colocaIcone(lblSenha, "pass");
    }//GEN-LAST:event_lblSenhaMouseExited

    private void lblSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSenhaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSenhaMouseClicked

    /**
     * calcula o RCQ (Risco Cintura Quadril) e imprime no campo "tfRCQ" o
     * resultado do risco
     */
    void calculaRQC() {
        if ((!tfCintura.getText().isEmpty()) && (!tfQuadril.getText().isEmpty())) {
            int cint = Integer.parseInt(tfCintura.getText());
            int quad = Integer.parseInt(tfQuadril.getText());
            double rqc = cint / quad;
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
            double alt = Integer.parseInt(tfAltura.getText()) / 100d;
            double peso = Integer.parseInt(tfPeso.getText());
            double imc = peso / (alt * alt);
            System.out.println("alt = " + alt + "\npeso = " + peso + "\nimc = " + imc);
            System.out.println("imc = " + (peso / ((alt * alt) / 100)));
            tfIMC.setText(String.format("%.2f", imc));
            System.out.println("imc em string = " + String.valueOf(imc));
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
                cor = new Color(0, 100, 0);
                break;
            case 1:
                cor = Color.RED.darker().darker();
                break;
            case 2:
                cor = Color.RED.darker();
                break;
            case 3:
                cor = Color.RED;
                break;
            case 4:
                cor = Color.RED.brighter();
                break;
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
                break;
            case 1:
                cor = Color.RED.darker();
                break;
            case 2:
                cor = Color.RED;
                break;
            default:
                break;
        }
        tfRCQ.setText(texto);
        tfRCQ.setForeground(cor);
    }

    private void preencheUsuario() {
        Integer id = FrmJP.usuario.id;
        pT(tffIDUser, id.toString());//1
        pT(tfNome, FrmJP.usuario.nome);//2
        pT(tfSobrenome, FrmJP.usuario.sobrenome);//3
        pT(tffDataNasc, FrmJP.usuario.dataNasc.toString());//4
        cbSexo.setSelectedItem(FrmJP.usuario.sexo);//5
        pT(tffCPF, FrmJP.usuario.cpf);//6
        pT(tfEmail, FrmJP.usuario.email);//7
        pT(tfLogin, FrmJP.usuario.login);//8
        cbEstado.setSelectedItem(FrmJP.usuario.estado);//10
        pT(tfCidade, FrmJP.usuario.cidade);//11
        //status
        pT(tfIntolerancia1, FrmJP.usuario.intolerancia);//12
        pT(tfIntolerancia2, FrmJP.usuario.intolerancia1);//13
        cbMetabolismo.setSelectedItem(FrmJP.usuario.metabolismo);//14
        pT(tfAlergia1, FrmJP.usuario.alergia);//15
        pT(tfAlergia2, FrmJP.usuario.alergia1);//16
        pT(tfPeso, FrmJP.usuario.peso.toString());//17
        pT(tfAltura, FrmJP.usuario.altura.toString());//18
        pT(tfIMC, FrmJP.usuario.imc.toString());//19
        pT(tfStatusImc, FrmJP.usuario.statusimc);//20
        pT(tfCintura, FrmJP.usuario.cintura.toString());//21
        pT(tfQuadril, FrmJP.usuario.quadril.toString());//22
        pT(tfRCQ, FrmJP.usuario.statusrcq.toString());//23
        pT(tfBusto, FrmJP.usuario.busto.toString());//24
        pT(tfCoxas, FrmJP.usuario.coxa.toString());//25
    }

    /**
     * Coloca todos valores do Usuario da tela em um array
     *
     * @return
     */
    private ArrayList getUsuarioPreenchido() {
        ArrayList z = new ArrayList();
        z.add(tfNome.getText());//1
        z.add(tfSobrenome.getText());//2
        z.add(tffDataNasc.getText());//3
        z.add(cbSexo.getSelectedItem());//4
        //cpf
        z.add(tfEmail.getText());//5
        z.add(tfLogin.getText());//6
        //senha
        z.add(cbEstado.getSelectedItem());//7
        z.add(tfCidade.getText());//8
        //status
        z.add(tfIntolerancia1.getText());//9
        z.add(tfIntolerancia2.getText());//10
        z.add(cbMetabolismo.getSelectedItem());//11
        z.add(tfAlergia1.getText());//12
        z.add(tfAlergia2.getText());//13
        z.add(tfStatusImc.getText());//14
        z.add(tfPeso.getText());//15
        z.add(tfAltura.getText());//16
        z.add(tfIMC.getText());//17
        z.add(tfCintura.getText());//18
        z.add(tfQuadril.getText());//19
        z.add(tfRCQ.getText());//20
        z.add(tfBusto.getText());//21
        z.add(tfCoxas.getText());//22
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
        z.add(FrmJP.usuario.dataNasc);//3
        z.add(FrmJP.usuario.sexo);//4
        //cpf
        z.add(FrmJP.usuario.email);//5
        z.add(FrmJP.usuario.login);//6
        //senha
        z.add(FrmJP.usuario.estado);//7
        z.add(FrmJP.usuario.cidade);//8
        //status
        z.add(FrmJP.usuario.intolerancia);//9
        z.add(FrmJP.usuario.intolerancia1);//10
        z.add(FrmJP.usuario.metabolismo);//11
        z.add(FrmJP.usuario.alergia);//12
        z.add(FrmJP.usuario.alergia1);//13
        z.add(FrmJP.usuario.statusimc);//14
        z.add(FrmJP.usuario.peso);//15
        z.add(FrmJP.usuario.altura);//16
        z.add(FrmJP.usuario.imc);//17
        z.add(FrmJP.usuario.cintura);//18
        z.add(FrmJP.usuario.quadril);//19
        z.add(FrmJP.usuario.statusrcq);//20
        z.add(FrmJP.usuario.busto);//21
        z.add(FrmJP.usuario.coxa);//22
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
                case 0:
                    user.atualizarParam(id, "nome", (String) b.get(i));
                    break;
                case 1:
                    user.atualizarParam(id, "sobrenome", (String) b.get(i));
                    break;
                case 2:
                    user.atualizarParam(id, "dataNasc", (String) b.get(i));
                    break;
                case 3:
                    user.atualizarParam(id, "sexo", (String) b.get(i));
                    break;
                case 4:
                    user.atualizarParam(id, "email", (String) b.get(i));
                    break;
                case 5:
                    user.atualizarParam(id, "login", (String) b.get(i));
                    break;
                case 6:
                    user.atualizarParam(id, "estado", (String) b.get(i));
                    break;
                case 7:
                    user.atualizarParam(id, "cidade", (String) b.get(i));
                    break;
                case 8:
                    user.atualizarParam(id, "intolerancia", (String) b.get(i));
                    break;
                case 9:
                    user.atualizarParam(id, "intolerancia1", (String) b.get(i));
                    break;
                case 10:
                    user.atualizarParam(id, "metabolismo", (String) b.get(i));
                    break;
                case 11:
                    user.atualizarParam(id, "alergia", (String) b.get(i));
                    break;
                case 12:
                    user.atualizarParam(id, "alergia1", (String) b.get(i));
                    break;
                case 13:
                    user.atualizarParam(id, "statusimc", (String) b.get(i));
                    break;
                case 14:
                    user.atualizarParam(id, "peso", (String) b.get(i));
                    break;
                case 15:
                    user.atualizarParam(id, "altura", (String) b.get(i));
                    break;
                case 16:
                    user.atualizarParam(id, "imc", (String) b.get(i));
                    break;
                case 17:
                    user.atualizarParam(id, "cintura", (String) b.get(i));
                    break;
                case 18:
                    user.atualizarParam(id, "quadril", (String) b.get(i));
                    break;
                case 19:
                    user.atualizarParam(id, "statusrcq", (String) b.get(i));
                    break;
                case 20:
                    user.atualizarParam(id, "busto", (String) b.get(i));
                    break;
                case 21:
                    user.atualizarParam(id, "coxa", (String) b.get(i));
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

    /**
     * Coloca uma mensagem no campo lblAviso com o campo passado como parâmetro,
     * informando que não pode ser nulo
     *
     * @param campo
     */
    private void avisoVazio(String campo) {
        lblAviso.setText("O campo " + campo + " não pode ser vazio. Preencha-o");
    }

    /**
     * Coloca uma mensagem no campo lblAviso com o campo passado como parâmetro,
     * informando que está incorreto
     *
     * @param campo
     */
    private void avisoIncorreto(String campo) {
        lblAviso.setText("O campo " + campo + " está inválido. Preencha corretamente");
    }

    /**
     * Coloca uma mensagem no campo lblAviso com o campo passado como parâmetro,
     * informando que está igual a algum campo unico no banco de dados. Tais
     * como CPF, EMAIL, LOGIN
     *
     * @param campo
     */
    private void avisoIgual(String dado) {
        lblAviso.setText("O " + dado + " já foi utilizado");
    }

    /**
     * Limpa o campo lblAviso
     *
     * @param campo
     */
    private void limpaAviso() {
        lblAviso.setText("");
    }

    public void colocaIcone(JLabel a, String file) {
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/" + file + ".png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JToggleButton btnFecharSaude;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JToggleButton btnSalvarSaude;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbMetabolismo;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblAvisoSaude;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
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
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfIntolerancia1;
    private javax.swing.JTextField tfIntolerancia2;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
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
