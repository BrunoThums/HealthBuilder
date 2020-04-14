/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthybuilder;
import java.awt.Frame;
import util.ConexaoBD;
import tela.FrmJanelaPrincipal;
import tela.IfrLogin;

/**
 *
 * @author bbt-1
 */
public class HealthyBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // abrir uma tela de Login
                
        // deixa de existir
        if (ConexaoBD.getInstance() != null) {
            System.out.println("abriu");
            new FrmJanelaPrincipal().setVisible(true);
            new IfrLogin(new Frame(), true).setVisible(true);
        } else {
            System.out.println("deu problema");
        }
    }
    
//    private static boolean abrirConexao () {
//          try {
//            String dbdriver = "org.postgresql.Driver";
//            String dburl = "jdbc:postgresql://localhost:5432/automedterca";
//            String dbuser = "postgres";
//            String dbsenha = "postgres";
//
//            // Carrega Driver do Banco de Dados
//            Class.forName(dbdriver);
//
//            if (dbuser.length() != 0) // conexão COM usuário e senha
//            {
//                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
//            } else // conexão SEM usuário e senha
//            {
//                conexao = DriverManager.getConnection(dburl);
//            }
//
//            return true;
//
//        } catch (Exception e) {
//            System.err.println("Erro ao tentar conectar: " + e);
//            return false;
//        }
//    }
}
