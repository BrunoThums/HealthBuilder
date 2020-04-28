package util;
import java.util.List;
public interface DAO<Entity, Index> {
    


    public final static String CREATE_MESSAGE = "Error creating %s=%s",
            UPDATE_MESSAGE = "Error updating %s=%s",
            DELETE_MESSAGE = "Error deleting %s %s",
            GET_ONE = "Error getting %s %s",
            GET_ALL = "Error getting all %ss";

    public boolean create(Entity entity);

    public boolean update(Entity entity);

    public boolean delete(Index index);

    public Entity getBy(Index index);

    public List<Entity> getAll();

}
