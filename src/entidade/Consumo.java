package entidade;

import java.sql.Date;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consumo {

    public Integer id;
    public Integer descricao;
    public String refeicao;
    public Integer quantidade;
    public String porcaoConsumida;
    public Date data;
    public Time horario;
    public Integer reacaoCorporal;
    public String status;

    public static Consumo from(ResultSet resultSet) throws SQLException {
        Consumo consumo = new Consumo();

        consumo.id = resultSet.getInt("id");
        consumo.descricao = resultSet.getInt("alimento_id");
        consumo.refeicao = resultSet.getString("refeicao");
        consumo.quantidade = resultSet.getInt("quantidade");
        consumo.porcaoConsumida = resultSet.getString("porcaoConsumida");
        consumo.data = resultSet.getDate("data");
        consumo.horario = resultSet.getTime("horario");
        consumo.reacaoCorporal = resultSet.getInt("reacaoCorporal");
        consumo.status = resultSet.getString("status");
        return consumo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumo{id=").append(id);
        sb.append(", alimento_id=").append(descricao);
        sb.append(", refeicao=").append(refeicao);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", porcaoConsumida=").append(porcaoConsumida);
        sb.append(", data=").append(data);
        sb.append(", horario=").append(horario);
        sb.append(", reacaoCorporal=").append(reacaoCorporal);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
