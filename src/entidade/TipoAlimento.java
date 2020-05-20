package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoAlimento {

    public Integer id;
    public String descricao;
    public String porcao;
    public String valorEner;
    public String proteina;
    public String acucares;
    public String gordTrans;
    public String gordSaturada;
    public String sodio;

    public static TipoAlimento from(ResultSet resultSet) throws SQLException {
        TipoAlimento tipoAli = new TipoAlimento();

        tipoAli.id = resultSet.getInt("id");
        tipoAli.descricao = resultSet.getString("descricao");
        tipoAli.porcao = resultSet.getString("porcao");
        tipoAli.valorEner = resultSet.getString("valorEnergetico");
        tipoAli.proteina = resultSet.getString("proteina");
        tipoAli.acucares = resultSet.getString("acucares");
        tipoAli.gordTrans = resultSet.getString("gorduraTrans");
        tipoAli.gordSaturada = resultSet.getString("gorduraSaturada");
        tipoAli.sodio = resultSet.getString("sodio");

        return tipoAli;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoAlimento{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append(", porcao=").append(porcao);
        sb.append(", valorEnergetico=").append(valorEner);
        sb.append(", proteina=").append(proteina);
        sb.append(", acucares=").append(acucares);
        sb.append(", gorduraTrans=").append(gordTrans);
        sb.append(", gorduraSaturada=").append(gordSaturada);
        sb.append(", sodio=").append(sodio);
        sb.append('}');
        return sb.toString();
    }

}
