package util;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Verificacoes {

    /**
     * Verifica se esta vazio. Se sim, pinta o fundo de vermelho Aceita
     * JTextField, JFormattedTextField
     *
     * @param txt
     * @return
     */
    public static boolean veVazioTF(JTextField txt) {
        boolean isVazio = false;
        if (txt.getText().isEmpty()) {
            isVazio = true;
            //txt.setBackground(Color.red);
        }
        return isVazio;
    }

    /**
     * Verifica se esta vazio. Se sim, pinta o fundo de vermelho Aceita
     * JPasswordField
     *
     * @param txt
     * @return
     */
    public static boolean veVazioPass(JPasswordField txt) {
        boolean isVazio = false;
        if (txt.getPassword().length == 0) {
            isVazio = true;
            //txt.setBackground(Color.red);
        }
        return isVazio;
    }

    /**
     * Verifica se a ComboBox esta vazia. Se sim, pinta o fundo de vermelho
     *
     * @param cb
     * @return
     */
    public static boolean veVazioCB(JComboBox cb) {
        boolean isVazio = false;
        if (cb.getSelectedIndex() == 0) {
            isVazio = true;
            cb.setBackground(Color.red);
        }
        return isVazio;
    }

    /**
     * Verifica se é um email. Se sim, retorna true; Se não, retorna falso
     *
     * @param email
     * @return
     */
    public static boolean veEmail(String email) {
        if (!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            return false;
        }
        return true;
    }

    public static boolean veDataVazia(JFormattedTextField tff) {
        if (tff.getText().equals("  /  /  ")) {
            return false;
        }
        return true;
    }

    public static boolean veCPFVazio(JFormattedTextField tff) {
        if (tff.getText().equals("   .   .   -  ")) {
            return false;
        }
        return true;
    }

    /**
     * Executa um sql para fazer consulta
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public static ResultSet consultarSQL(String sql) throws SQLException {
        System.out.println("ConsultarSQL: " + sql);
        ResultSet rs = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
        rs.beforeFirst();
        return rs;
    }

    /**
     * Pesquisa se há um código(valor) conforme campo pesquisado, na tabela
     * pesquisada Campo = "select CAMPO" da tabela Tabela do banco de dados
     * Valor = "where CÓDIGO = VALOR" id EXEMPLO: PADRÂO - select CAMPO from
     * TABELA where CODIGO VALOR EXEMPLO: -------- select NOME from USUARIO
     * where CODIGO 1
     *
     * @param campo
     * @param tabela
     * @param valor
     * @return
     */
    public static String pesquisarNomeCampoBD(String campo, String tabela, String valor) {

        if (!valor.isEmpty()) {
            try {
                ResultSet rs = consultarSQL("select " + campo + " from " + tabela + " where CODIGO = " + valor);
                if (rs.next()) {
                    return rs.getString(1);
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Verificacoes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return "";
    }

    /**
     * Pesquisa o valor de um ID de uma tabela/chave estrangeira Campo ("nome")
     * = "select CAMPO" da tabela Tabela (usuario) do banco de dados Valor ("1")
     * = "where CÓDIGO = VALOR" id EXEMPLO: PADRÂO - select CAMPO from TABELA
     * where CODIGO VALOR EXEMPLO: -------- select NOME from USUARIO where
     * CODIGO 1
     *
     * @param campo
     * @param tabela
     * @param tffValor
     * @param tfDescricao
     */
    public static void focusLostAutoComplete(String campo, String tabela, JFormattedTextField tffValor, JTextField tfDescricao) {
        tfDescricao.setText(pesquisarNomeCampoBD(campo, tabela, tffValor.getText()));
        if ((!tffValor.getText().isEmpty())
                && (tfDescricao.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, tabela + " não cadastrado!");
            tffValor.setText("");
        }
    }

    /**
     * Verifica se o que está sendo pressionado é número, se não for ele não
     * automaticamente deleta o que é digitado
     *
     * @param evt
     */
    public static void verificaNumeros(java.awt.event.KeyEvent evt) {
        String numeros = "0123456789";
        if (!(numeros.contains(evt.getKeyChar() + ""))) {
            evt.consume();
        }
    }

    /**
     * Verifica se o que está sendo pressionado é número, se não for ele não
     * automaticamente deleta o que é digitado
     *
     * @param evt
     */
    public static void verificaLetras(java.awt.event.KeyEvent evt) {
        String letras = "abcdefghijklmnopqrstuvwxyzáàãâéèêíìîóòõôúùûABCDEFGHIJKLMNOPQRSTUVWXYZÁÀÃÂÉÈÊÍÌÎÓÒÕÔÚÙÛ";
        if (!(letras.contains(evt.getKeyChar() + ""))) {
            evt.consume();
        }
    }

    public void colocaIcone(JLabel a, String file) {
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/" + file)));
    }
}
