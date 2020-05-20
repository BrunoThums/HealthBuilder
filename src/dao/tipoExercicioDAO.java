package dao;

import entidade.TipoExercicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import util.ConexaoBD;
import util.IDAOT;

public class TipoExercicioDAO implements IDAOT<TipoExercicio> {
    
    ResultSet resultadoQ = null;
    
    @Override
    public boolean salvar(TipoExercicio o) {
        String sql = "INSERT INTO tipoExercicio VALUES("
                + "default, "
                + "'" + o.descricao + "',"
                + "'" + o.subDescricao + "',"
                + "'" + o.kcal + "')";

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(TipoExercicio o) {
        String sql = "UPDATE tipoExercicio SET "
                + "descricao='" + o.descricao + "',"
                + "subDescricao='" + o.subDescricao + "',"
                + "kcal='" + o.kcal + "',"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            if (tipoExercicio.isEmpty()) {
                return null;
            }
            return tipoExercicio;
        } catch (SQLException ex) {
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            if (tipoExercicio.isEmpty()) {
                return null;
            }
            return tipoExercicio;
        } catch (SQLException ex) {
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TipoExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Descricao";
        cabecalho[2] = "SubDescricao";
        cabecalho[3] = "Kcal";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM exercicio "
                    + "WHERE DESCRICAO ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][2];

        } catch (Exception e) {
            System.out.println("Erro ao consultar Exercício: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "exercicio WHERE "
                    + "DESCRICAO ILIKE '%" + criterio + "%'");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getString("subDescricao");
                dadosTabela[lin][3] = resultadoQ.getString("kcal");
                lin++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular tabela");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(23);
                    break;
                case 1:
                    column.setPreferredWidth(200);
                    break;
                case 2:
                    column.setPreferredWidth(200);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;

            }
        }
    }

}
