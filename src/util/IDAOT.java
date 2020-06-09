package util;

import java.util.ArrayList;

// Utiliza Generics como tipo de dado
public interface IDAOT<T> {

    public Integer salvar(T o);

    public boolean atualizar(T o);

    public boolean excluir(int id);

    public ArrayList<T> consultarTodos();

    public ArrayList<T> consultar(String criterio);

    public T consultar(int id);
}
