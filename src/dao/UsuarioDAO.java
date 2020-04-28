
package dao;

import com.sun.jdi.connect.spi.Connection;
import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import util.DAO;

public class UsuarioDAO implements DAO<Usuario, Integer> {

    UsuarioDAO() {
    }

    @Override
    public boolean create(Usuario entity) {
        String SQL = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?);";

        try {
            entity.id = DatabaseHelper.getNextID("users", "id");

            PreparedStatement ps = Connection.getInstance().prepareStatement(SQL);

            ps.setInt(1, entity.id);
            ps.setString(2, entity.username);
            ps.setString(3, entity.email);
            ps.setString(4, entity.firstName);
            ps.setString(5, entity.lastName);
            ps.setString(6, entity.passwordHash);

            ps.executeUpdate();

            return true;
        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(CREATE_MESSAGE, "user", entity), exception);

            return false;
        }
    }

    @Override
    public boolean update(Usuario entity) {
        String SQL = "UPDATE users SET "
                + "username=?, "
                + "email=?, "
                + "password_hash=?, "
                + "first_name=?, "
                + "last_name=? "
                + "WHERE id=?;";

        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(SQL);

             
            ps.setString(1, entity.username);
            ps.setString(2, entity.email);
            ps.setString(3, entity.passwordHash);
            ps.setString(4, entity.firstName);
            ps.setString(5, entity.lastName);
            ps.setInt(6, entity.id);

            ps.executeUpdate();

            return true;
        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(UPDATE_MESSAGE, "user", entity), exception);

            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        String SQL = "DELETE FROM users WHERE id=?";

        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(SQL);

            ps.setInt(1, id);

            ps.executeUpdate();

            return true;
        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(DELETE_MESSAGE, "user", id), exception);

            return false;
        }
    }

    @Override
    public Usuario getBy(Integer id) {
        String SQL = "SELECT * FROM users WHERE id=?";

        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                return Usuario.from(resultSet);
            }

        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(GET_ONE, "user", id), exception);
        }

        return null;
    }

    public Usuario getBy(String username) {
        String SQL = "SELECT * FROM users WHERE username=?";

        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(SQL);

            ps.setString(1, username);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                return Usuario.from(resultSet);
            }

        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(GET_ONE, "user", username), exception);
        }

        return null;
    }

    @Override
    public List<Usuario> getAll() {
        String SQL = "SELECT * FROM users";

        try {
            ResultSet resultSet = Connection.getInstance().createStatement().executeQuery(SQL);

            return DatabaseHelper.resultSetToList(resultSet, Usuario::from);
        } catch (SQLException exception) {
            Logger.error(getClass(), String.format(GET_ALL, "user"), exception);
        }

        return null;
    }

}
