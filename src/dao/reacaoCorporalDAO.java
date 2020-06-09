package dao;

import entidade.ReacaoCorporal;
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

public class ReacaoCorporalDAO implements IDAOT<ReacaoCorporal> {

    ResultSet resultadoQ = null;

    @Override
    public Integer salvar(ReacaoCorporal o) {
        String sql = "INSERT INTO reacaoCorporal VALUES("
                + "default, "
                + "'" + o.nome + "',"
                + "'" + o.status + "') returning id";

        try {
            ResultSet resultSet = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean atualizar(ReacaoCorporal o) {
        String sql = "UPDATE reacaoCorporal SET "
                + "nome='" + o.nome + "',"
                + "status='" + o.status + "'"
                + "WHERE id= " + o.id;

        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(int id) {
        String sql = "UPDATE reacaoCorporal SET status = 'inativo' WHERE id=" + id;
        try {
            ConexaoBD.getInstance().getConnection().createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<ReacaoCorporal> consultarTodos() {
        // poderia ter usado um boolean, poderia, ma fz oq né
        // ativo: true or false
        String sql = "SELECT * FROM reacaoCorporal WHERE status <> 'inativo'";
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<ReacaoCorporal> reacaoCorporal = new ArrayList<>();
            while (result.next()) {
                reacaoCorporal.add(ReacaoCorporal.from(result));
            }
            if (reacaoCorporal.isEmpty()) {
                return null;
            }
            return reacaoCorporal;
        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<ReacaoCorporal> consultar(String criterio) {
        String sql = "SELECT * FROM reacaoCorporal WHERE " + criterio;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            ArrayList<ReacaoCorporal> reacaoCorporal = new ArrayList<>();
            while (result.next()) {
                reacaoCorporal.add(ReacaoCorporal.from(result));
            }
            if (reacaoCorporal.isEmpty()) {
                return null;
            }
            return reacaoCorporal;
        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ReacaoCorporal consultar(int id) {
        String sql = "SELECT * FROM reacaoCorporal WHERE id=" + id;
        try {
            ResultSet result = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);
            if (result.next()) {
                return ReacaoCorporal.from(result);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReacaoCorporalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[2];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM reacaoCorporal "
                    + "WHERE nome ILIKE '%" + criterio + "%' AND status = 'ativo'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][2];

        } catch (Exception e) {
            System.out.println("Erro ao consultar Reação Corporal: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "reacaoCorporal WHERE "
                    + "nome ILIKE '%" + criterio + "%' status = 'ativo'");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
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
                    column.setPreferredWidth(70);
                    break;
                case 1:
                    column.setPreferredWidth(351);
                    break;
            }
        }
    }
}
