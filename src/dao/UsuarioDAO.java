package dao;

import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                + "'" + o.nome + "',"
                + "'" + o.sobrenome + "',"
                + "'" + o.dataNasc.toString() + "',"
                + "'" + o.sexo + "',"
                + "'" + o.cpf + "',"
                + "'" + o.email + "',"
                + "'" + o.login + "',"
                + "md5('" + o.senha + "'),"
                + "'" + o.pais + "',"
                + "'" + o.estado + "',"
                + "'" + o.cidade + "',"
                + "'" + o.status + "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Usuario o) {
        String sql = "UPDATE usuario SET "
                + "nome='" + o.nome + "',"
                + "sobrenome='" + o.sobrenome + "',"
                + "dataNasc='" + o.dataNasc + "',"
                + "sexo='" + o.sexo + "',"
                + "cpf='" + o.cpf + "',"
                + "email='" + o.email + "',"
                + "login='" + o.login + "',"
                + "senha=md5('" + o.senha + "'),"
                + "pais='" + o.pais + "',"
                + "estado='" + o.estado + "',"
                + "cidade='" + o.cidade + "',"
                + "status='" + o.status + "'"
                + "WHERE id= " + o.id;
        System.out.println(sql);

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Atualiza um campo específico do usuário
     *
     * @param id
     * @param campo
     * @param valor
     * @return
     */
    public boolean atualizarParam(Integer id, String campo, String valor) {
        String sql = "UPDATE usuario SET " + campo + " ='" + valor + "'"
                + "WHERE id= " + id;
        System.out.println(sql);
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "UPDATE usuario SET status = 'inativo' WHERE id = " + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            if (usuario.isEmpty()) {
                return null;
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            if (usuario.isEmpty()) {
                return null;
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Usuario autenticar(String login, String senha) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuario "
                    + "WHERE "
                    + "login ILIKE '" + login + "' AND "
                    + "senha = md5('" + senha + "')"
                    + " AND status != 'inativo'";

            System.out.println("SQL: " + sql);

            ResultSet resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                System.out.println("sql: " + Usuario.from(resultadoQ));
                return Usuario.from(resultadoQ);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao autenticar: " + e);
        }
        return null;
    }
}
