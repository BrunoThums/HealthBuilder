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
public class Exercicio {
    public Integer id;
    public String descricao;
    public String tempo;
    public String data;
    public String intensidade;
    public String reacaoCorporal;

    public static Exercicio from(ResultSet resultSet) throws SQLException {
        Exercicio exe = new Exercicio();

        exe.id = resultSet.getInt("id");
        exe.descricao = resultSet.getString("descricao");
        exe.tempo = resultSet.getString("tempo");
        exe.data = resultSet.getString("data");
        exe.intensidade = resultSet.getString("intensidade");
        exe.reacaoCorporal = resultSet.getString("reacaoCorporal");
        return exe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("exercicio{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", tempo=").append(tempo);
        sb.append(", data=").append(data);
        sb.append(", intensidade=").append(intensidade);
        sb.append(", reacaoCorporal=").append(reacaoCorporal);
        sb.append('}');
        return sb.toString();
    }

}
