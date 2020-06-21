package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoExercicio {

    public Integer id;
    public String descricao;
    public String subDescricao;
    public Integer kcal;
    public String status;

    public static TipoExercicio from(ResultSet resultSet) throws SQLException {
        TipoExercicio tipoExe = new TipoExercicio();

        tipoExe.id = resultSet.getInt("id");
        tipoExe.descricao = resultSet.getString("descricao");
        tipoExe.subDescricao = resultSet.getString("subDescricao");
        tipoExe.kcal = resultSet.getInt("kcal");
        tipoExe.status = resultSet.getString("status");

        return tipoExe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoExercicio{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", subDescricao=").append(subDescricao);
        sb.append(", kcal=").append(kcal);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
