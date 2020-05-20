package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Compra {

    public Integer id;
    public String alimento;
    public String valorTotal;
    public String valorUnitario;
    public String quantidade;

    public static Compra from(ResultSet resultSet) throws SQLException {
        Compra compra = new Compra();

        compra.id = resultSet.getInt("id");
        compra.alimento = resultSet.getString("alimento");
        compra.valorTotal = resultSet.getString("valorTotal");
        compra.valorUnitario = resultSet.getString("valorUnitario");
        compra.quantidade = resultSet.getString("quantidade");
        return compra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("compra{id=").append(id);
        sb.append(", alimento=").append(alimento);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append(", valorUnitario=").append(valorUnitario);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }

}
