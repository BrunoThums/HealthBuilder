package tela;

import dao.UsuarioDAO;
import entidade.Usuario;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import util.ConexaoBD;
import util.Formatacao;
import static util.Formatacao.parseDMADate;
import static util.Verificacoes.isCPFValido;
import static util.Verificacoes.isCPFVazio;
import static util.Verificacoes.isDataValida;
import static util.Verificacoes.isDataVazia;
import static util.Verificacoes.isEmailValido;
import static util.Verificacoes.isVazioCB;
import static util.Verificacoes.isVazioPass;
import static util.Verificacoes.isVazioTF;
import static util.Verificacoes.verificaLetras;
import static util.Verificacoes.verificaNomeComposto;
import static util.Verificacoes.verificaNumeros;

public class IfrRegistroUsuario extends javax.swing.JDialog {

    ConexaoBD c = ConexaoBD.getInstance();

    public IfrRegistroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Usuario32x32.png")));
        Formatacao.formatarData((JFormattedTextField) tffDataNasc);
        Formatacao.formatarCpf((JFormattedTextField) tffCPF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPainel = new javax.swing.JPanel();
        tfSobrenome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        pfSenha2 = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JToggleButton();
        lblTitulo = new javax.swing.JLabel();
        tffDataNasc = new javax.swing.JFormattedTextField();
        tffCPF = new javax.swing.JFormattedTextField();
        tfLogin = new javax.swing.JTextField();
        btnFechar = new javax.swing.JToggleButton();
        tfNome = new javax.swing.JTextField();
        lblAviso = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registre-se");

        pnPainel.setBackground(new java.awt.Color(255, 255, 255));

        tfSobrenome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobrenome*", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
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

        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });

        pfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        pfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfSenhaFocusLost(evt);
            }
        });

        pfSenha2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        pfSenha2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfSenha2FocusLost(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Usuario32x32.png"))); // NOI18N
        lblTitulo.setText("Registre-se");

        tffDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Nascimento*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
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

        tffCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tffCPF.setText(" ");
        tffCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCPFFocusLost(evt);
            }
        });
        tffCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffCPFKeyTyped(evt);
            }
        });

        tfLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        tfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoginFocusLost(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setBorder(new javax.swing.border.MatteBorder(null));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome*", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
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

        lblAviso.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 0, 0));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Prefiro não responder" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo*", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Calligraphy", 0, 11))); // NOI18N
        cbSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbSexoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnPainelLayout = new javax.swing.GroupLayout(pnPainel);
        pnPainel.setLayout(pnPainelLayout);
        pnPainelLayout.setHorizontalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(pnPainelLayout.createSequentialGroup()
                        .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnPainelLayout.createSequentialGroup()
                        .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPainelLayout.createSequentialGroup()
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPainelLayout.createSequentialGroup()
                                        .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pfSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPainelLayout.createSequentialGroup()
                                        .addComponent(tffDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnPainelLayout.createSequentialGroup()
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnPainelLayout.setVerticalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!(isVazioTF(tfNome)
                || isVazioTF(tfSobrenome)
                || isVazioTF(tfEmail)
                || isVazioTF(tfLogin)
                || isVazioTF(tffDataNasc)
                || isVazioTF(tffCPF)
                || isVazioPass(pfSenha)
                || isVazioPass(pfSenha2)
                || isVazioCB(cbSexo))) {
            limpaAviso();

            Usuario usuario = new Usuario();
            usuario.nome = tfNome.getText();
            usuario.sobrenome = tfSobrenome.getText().trim();
            usuario.dataNasc = parseDMADate(tffDataNasc.getText().trim());
            usuario.sexo = cbSexo.getSelectedItem().toString();
            usuario.cpf = tffCPF.getText();
            usuario.email = tfEmail.getText().trim();
            usuario.login = tfLogin.getText().trim().toLowerCase();
            usuario.senha = String.valueOf(pfSenha.getPassword());// #NAO USE TOSTRING
            usuario.estado = "";
            usuario.cidade = "";
            usuario.status = "ativo";
            usuario.intolerancia = "";
            usuario.intolerancia1 = "";
            usuario.metabolismo = "";
            usuario.alergia = "";
            usuario.alergia1 = "";
            usuario.peso = usuario.altura = usuario.imc = 0f;
            usuario.statusimc = "";
            usuario.cintura = usuario.quadril = 0;
            usuario.statusrcq = "";
            usuario.busto = usuario.coxa = 0;
            System.out.println(usuario);

            Integer id = new UsuarioDAO().salvar(usuario);
            if (id != null) {
                usuario.id = id;
                JOptionPane.showMessageDialog(rootPane, "O registro foi salvo com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao salvar o registro!");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos obrigatórios!");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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

    private void tffCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCPFFocusLost
        System.out.println("cpf: " + tffCPF.getText() + "");
        if (isCPFVazio(tffCPF)) {//VAZIO
            avisoVazio("CPF");
            return;
        }
        if (!isCPFValido(tffCPF)) {//VALIDO
            if (!(c.existeNoBancoDeDados("usuario", "cpf", tffCPF.getText()))) {//INVALIDO
                tffCPF.setForeground(Color.blue);
                limpaAviso();
                return;
            }//VALIDO
            avisoIgual("CPF");
            tffCPF.setForeground(Color.RED);
        }
    }//GEN-LAST:event_tffCPFFocusLost

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void pfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusLost
        String senha = String.valueOf(pfSenha.getPassword());
        String confirmacao = String.valueOf(pfSenha2.getPassword());
        if (isVazioPass(pfSenha)) {//VAZIO
            avisoVazio("Senha");
            return;
        }
        if (!((isVazioPass(pfSenha2)) && !(isVazioPass(pfSenha)))) {//AMBOS PREENCHIDOS
            if (!(senha.equals(confirmacao))) {//INVALIDO
                pfSenha.setForeground(Color.red);
                pfSenha2.setForeground(Color.red);
                lblAviso.setText("As senhas não coincidem! Preencha corretamente");
                return;
            }
        }//VALIDO
        pfSenha.setForeground(Color.blue);
        pfSenha2.setForeground(Color.blue);
        limpaAviso();
    }//GEN-LAST:event_pfSenhaFocusLost

    private void pfSenha2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenha2FocusLost
        String senha = String.valueOf(pfSenha.getPassword());
        String confirmacao = String.valueOf(pfSenha2.getPassword());
        if (isVazioPass(pfSenha2)) {//VAZIO
            avisoVazio("Senha");
            return;
        }
        if (!((isVazioPass(pfSenha2)) && !(isVazioPass(pfSenha)))) {//AMBOS PREENCHIDOS
            if (!(senha.equals(confirmacao))) {//INVALIDO
                pfSenha.setForeground(Color.red);
                pfSenha2.setForeground(Color.red);
                lblAviso.setText("As senhas não coincidem! Preencha corretamente");
                return;
            }
        }//VALIDO
        pfSenha.setForeground(Color.blue);
        pfSenha2.setForeground(Color.blue);
        limpaAviso();
    }//GEN-LAST:event_pfSenha2FocusLost

    private void tfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusLost
        if (isVazioTF(tfLogin)) {//VAZIO
            avisoVazio("Login");
            tfLogin.setForeground(Color.RED);
            return;
        }

        if (c.existeNoBancoDeDados("usuario", "login", tfLogin.getText())) {//INVALIDO
            avisoIgual("Login");
            tfLogin.setForeground(Color.RED);
            return;
        }//UNICO
        tfLogin.setForeground(Color.BLUE);
        limpaAviso();
    }//GEN-LAST:event_tfLoginFocusLost

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        if (isVazioTF(tfEmail)) {//VAZIO
            avisoVazio("Email");
            tfEmail.setForeground(Color.RED);
            return;
        }
        if (isEmailValido(tfEmail)) {//VALIDO
            if (!(c.existeNoBancoDeDados("usuario", "email", tfEmail.getText()))) {//UNICO
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

    private void tfSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSobrenomeFocusLost
        if (isVazioTF(tfSobrenome)) {//VAZIO
            avisoVazio("Sobrenome");
            return;
        }//VALIDO
        tfSobrenome.setForeground(Color.blue);
        limpaAviso();
    }//GEN-LAST:event_tfSobrenomeFocusLost

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost
        if (isVazioTF(tfNome)) {//VAZIO
            avisoVazio("Nome");
            return;
        }//VALIDO
        tfNome.setForeground(Color.blue);
        limpaAviso();
    }//GEN-LAST:event_tfNomeFocusLost

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        verificaLetras(evt);
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfSobrenomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSobrenomeKeyTyped
        verificaNomeComposto(evt);
    }//GEN-LAST:event_tfSobrenomeKeyTyped

    private void tffDataNascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffDataNascKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffDataNascKeyTyped

    private void tffCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffCPFKeyTyped
        verificaNumeros(evt);
    }//GEN-LAST:event_tffCPFKeyTyped

    private void cbSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbSexoFocusLost
        if (isVazioCB(cbSexo)) {//VAZIO
            avisoVazio("Sexo");
            return;
        }
        limpaAviso();
    }//GEN-LAST:event_cbSexoFocusLost

    /**
     * Limpa o campo lblAviso
     *
     * @param campo
     */
    private void limpaAviso() {
        lblAviso.setText("");
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
     * Pesquisa se há um valor igual no banco de dados, conforme campo
     * escolhido. Retorna True se não for igual Retorna False se for igual Campo
     * = objeto (email|nome) Valor = valor do campo (joaquin@a.com|joaquin)
     * Exemplo pesquisaIgual("email", tfEmail.getText())
     *
     * @param campo
     * @param valor
     * @return
     */
    /*private boolean[] pesquisaIgual(Usuario senhor) {
        //where campo = valor
        boolean[] temIgual = new boolean[]{false, false, false};
        
        ArrayList<Usuario> users = new UsuarioDAO().consultarTodos();
        for (Usuario user : users) {
            if(user.cpf.equals(senhor.cpf)){
                temIgual[0] = true;
            } if (user.email.equals(senhor.email)) {
                temIgual[1] = true;
            } if (user.login.equals(senhor.login)) {
                temIgual[2] = true;
            }
        }
        return temIgual;
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPasswordField pfSenha2;
    private javax.swing.JPanel pnPainel;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JFormattedTextField tffCPF;
    private javax.swing.JFormattedTextField tffDataNasc;
    // End of variables declaration//GEN-END:variables
}
