package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReacaoCorporal {

    public Integer id;
    public String nome;
    public String status;

    public static ReacaoCorporal from(ResultSet resultSet) throws SQLException {
        ReacaoCorporal reacaoCorp = new ReacaoCorporal();

        reacaoCorp.id = resultSet.getInt("id");
        reacaoCorp.nome = resultSet.getString("nome");
        reacaoCorp.status = resultSet.getString("status");
        return reacaoCorp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("reacaoCorporal{id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
