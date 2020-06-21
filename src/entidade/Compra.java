package entidade;

import java.sql.Date;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Compra {

    public Integer id;
    public Integer alimento;
    public String quantidade;
    public String valorUnitario;
    public String valorTotal;
    public Date data;
    public Time horario;

    public static Compra from(ResultSet resultSet) throws SQLException {
        Compra compra = new Compra();

        compra.id = resultSet.getInt("id");
        compra.alimento = resultSet.getInt("alimento_id");
        compra.quantidade = resultSet.getString("quantidade");
        compra.valorUnitario = resultSet.getString("valorUnitario");
        compra.valorTotal = resultSet.getString("valorTotal");
        compra.data = resultSet.getDate("data");
        compra.horario = resultSet.getTime("horario");
        return compra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("compra{id=").append(id);
        sb.append(", alimento_id=").append(alimento);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", valorUnitario=").append(valorUnitario);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append(", data=").append(data);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }

}
