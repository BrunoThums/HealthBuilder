package dao;

import entidade.Alimento;
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

public class AlimentoDAO implements IDAOT<Alimento> {

    ResultSet resultadoQ = null;

    @Override
    public Integer salvar(Alimento o) {
        String sql = "INSERT INTO alimento VALUES("
                + "default, "
                + "'" + o.descricao + "',"
                + "" + o.porcao + ","
                + "" + o.valorEner + ","
                + "" + o.proteina + ","
                + "" + o.acucares + ","
                + "" + o.gordTrans + ","
                + "" + o.gordSaturada + ","
                + "" + o.sodio + ","
                + "'" + o.status + "') returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(Alimento o) {
        String sql = "UPDATE alimento SET "
                + "descricao='" + o.descricao + "',"
                + "porcao=" + o.porcao + ","
                + "valorEnergetico=" + o.valorEner + ","
                + "proteina=" + o.proteina + ","
                + "acucares=" + o.acucares + ","
                + "gorduraTrans=" + o.gordTrans + ","
                + "gorduraSaturada=" + o.gordSaturada + ","
                + "sodio=" + o.sodio + ","
                + "status='" + o.status + "' "
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "UPDATE alimento SET status = 'inativo' WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Alimento> consultarTodos() {
        String sql = "SELECT * FROM alimento WHERE status <> 'inativo'";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Alimento> tipoAlimento = new ArrayList<>();
            while (result.next()) {
                tipoAlimento.add(Alimento.from(result));
            }
            if (tipoAlimento.isEmpty()) {
                return null;
            }
            return tipoAlimento;
        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Alimento> consultar(String criterio) {
        String sql = "SELECT * FROM alimento WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Alimento> tipoAlimento = new ArrayList<>();
            while (result.next()) {
                tipoAlimento.add(Alimento.from(result));
            }
            if (tipoAlimento.isEmpty()) {
                return null;
            }
            return tipoAlimento;
        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Alimento consultar(int id) {
        String sql = "SELECT * FROM alimento WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Alimento.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
       
    private String pesquisa(String criterio, String status){
        String pesquisa = "FROM alimento "
                    + "WHERE descricao ILIKE '%" + criterio + "%' "
                    + "AND status = '"+status+"'";
        return pesquisa;
    }

    public void popularTabela(JTable tabela, String criterio, String status) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[9];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Porção";
        cabecalho[3] = "Kcal";
        cabecalho[4] = "Proteína";
        cabecalho[5] = "Açúcares";
        cabecalho[6] = "G. Trans";
        cabecalho[7] = "G. Saturada";
        cabecalho[8] = "Sódio";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "+pesquisa(criterio,status));

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][9];

        } catch (SQLException e) {
            System.out.println("Erro ao consultar Alimento: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "+pesquisa(criterio,status));

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getInt("porcao");
                dadosTabela[lin][3] = resultadoQ.getInt("valorEnergetico");
                dadosTabela[lin][4] = resultadoQ.getInt("proteina");
                dadosTabela[lin][5] = resultadoQ.getInt("acucares");
                dadosTabela[lin][6] = resultadoQ.getInt("gorduraTrans");
                dadosTabela[lin][7] = resultadoQ.getInt("gorduraSaturada");
                dadosTabela[lin][8] = resultadoQ.getInt("sodio");
                lin++;
            }
        } catch (SQLException e) {
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
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            TableColumn column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(25);
                    break;
                case 1:
                    column.setPreferredWidth(71);
                    break;
                case 2:
                    column.setPreferredWidth(45);
                    break;
                case 3:
                    column.setPreferredWidth(45);
                    break;
                case 4:
                    column.setPreferredWidth(45);
                    break;
                case 5:
                    column.setPreferredWidth(45);
                    break;
                case 6:
                    column.setPreferredWidth(45);
                    break;
                case 7:
                    column.setPreferredWidth(45);
                    break;
                case 8:
                    column.setPreferredWidth(45);
                    break;

            }
        }
    }
}
