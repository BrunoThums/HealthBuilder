package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Consumo {

    public Integer id;
    public String descricao;
    public String refeicao;
    public String data;
    public String tempo;
    public String reacaoCorporal;

    public static Consumo from(ResultSet resultSet) throws SQLException {
        Consumo consumo = new Consumo();

        consumo.id = resultSet.getInt("id");
        consumo.descricao = resultSet.getString("descricao");
        consumo.tempo = resultSet.getString("tempo");
        consumo.data = resultSet.getString("data");
        consumo.refeicao = resultSet.getString("refeicao");
        consumo.reacaoCorporal = resultSet.getString("reacaoCorporal");
        return consumo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consumo{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", tempo=").append(tempo);
        sb.append(", data=").append(data);
        sb.append(", refeicao=").append(refeicao);
        sb.append(", reacaoCorporal=").append(reacaoCorporal);
        sb.append('}');
        return sb.toString();
    }

}
