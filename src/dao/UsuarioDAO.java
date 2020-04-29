
package dao;

import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoBD;
import util.IDAOT;


public class UsuarioDAO implements IDAOT<Usuario> {

    @Override
    public boolean salvar(Usuario o) {
         String sql = "INSERT INTO usuario VALUES("
                + "default, "
                + "'" + o.nome+ "',"
                + "'" + o.sobrenome + "',"
                + "'" + o.dataNasc + "',"
                + "'" + o.endereco+ "',"
                + "'" + o.CPF + "',"
                + "'" + o.email + "',"
                + "'" + o.login + "',"
                + "'" + o.senha + "',"
                + "'" + o.intolerancia+ "',"
                + "'" + o.intolerancia1+ "',"
                + "'" + o.peso+ "',"
                + "'" + o.altura + "',"
                + "'" + o.endereco+ "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Usuario o) {
String sql = "UPDATE usuario SET "
                + "descricao='" + o.nome+ "',"
                + "tempo='" + o.sobrenome+ "',"
                + "data='" + o.dataNasc + "',"
                + "intensidade='" + o.endereco+ "',"
                + "CPF='" + o.CPF+ "',"
                + "email='" + o.email+ "',"
                + "login='" + o.login+ "',"
                + "senha='" + o.senha+ "',"
                + "intolerancia='" + o.intolerancia+ "',"
                + "intolerancia1='" + o.intolerancia1+ "',"
                + "peso='" + o.peso+ "',"
                + "altura='" + o.altura+ "',"
                + "endereco='" + o.endereco+ "',"
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
        String sql = "DELETE FROM usuario WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    

    @Override
    public ArrayList<Usuario> consultarTodos() {
  String sql = "SELECT * FROM usuario";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Usuario> usuario = new ArrayList<>();
            while (result.next()) {
                usuario.add(Usuario.from(result));
            }
            if (usuario.isEmpty()){ 
                return null;
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Usuario> consultar(String criterio) {
  String sql = "SELECT * FROM usuario WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Usuario> usuario = new ArrayList<>();
            while (result.next()) {
                usuario.add(Usuario.from(result));
            }
            if (usuario.isEmpty()){ 
                return null;
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Usuario consultar(int id) {
String sql = "SELECT * FROM usuario WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Usuario.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }

}