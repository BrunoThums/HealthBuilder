package dao;

import entidade.SaudeUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoBD;
import util.IDAOT;

public class SaudeUsuarioDAO implements IDAOT<SaudeUsuario> {

    @Override
    public boolean salvar(SaudeUsuario o) {
        String sql = "INSERT INTO saudeUsuario VALUES("
                + "default, "
                + "'" + o.idUsuario + "',"
                + "'" + o.intolerancia + "',"
                + "'" + o.intolerancia1 + "',"
                + "'" + o.metabolismo + "',"
                + "'" + o.alergia + "',"
                + "'" + o.alergia1 + "',"
                + "'" + o.peso + "',"
                + "'" + o.altura + "',"
                + "'" + o.imc + "',"
                + "'" + o.statusimc + "',"
                + "'" + o.cintura + "',"
                + "'" + o.quadril + "',"
                + "'" + o.statusrcq + "',"
                + "'" + o.busto + "',"
                + "'" + o.coxa + "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(SaudeUsuario o) {
        String sql = "UPDATE saudeUsuario SET "
                + "id_usuario='" + o.idUsuario + "',"
                + "intolerancia='" + o.intolerancia + "',"
                + "intolerancia1='" + o.intolerancia1 + "',"
                + "metabolismo='" + o.metabolismo + "',"
                + "alergia='" + o.alergia + "',"
                + "alergia1='" + o.alergia1 + "',"
                + "imc='" + o.imc + "',"
                + "statusimc='" + o.statusimc + "',"
                + "peso='" + o.peso + "',"
                + "altura='" + o.altura + "',"
                + "cintura='" + o.cintura + "',"
                + "quadril='" + o.quadril + "',"
                + "statusrcq='" + o.statusrcq + "',"
                + "busto='" + o.busto + "',"
                + "coxa='" + o.coxa + "',"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean atualizarParam(Integer id, String campo, String valor) {
        String sql = "UPDATE saudeUsuario SET " + campo + " ='" + valor + "'"
                + "WHERE id= " + id;
        System.out.println(sql);
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "DELETE FROM saudeUsuario WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<SaudeUsuario> consultarTodos() {
        String sql = "SELECT * FROM saudeUsuario";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<SaudeUsuario> saudeUsuario = new ArrayList<>();
            while (result.next()) {
                saudeUsuario.add(SaudeUsuario.from(result));
            }
            if (saudeUsuario.isEmpty()) {
                return null;
            }
            return saudeUsuario;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<SaudeUsuario> consultar(String criterio) {
        String sql = "SELECT * FROM saudeUsuario WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<SaudeUsuario> saudeUsuario = new ArrayList<>();
            while (result.next()) {
                saudeUsuario.add(SaudeUsuario.from(result));
            }
            if (saudeUsuario.isEmpty()) {
                return null;
            }
            return saudeUsuario;
        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public SaudeUsuario consultar(int id) {
        String sql = "SELECT * FROM saudeUsuario WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return SaudeUsuario.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SaudeUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
