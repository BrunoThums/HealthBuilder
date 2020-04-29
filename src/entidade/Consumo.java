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
public class Consumo {
    public Integer id;
    public String descricao;
    public String refeicao;
    public String data;
    public String tempo;
    public String reacaoCorporal;

    public static Consumo from(ResultSet resultSet) throws SQLException {
        Consumo cons = new Consumo();

        cons.id = resultSet.getInt("id");
        cons.descricao = resultSet.getString("descricao");
        cons.refeicao = resultSet.getString("refeicao");
        cons.data = resultSet.getString("data");
        cons.tempo = resultSet.getString("tempo");
        cons.reacaoCorporal = resultSet.getString("reacaoCorporal");
        return cons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumo{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", refeicao=").append(refeicao);
        sb.append(", data=").append(data);
        sb.append(", tempo=").append(tempo);
        sb.append(", reacaoCorporal=").append(reacaoCorporal);
        sb.append('}');
        return sb.toString();
    }

}

