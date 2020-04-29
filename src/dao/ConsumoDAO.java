/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Consumo;
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
public class ConsumoDAO implements IDAOT<Consumo> {

    @Override
    public boolean salvar(Consumo o) {
         String sql = "INSERT INTO alimento VALUES("
                + "default, "
                + "'" + o.descricao+ "',"
                + "'" + o.tempo + "',"
                + "'" + o.data + "',"
                + "'" + o.refeicao+ "',"
                + "'" + o.reacaoCorporal + "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Consumo o) {
String sql = "UPDATE alimento SET "
                + "descricao='" + o.descricao+ "',"
                + "tempo='" + o.tempo+ "',"
                + "data='" + o.data + "',"
                + "refeicao='" + o.refeicao+ "',"
                + "reacaoCorporal='" + o.reacaoCorporal+ "',"
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
        String sql = "DELETE FROM alimento WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<Consumo> consultarTodos() {
  String sql = "SELECT * FROM alimento";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> alimento = new ArrayList<>();
            while (result.next()) {
                alimento.add(Consumo.from(result));
            }
            if (alimento.isEmpty()){ 
                return null;
            }
            return alimento;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Consumo> consultar(String criterio) {
  String sql = "SELECT * FROM alimento WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> alimento = new ArrayList<>();
            while (result.next()) {
                alimento.add(Consumo.from(result));
            }
            if (alimento.isEmpty()){ 
                return null;
            }
            return alimento;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Consumo consultar(int id) {
String sql = "SELECT * FROM alimento WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Consumo.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}
