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
public class ReacaoCorporal {
    public Integer id;
    public String descricao;

    public static ReacaoCorporal from(ResultSet resultSet) throws SQLException {
        ReacaoCorporal reacaoCorp = new ReacaoCorporal();

        reacaoCorp.id = resultSet.getInt("id");
        reacaoCorp.descricao = resultSet.getString("descricao");

        return reacaoCorp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("reacaoCorporal{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append('}');
        return sb.toString();
    }

}
