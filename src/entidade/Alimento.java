package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Alimento {

    public Integer id;
    public String descricao;
    public Integer porcao;
    public Integer valorEner;
    public Integer proteina;
    public Integer acucares;
    public Integer gordTrans;
    public Integer gordSaturada;
    public Integer sodio;
    public String status;

    public static Alimento from(ResultSet resultSet) throws SQLException {
        Alimento ali = new Alimento();

        ali.id = resultSet.getInt("id");
        ali.descricao = resultSet.getString("descricao");
        ali.porcao = resultSet.getInt("porcao");
        ali.valorEner = resultSet.getInt("valorEnergetico");
        ali.proteina = resultSet.getInt("proteina");
        ali.acucares = resultSet.getInt("acucares");
        ali.gordTrans = resultSet.getInt("gorduraTrans");
        ali.gordSaturada = resultSet.getInt("gorduraSaturada");
        ali.sodio = resultSet.getInt("sodio");
        ali.status = resultSet.getString("status");

        return ali;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alimento{id=").append(id);
        sb.append("', descricao='").append(descricao);
        sb.append(", porcao=").append(porcao);
        sb.append(", valorEnergetico=").append(valorEner);
        sb.append(", proteina=").append(proteina);
        sb.append(", acucares=").append(acucares);
        sb.append(", gorduraTrans=").append(gordTrans);
        sb.append(", gorduraSaturada=").append(gordSaturada);
        sb.append(", sodio=").append(sodio);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

}
