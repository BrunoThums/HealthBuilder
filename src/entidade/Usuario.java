package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class Usuario {

    public Integer id;
    public String nome;
    public String sobrenome;
    public Date dataNasc;
    public String sexo;
    public String cpf;
    public String email;
    public String login;
    public String senha;
    public String pais;
    public String estado;
    public String cidade;
    public String status;

    public static Usuario from(ResultSet resultSet) throws SQLException {
        Usuario user = new Usuario();

        user.id = resultSet.getInt("id");
        user.nome = resultSet.getString("nome");
        user.sobrenome = resultSet.getString("sobrenome");
        user.dataNasc = resultSet.getDate("dataNasc");
        user.sexo = resultSet.getString("sexo");
        user.cpf = resultSet.getString("cpf");
        user.email = resultSet.getString("email");
        user.login = resultSet.getString("login");
        user.senha = resultSet.getString("senha");
        user.pais = resultSet.getString("pais");
        user.estado = resultSet.getString("estado");
        user.cidade = resultSet.getString("cidade");
        user.status = resultSet.getString("status");

        return user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("usuario{id='").append(id);
        sb.append("', nome='").append(nome);
        sb.append("', sobrenome='").append(sobrenome);
        sb.append("', dataNasc='").append(dataNasc);
        sb.append("', sexo='").append(sexo);
        sb.append("', cpf='").append(cpf);
        sb.append("', email='").append(email);
        sb.append("', login='").append(login);
        sb.append("', senha='").append(senha);
        sb.append("', pais='").append(pais);
        sb.append("', estado='").append(estado);
        sb.append("', cidade='").append(cidade);
        sb.append("', status='").append(status);
        sb.append("'}");
        return sb.toString();
    }

}
