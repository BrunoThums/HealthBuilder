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
    public String estado;
    public String cidade;
    public String status;
    public String intolerancia;
    public String intolerancia1;
    public String metabolismo;
    public String alergia;
    public String alergia1;
    public Float peso;
    public Float altura;
    public Float imc;
    public String statusimc;
    public Integer cintura;
    public Integer quadril;
    public String statusrcq;
    public Integer busto;
    public Integer coxa;

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
        user.estado = resultSet.getString("estado");
        user.cidade = resultSet.getString("cidade");
        user.status = resultSet.getString("status");
        user.intolerancia = resultSet.getString("intolerancia");
        user.intolerancia1 = resultSet.getString("intolerancia1");
        user.metabolismo = resultSet.getString("metabolismo");
        user.alergia = resultSet.getString("alergia");
        user.alergia1 = resultSet.getString("alergia1");
        user.peso = resultSet.getFloat("peso");
        user.altura = resultSet.getFloat("altura");
        user.imc = resultSet.getFloat("imc");
        user.statusimc = resultSet.getString("statusimc");
        user.cintura = resultSet.getInt("cintura");
        user.quadril = resultSet.getInt("quadril");
        user.statusrcq = resultSet.getString("statusrcq");
        user.busto = resultSet.getInt("busto");
        user.coxa = resultSet.getInt("coxa");

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
        sb.append("', estado='").append(estado);
        sb.append("', cidade='").append(cidade);
        sb.append("', status='").append(status);
        sb.append("', intolerancia='").append(intolerancia);
        sb.append("', intolerancia1='").append(intolerancia1);
        sb.append("', metabolismo='").append(metabolismo);
        sb.append("', alergia='").append(alergia);
        sb.append("', alergia1='").append(alergia1);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append(", imc=").append(imc);
        sb.append("', statusimc='").append(statusimc);
        sb.append(", cintura=").append(cintura);
        sb.append(", quadril=").append(quadril);
        sb.append("', statusrcq='").append(statusrcq);
        sb.append(", busto=").append(busto);
        sb.append(", coxa=").append(coxa);
        sb.append("'}");
        return sb.toString();
    }

}
