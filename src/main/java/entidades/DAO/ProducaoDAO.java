package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Producao;
import model.Produto;
import model.Safra;
import model.Cliente;

public class ProducaoDAO {

    private ResultSet resultadoQ = null;

    public void salvar(Producao p) throws SQLException {
        String sql = ""
                + "INSERT INTO producao (id_produto, id_safra, id_cliente, data_inicio, data_fim, quantidade, preco_unitario) VALUES ("
                + p.getProduto().getId() + ","
                + p.getSafra().getId() + ","
                + p.getCliente().getId() + ","
                + "'" + p.getDataInicio() + "',"
                + "'" + p.getDataFim() + "',"
                + p.getQuantidade() + ","
                + p.getPrecoUnitario()
                + ")";
        System.out.println("sql: " + sql);
        ConexaoBD.executeUpdate(sql);
    }

    public void editar(Producao p) throws SQLException {
        String sql = ""
                + "UPDATE producao SET "
                + "id_produto = " + p.getProduto().getId() + ","
                + "id_safra = " + p.getSafra().getId() + ","
                + "id_cliente = " + p.getCliente().getId() + ","
                + "data_inicio = '" + p.getDataInicio() + "',"
                + "data_fim = '" + p.getDataFim() + "',"
                + "quantidade = " + p.getQuantidade() + ","
                + "preco_unitario = " + p.getPrecoUnitario() + " "
                + "WHERE id_producao = " + p.getId();
        System.out.println("sql: " + sql);
        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Producao> recuperarTodos() throws SQLException {
        ArrayList<Producao> lista = new ArrayList();

        String sql = "SELECT * FROM producao";
        resultadoQ = ConexaoBD.executeQuery(sql);
        while (resultadoQ.next()) {
            Producao p = new Producao();
            p.setId(resultadoQ.getInt("id_producao"));

            Produto produto = new Produto();
            produto.setId(resultadoQ.getInt("id_produto"));
            p.setProduto(produto);

            Safra safra = new Safra();
            safra.setId(resultadoQ.getInt("id_safra"));
            p.setSafra(safra);

            Cliente cliente = new Cliente();
            cliente.setId(resultadoQ.getInt("id_cliente"));
            p.setCliente(cliente);

            p.setDataInicio(resultadoQ.getString("data_inicio"));
            p.setDataFim(resultadoQ.getString("data_fim"));
            p.setQuantidade(resultadoQ.getDouble("quantidade"));
            p.setPrecoUnitario(resultadoQ.getDouble("preco_unitario"));

            lista.add(p);
        }
        return lista;
    }

    public Producao recuperarUm(int id) throws SQLException {
        String sql = "SELECT * FROM producao WHERE id_producao = " + id;
        resultadoQ = ConexaoBD.executeQuery(sql);
        if (resultadoQ.next()) {
            Producao p = new Producao();
            p.setId(resultadoQ.getInt("id_producao"));

            Produto produto = new Produto();
            produto.setId(resultadoQ.getInt("id_produto"));
            p.setProduto(produto);

            Safra safra = new Safra();
            safra.setId(resultadoQ.getInt("id_safra"));
            p.setSafra(safra);

            Cliente cliente = new Cliente();
            cliente.setId(resultadoQ.getInt("id_cliente"));
            p.setCliente(cliente);

            p.setDataInicio(resultadoQ.getString("data_inicio"));
            p.setDataFim(resultadoQ.getString("data_fim"));
            p.setQuantidade(resultadoQ.getDouble("quantidade"));
            p.setPrecoUnitario(resultadoQ.getDouble("preco_unitario"));

            return p;
        }
        return null;
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM producao WHERE id_producao = " + id;
        System.out.println("sql: " + sql);
        ConexaoBD.executeUpdate(sql);
    }
}