package dao;

import entidade.Consumo;
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

public class ConsumoDAO implements IDAOT<Consumo> {

    ResultSet resultadoQ = null;

    @Override
    public Integer salvar(Consumo o) {
        String sql = "INSERT INTO consumo VALUES("
                + "default, "
                + "'" + o.descricao + "',"
                + "'" + o.refeicao + "',"
                + "'" + o.quantidade + "',"
                + "'" + o.porcaoConsumida + "',"
                + "'" + o.data + "',"
                + "'" + o.horario + "',"
                + "'" + o.reacaoCorporal + "',"
                + "'" + o.status + "') returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(Consumo o) {
        String sql = "UPDATE consumo SET "
                + "descricao='" + o.descricao + "',"
                + "refeicao='" + o.refeicao + "',"
                + "quantidade='" + o.quantidade + "',"
                + "porcaoConsumida='" + o.porcaoConsumida + "',"
                + "data='" + o.data + "',"
                + "tempo='" + o.horario + "',"
                + "reacaoCorporal='" + o.reacaoCorporal + "',"
                + "status='" + o.status + "'"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "UPDATE consumo SET status = 'inativo' WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Consumo> consultarTodos() {
        String sql = "SELECT * FROM consumo WHERE status <> 'inativo'";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> consumo = new ArrayList<>();
            while (result.next()) {
                consumo.add(Consumo.from(result));
            }
            if (consumo.isEmpty()) {
                return null;
            }
            return consumo;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Consumo> consultar(String criterio) {
        String sql = "SELECT * FROM consumo WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Consumo> consumo = new ArrayList<>();
            while (result.next()) {
                consumo.add(Consumo.from(result));
            }
            if (consumo.isEmpty()) {
                return null;
            }
            return consumo;
        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Consumo consultar(int id) {
        String sql = "SELECT * FROM consumo WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Consumo.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[8];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Refeição";
        cabecalho[3] = "Data";
        cabecalho[4] = "Horário";
        cabecalho[5] = "Reação Corporal";
        cabecalho[6] = "Quantidade";
        cabecalho[7] = "Porção Consumida";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM consumo "
                    + "WHERE nome ILIKE '%" + criterio + "%' "
                    + "AND status = 'ativo'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][8];

        } catch (SQLException e) {
            System.out.println("Erro ao consultar Consumo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM consumo "
                    + "WHERE nome ILIKE '%" + criterio + "%' "
                    + "AND status = 'ativo'");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getString("refeicao");
                dadosTabela[lin][3] = resultadoQ.getString("data");
                dadosTabela[lin][4] = resultadoQ.getString("horario");
                dadosTabela[lin][5] = resultadoQ.getString("reacaoCorporal");
                dadosTabela[lin][6] = resultadoQ.getString("quantidade");
                dadosTabela[lin][7] = resultadoQ.getString("porcaoConsumida");
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
                    column.setPreferredWidth(21);
                    break;
                case 1:
                    column.setPreferredWidth(84);
                    break;
                case 2:
                    column.setPreferredWidth(51);
                    break;
                case 3:
                    column.setPreferredWidth(51);
                    break;
                case 4:
                    column.setPreferredWidth(51);
                    break;
                case 5:
                    column.setPreferredWidth(51);
                    break;
                case 6:
                    column.setPreferredWidth(51);
                    break;
                case 7:
                    column.setPreferredWidth(51);
                    break;
            }
        }
    }
}
