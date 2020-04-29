/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.TipoAlimento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoBD;
import util.IDAOT;

/**
 *
 * @author bbt-1
 */
public class tipoAlimentoDAO implements IDAOT<TipoAlimento> {

    @Override
    public boolean salvar(TipoAlimento o) {
         String sql = "INSERT INTO tipoAlimento VALUES("
                + "default, "
                + "'" + o.descricao+ "',"
                + "'" + o.porcao + "',"
                + "'" + o.valorEner + "',"
                + "'" + o.proteina+ "',"
                + "'" + o.acucares + "',"
                + "'" + o.gordTrans + "',"
                + "'" + o.gordSaturada + "',"
                + "'" + o.sodio + "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(TipoAlimento o) {
String sql = "UPDATE tipoAlimento SET "
                + "descricao='" + o.descricao+ "',"
                + "porcao='" + o.porcao+ "',"
                + "valorEner='" + o.valorEner + "',"
                + "proteina='" + o.proteina+ "',"
                + "acucares='" + o.acucares+ "',"
                + "gordTrans='" + o.gordTrans+ "',"
                + "gordSaturada='" + o.gordSaturada+ "',"
                + "sodio='" + o.sodio+ "',"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "DELETE FROM tipoAlimento WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<TipoAlimento> consultarTodos() {
  String sql = "SELECT * FROM tipoAlimento";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<TipoAlimento> tipoAlimento = new ArrayList<>();
            while (result.next()) {
                tipoAlimento.add(TipoAlimento.from(result));
            }
            if (tipoAlimento.isEmpty()){ 
                return null;
            }
            return tipoAlimento;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<TipoAlimento> consultar(String criterio) {
  String sql = "SELECT * FROM tipoAlimento WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<TipoAlimento> tipoAlimento = new ArrayList<>();
            while (result.next()) {
                tipoAlimento.add(TipoAlimento.from(result));
            }
            if (tipoAlimento.isEmpty()){ 
                return null;
            }
            return tipoAlimento;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public TipoAlimento consultar(int id) {
String sql = "SELECT * FROM tipoAlimento WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return TipoAlimento.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}

