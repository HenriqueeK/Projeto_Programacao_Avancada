/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TipoCusto;

/**
 *
 * @author henrique
 */
public class TipoCustoDAO {
    
   
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(TipoCusto t) throws SQLException {
        String sql = ""
                + "INSERT INTO tipo_custo (descricao, preco_padrao) VALUES ("
                + "'" + t.getDescricao() + "',"
                + "'" + t.getPrecoPadrao() + "',"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
    
    public void editar(TipoCusto t) throws SQLException {
        String sql = ""
                + "UPDATE safra SET "
                + "descricao = '" + t.getDescricao() + "',"
                + "preco_padrao = '" + t.getPrecoPadrao() + "',"
                + "WHERE id_tipo_custo = " + t.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<TipoCusto> recuperarTodos() throws SQLException {
        ArrayList<TipoCusto> tipoCusto = new ArrayList();
        
        String sql = ""
                + "SELECT * FROM safra ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            TipoCusto t = new TipoCusto();

            t.setId(resultadoQ.getInt("id_tipo_custo"));
            t.setDescricao(resultadoQ.getString("descricao"));
            t.setPrecoPadrao(resultadoQ.getDouble("preco_padrao"));

            tipoCusto.add(t);
        }

        return tipoCusto;
    }
    
    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM safra WHERE id_safra = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
    
    public TipoCusto recuperarUm(int id) throws SQLException {

        String sql = ""
                + "SELECT * FROM tipo_custo WHERE id_tipo_custo = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            TipoCusto t = new TipoCusto();

            t.setId(resultadoQ.getInt("id_tipo_custo"));
            t.setDescricao(resultadoQ.getString("descricao"));
            t.setPrecoPadrao(resultadoQ.getDouble("preco_padrao"));

            return t;
        }

        return null;
    }
    
}
