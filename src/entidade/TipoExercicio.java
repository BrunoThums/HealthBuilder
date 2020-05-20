package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoExercicio {

    public Integer id;
    public String descricao;
    public String subDescricao;
    public String kcal;

    public static TipoExercicio from(ResultSet resultSet) throws SQLException {
        TipoExercicio tipoExe = new TipoExercicio();

        tipoExe.id = resultSet.getInt("id");
        tipoExe.descricao = resultSet.getString("descricao");
        tipoExe.subDescricao = resultSet.getString("subDescricao");
        tipoExe.kcal = resultSet.getString("kcal");

        return tipoExe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoExercicio{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", subDescricao=").append(subDescricao);
        sb.append(", kcal=").append(kcal);
        sb.append('}');
        return sb.toString();
    }

}
