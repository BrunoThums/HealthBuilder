/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author bbt-1
 */
public class Usuario {

    public Integer id;
    public String nome;
    public String sobrenome;
    public String dataNasc;
    public String endereco;
    public String CPF;
    public String email;
    public String login;
    public String senha;
    public String intolerancia;
    public String intolerancia1;
    public String peso;
    public String altura;

    public static Usuario from(ResultSet resultSet) throws SQLException {
        Usuario user = new Usuario();

        user.id = resultSet.getInt("id");
        user.nome = resultSet.getString("nome");
        user.sobrenome = resultSet.getString("sobrenome");
        user.dataNasc = resultSet.getString("dataNascimento");
        user.endereco = resultSet.getString("endereco");
        user.CPF = resultSet.getString("CPF");
        user.email = resultSet.getString("email");
        user.login = resultSet.getString("login");
        user.senha = resultSet.getString("senha");
        user.intolerancia = resultSet.getString("intolerancia");
        user.intolerancia1 = resultSet.getString("intolerancia1");
        user.peso = resultSet.getString("peso"); 
        user.altura = resultSet.getString("altura"); 

        return user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("usuario{id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", sobrenome=").append(sobrenome);
        sb.append(", dataNascimento=").append(dataNasc);
        sb.append(", endereco=").append(endereco);
        sb.append(", email=").append(email);
        sb.append(", login=").append(login);
        sb.append(", senha=").append(senha);
        sb.append(", intolerancia=").append(intolerancia);
        sb.append(", intolerancia1=").append(intolerancia1);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

}
