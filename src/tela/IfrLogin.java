package tela;

import dao.UsuarioDAO;
import entidade.Usuario;
import java.awt.Frame;
import javax.swing.JOptionPane;

public final class IfrLogin extends javax.swing.JFrame {

    String login;

    public IfrLogin(java.awt.Frame parent, boolean modal) {
        initComponents();
        lembrarLogin();
        this.setLocationRelativeTo(null);
        
        tfUsuario.setText("naoseiasenhA");
        pfSenha.setText("naoseiasenhA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        imagemHB = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblInfoLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lblEsqueceuSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        lblDica = new javax.swing.JLabel();
        cbxLembrar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HealthBuilder - Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("HealthBuilder - Login"); // NOI18N
        setResizable(false);

        Painel.setBackground(new java.awt.Color(255, 255, 255));

        imagemHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HealthBuilder224x224.jpg"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        lblTitulo.setText("HealthyBuilder");

        lblBemVindo.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        lblBemVindo.setText("Bem-vindo!");

        lblInfoLogin.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        lblInfoLogin.setText("Faça o login utilizando seu usuário e senha:");

        lblUsuario.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        tfUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        lblSenha.setText("Senha");

        pfSenha.setText("naoseiasenhA");
        pfSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        lblEsqueceuSenha.setFont(new java.awt.Font("High Tower Text", 1, 15)); // NOI18N
        lblEsqueceuSenha.setForeground(new java.awt.Color(0, 0, 255));
        lblEsqueceuSenha.setText("Bá, esqueci minha senha");
        lblEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqueceuSenhaMouseClicked(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPergunta.setFont(new java.awt.Font("High Tower Text", 1, 15)); // NOI18N
        lblPergunta.setText("Não possui uma conta?");

        btnRegistro.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        btnRegistro.setText("Registre-se");
        btnRegistro.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        lblDica.setFont(new java.awt.Font("High Tower Text", 1, 15)); // NOI18N
        lblDica.setText("Dica: não compartilhe sua senha com ninguém. Ela é sua identidade!");

        cbxLembrar.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        cbxLembrar.setText("Lembrar-me");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagemHB))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDica, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PainelLayout.createSequentialGroup()
                                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSenha)
                                            .addComponent(lblUsuario))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfUsuario)
                                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PainelLayout.createSequentialGroup()
                                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxLembrar)
                                    .addComponent(lblEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfoLogin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagemHB))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(lblBemVindo)
                        .addGap(18, 18, 18)
                        .addComponent(lblInfoLogin)
                        .addGap(18, 18, 18)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxLembrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblDica, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        IfrRegistroUsuario registro = new IfrRegistroUsuario(new Frame(), true);
        registro.setVisible(true);
        registro.requestFocus();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void lblEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuSenhaMouseClicked
        IfrEsqueceuSenha queceu = new IfrEsqueceuSenha(new Frame(), true);
        queceu.setVisible(true);
        queceu.requestFocus();
    }//GEN-LAST:event_lblEsqueceuSenhaMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Usuario usuario = new UsuarioDAO().autenticar(
                tfUsuario.getText().trim(),
                String.valueOf(pfSenha.getPassword()));
        if (usuario != null) {
            login = tfUsuario.getText();
            new FrmJP(usuario).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void lembrarLogin() {
        if (cbxLembrar.isEnabled()) {
            tfUsuario.setText(login);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JCheckBox cbxLembrar;
    private javax.swing.JLabel imagemHB;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblEsqueceuSenha;
    private javax.swing.JLabel lblInfoLogin;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
