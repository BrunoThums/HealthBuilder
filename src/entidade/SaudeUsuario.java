package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SaudeUsuario {

    public Integer id;
    public Integer idUsuario;
    public String intolerancia;
    public String intolerancia1;
    public String metabolismo;
    public String alergia;
    public String alergia1;
    public String peso;
    public String altura;
    public String imc;
    public String statusimc;
    public String cintura;
    public String quadril;
    public String statusrcq;
    public String busto;
    public String coxa;

    public static SaudeUsuario from(ResultSet resultSet) throws SQLException {
        SaudeUsuario saude = new SaudeUsuario();

        saude.id = resultSet.getInt("id");        
        saude.idUsuario = resultSet.getInt("usuario_id");
        saude.intolerancia = resultSet.getString("intolerancia");
        saude.intolerancia1 = resultSet.getString("intolerancia1");
        saude.metabolismo = resultSet.getString("metabolismo");
        saude.alergia = resultSet.getString("alergia");
        saude.alergia1 = resultSet.getString("alergia1");
        saude.peso = resultSet.getString("peso");
        saude.altura = resultSet.getString("altura");
        saude.imc = resultSet.getString("imc");
        saude.statusimc = resultSet.getString("statusimc");
        saude.cintura = resultSet.getString("cintura");
        saude.quadril = resultSet.getString("quadril");
        saude.statusrcq = resultSet.getString("statusrcq");
        saude.busto = resultSet.getString("busto");
        saude.coxa = resultSet.getString("coxa");

        return saude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("saudeUsuario{id=").append(id);
        sb.append(", usuario_id=").append(idUsuario);
        sb.append(", intolerancia=").append(intolerancia);
        sb.append(", intolerancia1=").append(intolerancia1);
        sb.append(", metabolismo=").append(metabolismo);
        sb.append(", alergia=").append(alergia);
        sb.append(", alergia1=").append(alergia1);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append(", imc=").append(imc);
        sb.append(", statusimc=").append(statusimc);
        sb.append(", cintura=").append(cintura);
        sb.append(", quadril=").append(quadril);
        sb.append(", statusrcq=").append(statusrcq);
        sb.append(", busto=").append(busto);
        sb.append(", coxa=").append(coxa);
        sb.append('}');
        return sb.toString();
    }

}

