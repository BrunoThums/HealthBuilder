package dao;

import entidade.Exercicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import util.ConexaoBD;
import static util.Formatacao.formatString;
import util.IDAOT;

public class ExercicioDAO implements IDAOT<Exercicio> {

    ResultSet resultadoQ = null;

    @Override
    public Integer salvar(Exercicio o) {
        String sql = "INSERT INTO exercicio VALUES("
                + "default, "
                + "'" + o.data + "',"
                + "" + o.tipoExercicio + "," //°ext nome
                + "" + o.reacaoCorporal + ","//ext nome
                + "'" + o.tempo + "',"
                + "'" + o.intensidade + "',"
                + "" + o.kcalTotal + ","
                + "'" + o.status + "') returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(Exercicio o) {
        String sql = "UPDATE exercicio SET "
                + "data='" + o.data + "',"
                + "tipoExercicio_id=" + o.tipoExercicio + ","//ext nome
                + "reacaoCorporal_id=" + o.reacaoCorporal + ","//ext nome
                + "tempo='" + o.tempo + "',"
                + "intensidade='" + o.intensidade + "',"
                + "kcalTotal=" + o.kcalTotal + ","
                + "status='" + o.status + "' "
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "UPDATE exercicio SET status = 'inativo' WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Exercicio> consultarTodos() {
        String sql = "SELECT * FROM exercicio WHERE status <> 'inativo'";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Exercicio> exercicio = new ArrayList<>();
            while (result.next()) {
                exercicio.add(Exercicio.from(result));
            }
            if (exercicio.isEmpty()) {
                return null;
            }
            return exercicio;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Exercicio> consultar(String criterio) {
        String sql = "SELECT * FROM exercicio WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<Exercicio> exercicio = new ArrayList<>();
            while (result.next()) {
                exercicio.add(Exercicio.from(result));
            }
            if (exercicio.isEmpty()) {
                return null;
            }
            return exercicio;
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Exercicio consultar(int id) {
        String sql = "SELECT * FROM exercicio WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return Exercicio.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String pesquisa(String criterio, String dataIni, String dataFim, String status) {
        String pesquisa = " FROM "
                + "exercicio e, "
                + "reacaocorporal r, "
                + "tipoexercicio t "
                + "WHERE e.tipoexercicio_id = t.id "
                + "AND e.reacaocorporal_id = r.id "
                + "AND e.status = '"+status+"' ";
        if (criterio != null && !criterio.isEmpty()) {
            pesquisa += "AND ("
                    + "t.descricao ILIKE '%" + criterio + "%'"
                    + "OR "
                    + "r.nome ILIKE '%" + criterio + "%'"
                    + ");";
        }
        if ((dataIni != null && !dataIni.isEmpty()) && (dataFim != null && !dataFim.isEmpty())) {
            pesquisa += " AND data BETWEEN '" + dataIni + "' and '" + dataFim + "' ";
        }
        /*if ((variaveis != null && !variaveis.isEmpty()) &&(ordem!=null && !ordem.isEmpty())) {
            switch (variaveis) {
                case "tipoexercicio" -> pesquisa += "ORDER BY t.descricao "+ordem;
                case "kcal" -> pesquisa += "ORDER BY e.kcalTotal "+ordem;
                case "reacaocorporal" -> pesquisa += "ORDER BY r.nome "+ordem;
                case "tempo" -> pesquisa += "ORDER BY e.tempo "+ordem;
                case "data" -> pesquisa += "ORDER BY e.data "+ordem;
            }
        }*/
        return pesquisa;
    }

    public void popularTabela(JTable tabela, String criterio, String dataIni, String dataFim,String status/*, String variaveis, String ordem*/) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Data";
        cabecalho[2] = "Tipo de Exercício";
        cabecalho[3] = "Reacao Corporal";
        cabecalho[4] = "Tempo";
        cabecalho[5] = "Kcal Total";
        cabecalho[6] = "Intensidade";

        // cria matriz de acordo com nº de registros da tabela
        try {
            System.out.println("SQL: " + "SELECT count(*) " + pesquisa(criterio, dataIni, dataFim,status/*, variaveis, ordem*/));
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) " + pesquisa(criterio, dataIni, dataFim,status/*, variaveis, ordem*/));

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][7];

        } catch (SQLException e) {
            System.out.println("Erro ao consultar Exercício: " + e);
            e.printStackTrace(System.err);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * " + pesquisa(criterio, dataIni, dataFim,status/*, variaveis, ordem*/));

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("data");
                dadosTabela[lin][2] = resultadoQ.getString("descricao");
                dadosTabela[lin][3] = resultadoQ.getString("nome");
                dadosTabela[lin][4] = resultadoQ.getString("tempo");
                dadosTabela[lin][5] = resultadoQ.getString("kcalTotal");
                dadosTabela[lin][6] = resultadoQ.getString("intensidade");
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
                case 0 ->
                    column.setPreferredWidth(20);
                case 1 ->
                    column.setPreferredWidth(75);
                case 2 ->
                    column.setPreferredWidth(90);
                case 3 ->
                    column.setPreferredWidth(90);
                case 4 ->
                    column.setPreferredWidth(70);
                case 5 ->
                    column.setPreferredWidth(70);
                case 6 ->
                    column.setPreferredWidth(58);
            }
        }
    }

}
