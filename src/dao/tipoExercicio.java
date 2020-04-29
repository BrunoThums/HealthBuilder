/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.TipoExercicio;
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
public class tipoExercicio implements IDAOT<TipoExercicio> {

    @Override
    public boolean salvar(TipoExercicio o) {
         String sql = "INSERT INTO tipoExercicio VALUES("
                + "default, "
                + "'" + o.descricao+ "',"
                + "'" + o.subDescricao + "',"
                + "'" + o.kcal + "',"
                + "'" + o.mtpKcal+ "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(TipoExercicio o) {
String sql = "UPDATE tipoExercicio SET "
                + "descricao='" + o.descricao+ "',"
                + "subDescricao='" + o.subDescricao+ "',"
                + "kcal='" + o.kcal + "',"
                + "mtpKcal='" + o.mtpKcal+ "',"
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
        String sql = "DELETE FROM tipoExercicio WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<TipoExercicio> consultarTodos() {
  String sql = "SELECT * FROM tipoExercicio";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<TipoExercicio> tipoExercicio = new ArrayList<>();
            while (result.next()) {
                tipoExercicio.add(TipoExercicio.from(result));
            }
            if (tipoExercicio.isEmpty()){ 
                return null;
            }
            return tipoExercicio;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<TipoExercicio> consultar(String criterio) {
  String sql = "SELECT * FROM tipoExercicio WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<TipoExercicio> tipoExercicio = new ArrayList<>();
            while (result.next()) {
                tipoExercicio.add(TipoExercicio.from(result));
            }
            if (tipoExercicio.isEmpty()){ 
                return null;
            }
            return tipoExercicio;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public TipoExercicio consultar(int id) {
String sql = "SELECT * FROM tipoExercicio WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return TipoExercicio.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}
