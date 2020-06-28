package dao;

import entidade.Compra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import util.ConexaoBD;
import util.IDAOT;

public class CompraDAO implements IDAOT<Compra> {

    @Override
    public Integer salvar(Compra o) {
        String sql = "INSERT INTO compra VALUES("
                + "default, "
                + "" + o.alimento + ","
                + "" + o.valorTotal + ","
                + "" + o.valorUnitario + ","
                + "" + o.quantidade + ") returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(Compra o) {
        String sql = "UPDATE compra SET "
                + "alimento=" + o.alimento + ","
                + "valorTotal=" + o.valorTotal + ","
                + "valorUnitario=" + o.valorUnitario + ","
                + "quantidade=" + o.quantidade + ","
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "DELETE FROM compra WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Compra> consultarTodos() {
        String sql = "SELECT * FROM compra";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Compra> compra = new ArrayList<>();
            while (result.next()) {
                compra.add(Compra.from(result));
            }
            if (compra.isEmpty()) {
                return null;
            }
            return compra;
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Compra> consultar(String criterio) {
        String sql = "SELECT * FROM compra WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Compra> compra = new ArrayList<>();
            while (result.next()) {
                compra.add(Compra.from(result));
            }
            if (compra.isEmpty()) {
                return null;
            }
            return compra;
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Compra consultar(int id) {
        String sql = "SELECT * FROM compra WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Compra.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void popularTabela(JTable tblResumo2, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
