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
public class Compra {
    public Integer id;
    public String alimento;
    public String valor;
    public String quantidade;

    public static Compra from(ResultSet resultSet) throws SQLException {
        Compra com = new Compra();

        com.id = resultSet.getInt("id");
        com.alimento = resultSet.getString("alimento");
        com.valor = resultSet.getString("valor");
        com.quantidade = resultSet.getString("quantidade");
        return com;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumo{id=").append(id);
        sb.append(", alimento=").append(alimento);
        sb.append(", valor=").append(valor);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }

}

