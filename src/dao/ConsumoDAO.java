package dao;

import entidade.Consumo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoBD;
import util.IDAOT;

public class ConsumoDAO implements IDAOT<Consumo> {

    @Override
    public Integer salvar(Consumo o) {
        String sql = "INSERT INTO consumo VALUES("
                + "default, "
                + "'" + o.descricao + "',"
                + "'" + o.tempo + "',"
                + "'" + o.data + "',"
                + "'" + o.refeicao + "',"
                + "'" + o.reacaoCorporal + "') returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(Consumo o) {
        String sql = "UPDATE consumo SET "
                + "descricao='" + o.descricao + "',"
                + "tempo='" + o.tempo + "',"
                + "data='" + o.data + "',"
                + "refeicao='" + o.refeicao + "',"
                + "reacaoCorporal='" + o.reacaoCorporal + "',"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "DELETE FROM consumo WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Consumo> consultarTodos() {
        String sql = "SELECT * FROM consumo";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> consumo = new ArrayList<>();
            while (result.next()) {
                consumo.add(Consumo.from(result));
            }
            if (consumo.isEmpty()) {
                return null;
            }
            return consumo;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Consumo> consultar(String criterio) {
        String sql = "SELECT * FROM consumo WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> consumo = new ArrayList<>();
            while (result.next()) {
                consumo.add(Consumo.from(result));
            }
            if (consumo.isEmpty()) {
                return null;
            }
            return consumo;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Consumo consultar(int id) {
        String sql = "SELECT * FROM consumo WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Consumo.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
