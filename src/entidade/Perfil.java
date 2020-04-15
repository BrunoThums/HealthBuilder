/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bbt-1
 */
public class Perfil {

    private int id;
    private String descricao;

    public static Perfil from(ResultSet resultSet) throws SQLException {
        Perfil perfil = new Perfil();
        
        perfil.id = resultSet.getInt("idPerfil");
        perfil.descricao = resultSet.getString("descricao");

        return perfil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perfil{id=").append(id);
        sb.append(", descricao=").append(descricao);
        sb.append('}');
        return sb.toString();
    }

}
