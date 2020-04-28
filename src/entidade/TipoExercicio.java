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
public class TipoExercicio {
    public Integer id;
    public String descricao;
    public String subDescricao;
    public String kcal;
    public String mtpKcal;

    public static TipoExercicio from(ResultSet resultSet) throws SQLException {
        TipoExercicio tipoExe = new TipoExercicio();

        tipoExe.id = resultSet.getInt("id");
        tipoExe.descricao = resultSet.getString("descricao");
        tipoExe.subDescricao = resultSet.getString("subDescricao");
        tipoExe.kcal = resultSet.getString("kcal");
        tipoExe.mtpKcal = resultSet.getString("mtpKcal");

        return tipoExe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoExercicio{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", subDescricao=").append(subDescricao);
        sb.append(", kcal=").append(kcal);
        sb.append(", mtpKcal=").append(mtpKcal);
        sb.append('}');
        return sb.toString();
    }

}
