package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercicio {

    public Integer id;
    public String data;
    public String tipoExercicio; //nome
    public String subTipo;
    public String reacaoCorporal; //nome
    public String tempo;
    public String intensidade;
    public String kcalTipoExercicio;
    public String kcalTotal;

    public static Exercicio from(ResultSet resultSet) throws SQLException {
        Exercicio exe = new Exercicio();

        exe.id = resultSet.getInt("id");
        exe.data = resultSet.getString("data");
        exe.tipoExercicio = resultSet.getString("tipoExercicio_nome"); 
        exe.subTipo = resultSet.getString("tipoExercicio_subTipo");
        exe.reacaoCorporal = resultSet.getString("reacaoCorporal_nome");
        exe.tempo = resultSet.getString("tempo");
        exe.intensidade = resultSet.getString("intensidade");
        exe.kcalTipoExercicio = resultSet.getString("tipoExercicio_kcal ");
        exe.kcalTotal = resultSet.getString("kcalTotal");
        return exe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("exercicio{id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", tipoExercicio_nome=").append(tipoExercicio);
        sb.append(", tipoExercicio_subTipo=").append(subTipo);
        sb.append(", reacaoCorporal_nome=").append(reacaoCorporal);
        sb.append(", tempo=").append(tempo);
        sb.append(", intensidade=").append(intensidade);
        sb.append(", tipoExercicio_kcal =").append(kcalTipoExercicio);
        sb.append(", kcalTotal=").append(kcalTotal);
        sb.append('}');
        return sb.toString();
    }

}
