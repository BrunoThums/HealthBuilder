package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Properties;

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

    public boolean pesquisaIgual(String tabela, String campo, String valor) {
        try {
            String SQL = String.format("SELECT * FROM %s WHERE %s ILIKE '%s';", tabela, campo, valor);
            return conexao.createStatement().executeQuery(SQL).next();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, null, ex);
            return false;
        }
    }
}
