package util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno.thums
 */
import java.sql.*;
import java.io.*;
import java.util.*;

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
}
