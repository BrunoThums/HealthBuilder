
package dao;

import entidade.Exercicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoBD;
import util.IDAOT;

public class ExercicioDAO implements IDAOT<Exercicio> {

    @Override
    public boolean salvar(Exercicio o) {
         String sql = "INSERT INTO exercicio VALUES("
                + "default, "
                + "'" + o.descricao+ "',"
                + "'" + o.tempo + "',"
                + "'" + o.data + "',"
                + "'" + o.intensidade+ "',"
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
    public boolean atualizar(Exercicio o) {
String sql = "UPDATE exercicio SET "
                + "descricao='" + o.descricao+ "',"
                + "tempo='" + o.tempo+ "',"
                + "data='" + o.data + "',"
                + "intensidade='" + o.intensidade+ "',"
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
        String sql = "DELETE FROM exercicio WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<Exercicio> consultarTodos() {
  String sql = "SELECT * FROM exercicio";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Exercicio> exercicios = new ArrayList<>();
            while (result.next()) {
                exercicios.add(Exercicio.from(result));
            }
            if (exercicios.isEmpty()){ 
                return null;
            }
            return exercicios;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Exercicio> consultar(String criterio) {
  String sql = "SELECT * FROM exercicio WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Exercicio> exercicios = new ArrayList<>();
            while (result.next()) {
                exercicios.add(Exercicio.from(result));
            }
            if (exercicios.isEmpty()){ 
                return null;
            }
            return exercicios;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Exercicio consultar(int id) {
String sql = "SELECT * FROM exercicio WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Exercicio.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}
