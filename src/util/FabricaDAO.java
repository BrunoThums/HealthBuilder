package util;
import java.util.HashMap;
public class FabricaDAO {
    

    private static final HashMap<Class<? extends DAO>, DAO> cache = new HashMap<>();

    private static <T extends DAO> T createInstance(Class<T> clazz) {
        try {
            T dao = clazz.newInstance();

            cache.put(clazz, dao);

            return dao;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.error(FabricaDAO.class, "Error creating new " + clazz.getSimpleName(), ex);

            return null;
        }
    }

    /**
     * Returns a new or a cached instance of a DAO implementation
     *
     * @param <T>
     * @param clazz
     * @return
     */
    public static <T extends DAO> T getInstance(Class<T> clazz) {
        if (!cache.containsKey(clazz)) {
            return createInstance(clazz);
        }

        return (T) cache.get(clazz);
    }

}
