package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wesauis
 * @param <T>
 */
public abstract class TableDataModel<T> extends DefaultTableModel {

    List<T> data;
    Object[] header;
    Object[][] cells;

    {
        update();
    }

    /**
     * A lista de entidades a ser exibida na tabela
     *
     * @return
     */
    public abstract List<T> getData();

    /**
     * A cabeçalho da tabela
     *
     * @return
     */
    public abstract String[] getHeader();

    /**
     * A conversao de entidade para uma linha na tabela
     *
     * @param t
     * @return
     */
    public abstract Object[] toTableRow(T t);

    /**
     * Retorna o valor exibido na linha especificada.
     *
     * @param row
     * @return
     */
    public T getValueAt(int row) {
        return data.get(row);
    }

    /**
     * Atualiza a tabela.
     */
    public void update() {
        data = getData();
        if(data == null){
            data = new ArrayList<>();
        }
        header = getHeader();
        cells = new Object[data.size()][header.length];
        for (int i = 0; i < data.size(); i++) {
            cells[i] = toTableRow(data.get(i));
        }

        this.setDataVector(cells, header);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
