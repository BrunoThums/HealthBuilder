package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Properties;
import javax.swing.JPasswordField;

public class ConexaoBD {

    private static ConexaoBD instancia = null;
    private Connection conexao = null;

    public ConexaoBD() {
        try {
            // Carrega informações do arquivo de propriedades
            Properties properties = new Properties();
            properties.load(new FileInputStream("db.properties"));
            String DRIVER = properties.getProperty("DRIVER");
            String URL = properties.getProperty("URL");
            String DATABASE = properties.getProperty("DATABASE");
            String USERNAME = properties.getProperty("USERNAME");
            String PASSWORD = properties.getProperty("PASSWORD");
            String URI = URL + "/" + DATABASE;
            // Carrega Driver do Banco de Dados
            Class.forName(DRIVER);

            if (USERNAME.length() != 0) // conexão COM usuário e senha
            {
                conexao = DriverManager.getConnection(URI, USERNAME, PASSWORD);
            } else // conexão SEM usuário e senha
            {
                conexao = DriverManager.getConnection(URI);
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // Retorna instância
    public static ConexaoBD getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    // Retorna conexão
    public Connection getConnection() {
        if (conexao == null) {
            throw new RuntimeException("conexao==null");
        }
        return conexao;
    }

    // Efetua fechamento da conexão
    public void shutDown() {
        try {
            conexao.close();
            instancia = null;
            conexao = null;
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Verifica se o valor é unico no banco de dados
     *
     * @param tabela
     * @param campo
     * @param valor
     * @return
     */
    public boolean existeNoBancoDeDados(String tabela, String campo, String valor) {
        try {
            String SQL = String.format("SELECT * FROM %s WHERE %s ILIKE '%s';", tabela, campo, valor);
            return conexao.createStatement().executeQuery(SQL).next();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, null, ex);
            return false;
        }
    }
    
    /**
     * 
     * @param tabela
     * @param id - número
     * @param campoId - nome da coluna do id (padrão "id")
     * @param campo
     * @param valor
     * @return 
     */
    public boolean existeNoBancoDeDados(String tabela, Integer id, String campoId, String campo, String valor) {
        try {
            String SQL = String.format("SELECT * FROM %s WHERE %s ILIKE '%s' AND %s = %d;", tabela, campo, valor, campoId, id);
            return conexao.createStatement().executeQuery(SQL).next();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, null, ex);
            return false;
        }
    }
    
    public boolean trocaSenha(String tabela, Integer id, String campoId, String campo, JPasswordField valor) {
        try {
            String SQL = String.format("SELECT * FROM %s WHERE %s ILIKE '%s' AND %s = %d;", tabela, campo, valor.getPassword().toString(), campoId, id);
            return conexao.createStatement().executeQuery(SQL).next();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, null, ex);
            return false;
        }
    }
}
