package healthybuilder;

import dao.UsuarioDAO;
import entidade.Usuario;
import java.awt.Frame;
import java.net.URL;
import java.sql.SQLException;
import util.ConexaoBD;
import tela.IfrLogin;

public class HealthBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        System.out.print("Apagando..");
//        ConexaoBD.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM usuario");
//        System.out.println(".");;
//
//        System.out.print("Criando usuario..");
//        Usuario usuario = new Usuario() {
//            {
//                login = "test";
//                senha = "123";
//                cidade = sobrenome = cpf = sexo = pais = nome = estado = "I";
//                dataNasc = new java.sql.Date(System.currentTimeMillis());
//                status = "ativo";
//            }
//        };
//        new UsuarioDAO().salvar(usuario);
//        System.out.println(".");
//
//        System.out.print("Logando..");
//        Usuario autenticado = new UsuarioDAO().autenticar("test", "123");
//        System.out.println(".");
//        System.out.println(autenticado);;;

//        System.exit(0);
        if (ConexaoBD.getInstance() != null) {
            System.out.println("abriu");
            new IfrLogin(new Frame(), true).setVisible(true);
        } else {
            System.out.println("deu problema");
        }
    }

    public static URL getIconURL(String filename) {
        return HealthBuilder.class.getResource("/icons/" + filename);
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
