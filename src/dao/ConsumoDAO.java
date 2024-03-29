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
                + "'" + o.alimento_id + "',"
                + "'" + o.refeicao + "',"
                + "" + o.quantidade + ","
                + "" + o.porcaoConsumida + ","
                + "'" + o.data + "',"
                + "'" + o.horario + "',"
                + "" + o.kcalTotal + ","
                + "" + o.reacaoCorporal_id + ","
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
                + "alimento_id='" + o.alimento_id + "',"
                + "refeicao='" + o.refeicao + "',"
                + "quantidade=" + o.quantidade + ","
                + "porcaoConsumida=" + o.porcaoConsumida + ","
                + "data='" + o.data + "',"
                + "horario='" + o.horario + "',"
                + "kcalTotal=" + o.kcalTotal + ","
                + "reacaoCorporal_id=" + o.reacaoCorporal_id + ","
                + "status='" + o.status + "' "
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
    private String pesquisa(String criterio, String dataIni, String dataFim, String status, String variavel, String ordem) {
        String pesquisa = "FROM"
                + " consumo c,"
                + " reacaocorporal r,"
                + " alimento a"
                + " WHERE c.reacaocorporal_id = r.id"
                + " AND c.alimento_id = a.id"
                + " AND c.status = '"+status+"' ";
        if (criterio != null && !criterio.isEmpty()) {
            pesquisa += "AND ("
                    + "a.descricao ILIKE '%" + criterio + "%'"
                    + "OR "
                    + "r.nome ILIKE '%" + criterio + "%'"
                    + ");";
        }
        if ((dataIni != null && !dataIni.isEmpty()) && (dataFim != null && !dataFim.isEmpty())) {
            pesquisa += " AND data BETWEEN '" + dataIni + "' and '" + dataFim + "' ";
        }
        if ((variavel != null && !variavel.isEmpty()) && (ordem != null && !ordem.isEmpty())){
            switch(variavel){
                case "alimento" -> pesquisa+= " ORDER BY a.descricao "+ordem;
                case "reacao" -> pesquisa+= " ORDER BY r.nome "+ordem;
                case "data" -> pesquisa+= " ORDER BY data "+ordem;
                case "kcal" -> pesquisa+= " ORDER BY c.KcalTotal "+ordem;
            }
        }
        return pesquisa;
    }

    public void popularTabela(JTable tabela, String criterio, String dataIni, String dataFim, String status, String variavel, String ordem) {
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
                    + "SELECT count(*) "+pesquisa(criterio, dataIni, dataFim, status, null, null));

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][8];

        } catch (SQLException e) {
            System.out.println("Erro ao consultar Consumo: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "+pesquisa(criterio, dataIni, dataFim, status, variavel, ordem));

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getString("refeicao");
                dadosTabela[lin][3] = resultadoQ.getString("data");
                dadosTabela[lin][4] = resultadoQ.getString("horario");
                dadosTabela[lin][5] = resultadoQ.getString("nome");
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
                case 0 -> column.setPreferredWidth(21);
                case 1 -> column.setPreferredWidth(84);
                case 2 -> column.setPreferredWidth(51);
                case 3 -> column.setPreferredWidth(51);
                case 4 -> column.setPreferredWidth(51);
                case 5 -> column.setPreferredWidth(51);
                case 6 -> column.setPreferredWidth(51);
                case 7 -> column.setPreferredWidth(51);
            }
        }
    }
}
