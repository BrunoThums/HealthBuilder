package entidade;

import java.sql.Date;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercicio {

    public Integer id;
    public Date data;
    public Integer tipoExercicio; 
    public Integer reacaoCorporal; 
    public Time tempo;
    public String intensidade;
    public Integer kcalTotal;
    public String status;

    public static Exercicio from(ResultSet resultSet) throws SQLException {
        Exercicio exe = new Exercicio();

        exe.id = resultSet.getInt("id");
        exe.data = resultSet.getDate("data");
        exe.tipoExercicio = resultSet.getInt("tipoExercicio_id"); 
        exe.reacaoCorporal = resultSet.getInt("reacaoCorporal_id");
        exe.tempo = resultSet.getTime("tempo");
        exe.intensidade = resultSet.getString("intensidade");
        exe.kcalTotal = resultSet.getInt("kcalTotal");
        exe.status = resultSet.getString("status");
        return exe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("exercicio{id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", tipoExercicio_id=").append(tipoExercicio);
        sb.append(", reacaoCorporal_id=").append(reacaoCorporal);
        sb.append(", tempo=").append(tempo);
        sb.append(", intensidade=").append(intensidade);
        sb.append(", kcalTotal=").append(kcalTotal);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
