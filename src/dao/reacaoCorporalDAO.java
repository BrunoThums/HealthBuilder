/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.ReacaoCorporal;
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
public class reacaoCorporalDAO implements IDAOT<ReacaoCorporal> {

    @Override
    public boolean salvar(ReacaoCorporal o) {
         String sql = "INSERT INTO reacaoCorporal VALUES("
                + "default, "
                + "'" + o.descricao+ "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(ReacaoCorporal o) {
String sql = "UPDATE reacaoCorporal SET "
                + "descricao='" + o.descricao+ "',"
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
        String sql = "DELETE FROM reacaoCorporal WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<ReacaoCorporal> consultarTodos() {
  String sql = "SELECT * FROM reacaoCorporal";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<ReacaoCorporal> reacaoCorporal = new ArrayList<>();
            while (result.next()) {
                reacaoCorporal.add(ReacaoCorporal.from(result));
            }
            if (reacaoCorporal.isEmpty()){ 
                return null;
            }
            return reacaoCorporal;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<ReacaoCorporal> consultar(String criterio) {
  String sql = "SELECT * FROM reacaoCorporal WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<ReacaoCorporal> reacaoCorporal = new ArrayList<>();
            while (result.next()) {
                reacaoCorporal.add(ReacaoCorporal.from(result));
            }
            if (reacaoCorporal.isEmpty()){ 
                return null;
            }
            return reacaoCorporal;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ReacaoCorporal consultar(int id) {
String sql = "SELECT * FROM reacaoCorporal WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return ReacaoCorporal.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}
